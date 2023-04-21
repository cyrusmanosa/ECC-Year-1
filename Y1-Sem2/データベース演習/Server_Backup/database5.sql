/*
データベース演習I 課題5
クラス：SK1A04
制作者：文家俊
作成日：2022/10/27
*/


/*
  来月から試作していた商品「バーベキューシーフード」を店舗で売り出すことになりました。
  新商品の情報を商品表に登録していきましょう。
*/

SELECT DATE_FORMAT(NOW(),'%y/%m/%e %H:%i:%s') 現在日付  FROM DUAL;
-- 問１：現在日付を以下フォーマットで表示してください。
--       ※表示時刻は実行タイミングで変わります。


-- 問２：試作品表(PROTOTYPE)から試作品の情報を表示してください。
SELECT * FROM PROTOTYPE;

-- 問３：商品表にバーベキューシーフードの情報を登録します。
--       商品コードは「0007」にしてその他の情報は試作品表と同じ内容を挿入してください。
--       試作品表から対象の商品を削除して、双方の情報が正しければトランザクションの確定をして下さい。
INSERT INTO PRODUCT(PRODUCT_NO,PNAME,CATEGORY, PRICE)
VALUES ('0007','バーベキューシーフード','ピザ','3000');

SELECT * FROM PRODUCT
WHERE PRODUCT_NO='0007';

DELETE FROM PROTOTYPE
WHERE PROTOTYPE_NO='9003';

SELECT * FROM PROTOTYPE;

COMMIT;
-- 問４：メニューを修正するため、9文字を超える商品名を調べてください。
SELECT PRODUCT_NO,PNAME FROM PRODUCT
WHERE CHAR_LENGTH(PNAME) >= 9;

-- 問５：新商品の名称が長いため、全商品のバーベキューをBBQに名称変更します。
--       全商品の更新を行い、トランザクションの確定をして下さい。
UPDATE PRODUCT SET PNAME = REPLACE(PNAME,'バーベキュー','BBQ');

SELECT * FROM PRODUCT
WHERE  PNAME  LIKE  '%BBQ%';

COMMIT;

-- 問６：新商品導入記念で全商品の15%割引キャンペーンを実施します。商品の価格を85%で表示してください。
--       価格の小数点以下は切捨ててフォーマット処理してください。
SELECT CATEGORY,PNAME,FORMAT(TRUNCATE(PRICE*85/100,0),0) AS 'PRICE'
FROM PRODUCT
ORDER BY PRODUCT_NO;
/*
  阿倍野店では、新商品導入による多忙化に備えてアルバイトを募集していました。
  従業員の情報を更新していきましょう。
*/

-- 問７：２週間前から新しいアルバイトが阿倍野店で勤務しています。
--       従業員表にアルバイトのデータを登録してトランザクションの確定をして下さい。
INSERT INTO EMPLOYEE(EMP_NO,ENAME,BIRTHDAY,TEL,ADDRESS,HIREDATE,JOB,RANK_POINT,SALARY,WORK_STORE,MGR_NO)
VALUES ('00017','松村沙友理','1992-8-27','0332229876','東京都港区南青山１―２４',DATE_ADD( NOW(), INTERVAL -14 DAY ),'配達','0','850','005','00016');

SELECT * FROM EMPLOYEE 
WHERE EMP_NO='00017';

COMMIT;

-- 問８：松村さんに阿倍野店で勤務している従業員の役職などを伝えます。
--       従業員の情報を取得してください。なお、電話番号は下４桁のみ表示させてください。
SELECT ENAME,CONCAT('XXXXXXX',SUBSTR(TEL,7,4)) AS TEL,JOB,CONCAT( HIREDATE,' 入社') AS 'HIREDATE'
FROM EMPLOYEE
WHERE WORK_STORE = '005';

-- 問９：阿倍野店に勤務している従業員の在籍日数を調べてください。
SELECT ENAME,DATEDIFF(NOW(),HIREDATE) AS '在籍日数'
FROM EMPLOYEE
WHERE WORK_STORE='005';

-- 問１０：在籍日数が30日未満の研修期間のアルバイトにランクポイントを付与します。
--         対象のアルバイトに対してランクポイントを100加算してください。
--         正しく更新されていればトランザクションの確定をして下さい。
UPDATE EMPLOYEE SET RANK_POINT = '100'
WHERE DATEDIFF(NOW(),HIREDATE) < 30;

SELECT EMP_NO,ENAME,RANK_POINT FROM EMPLOYEE 
WHERE RANK_POINT = '100';
