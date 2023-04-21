/*
データベース演習I 課題9
クラス：SK1A04
制作者：文家俊
作成日：2022/12/15
*/


/*
  副問い合わせを使うことで、一度SELECTを発行してその結果の値を使い
  さらにSELECTやUPDATEを実行することが出来るようになります。
  この性質を利用することで集計関数を使って求めた結果に対してさらに別の集計関数を使用出来ます。
*/

-- 問１：勤務店舗ごとの最大給与の中から最も少ない給与を求めてください。
SELECT MIN(SAL)FROM 
(SELECT MAX(SALARY) AS SAL FROM EMPLOYEE GROUP BY WORK_STORE) AS WS;

/*
  試作品の追加や新商品を商品表にデータ登録を行う際に副問い合わせを利用します。
*/

-- 問２：新商品の「ミックスジュース」を開発することになりました。
--       試作品表に新商品を登録して、データを表示してください。
INSERT INTO PROTOTYPE(PROTOTYPE_NO,PROTONAME,CATEGORY,PRICE)
VALUES('9003','ミックスジュース','ドリンク','200');

SELECT * FROM PROTOTYPE;

-- 問３：夏野菜ピザの商品価格を見直します。ギガミートと同じ金額に更新してください。

UPDATE PROTOTYPE 
SET PRICE = (SELECT PRICE FROM PRODUCT WHERE PNAME = 'ギガミート') 
WHERE PROTOTYPE_NO = '9002';

SELECT * FROM PROTOTYPE;

-- 問４：レシピ情報が存在している試作品を表示してください。
SELECT * FROM PROTOTYPE
WHERE CATEGORY = 'ピザ';

-- 問５：レシピ表に使われていない(存在していない)原材料の情報を取得してください。
SELECT * FROM MATERIAL AS M
WHERE NOT EXISTS 
( SELECT MATERIAL_NO FROM RECIPE AS R WHERE R.MATERIAL_NO = M.MATERIAL_NO);

-- 問６：原材料「ゴーダチーズ」を数量１でMAXチーズピザのレシピに追加してください。
INSERT RECIPE ( PRODUCT_NO , MATERIAL_NO , QUANTITY )
VALUES ('9001','00024','1');

SELECT * FROM RECIPE WHERE PRODUCT_NO = '9001';
/*
  試作品の「MAXチーズピザ」「夏野菜ピザ」を商品として販売することにしました。
  その為、正式な商品番号を割り当てる必要があります。

  仮商品番号│9001                 │9002
  商品名    │MAXチーズピザ        │夏野菜ピザ
  商品番号  │カテゴリーがピザの   │カテゴリーがピザの
            │商品番号の最大値＋１ │商品番号の最大値＋2
*/

-- 問７：上記情報を元に試作品番号を更新してください。
--       ※UPDATEを２回実行します。
UPDATE PROTOTYPE SET PROTOTYPE_NO = 
(SELECT LPAD( MAX(PRODUCT_NO) + 1, 4,'0') FROM PRODUCT WHERE CATEGORY = 'ピザ') 
WHERE PROTOTYPE_NO = '9001';

UPDATE PROTOTYPE SET PROTOTYPE_NO = 
(SELECT LPAD( MAX(PRODUCT_NO) + 2, 4,'0') FROM PRODUCT WHERE CATEGORY = 'ピザ') 
WHERE PROTOTYPE_NO = '9002';

SELECT * FROM PROTOTYPE;

-- 問８：２商品の新たな商品番号でレシピの商品番号も更新してください。
--       ※固定値でUPDATEを２回実行して構いません。
UPDATE RECIPE SET PRODUCT_NO = '0008' WHERE PRODUCT_NO = '9001';
UPDATE RECIPE SET PRODUCT_NO = '0009' WHERE PRODUCT_NO = '9002';

SELECT * FROM RECIPE WHERE  PRODUCT_NO  BETWEEN '0008'AND '0009';

-- 問９：２商品の情報を商品表に追加してください。
--       ※INSERT SELECT文で実行してください。
INSERT  INTO PRODUCT( PRODUCT_NO,  PNAME,  CATEGORY,  PRICE )
SELECT PROTOTYPE_NO , PROTONAME , CATEGORY , PRICE FROM PROTOTYPE
WHERE PROTOTYPE_NO = '0008';

INSERT  INTO PRODUCT( PRODUCT_NO,  PNAME,  CATEGORY,  PRICE )
SELECT PROTOTYPE_NO , PROTONAME , CATEGORY , PRICE FROM PROTOTYPE
WHERE PROTOTYPE_NO = '0009';

SELECT * FROM PRODUCT WHERE  PRODUCT_NO  BETWEEN '0008'AND '0009';

-- 問１０：不必要な試作品データを削除して、トランザクションの確定をして下さい。
DELETE FROM PROTOTYPE WHERE PROTOTYPE_NO in ('0008','0009');

SELECT * FROM PROTOTYPE;

COMMIT;

