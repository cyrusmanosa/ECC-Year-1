/*
データベース演習I 課題8
クラス：IE1A01
制作者：文家俊
作成日：2022/12/01
*/


/*
  外部結合を使うことで、データが正しく登録できているか確認できるようになりました。
  まずは、従業員情報から調査を進めていきましょう。
*/

-- 問１：全従業員の上司の名前を取得してください。
SELECT  E.EMP_NO,  E.ENAME,  M.EMP_NO,  M.ENAME
FROM  EMPLOYEE AS E
LEFT JOIN   EMPLOYEE AS M  ON ( E.MGR_NO = M.EMP_NO)
ORDER BY E.EMP_NO ;

/*
  小林友治は従業員のトップにあたる人なので、上司がいないのは正しいです。
  しかし、山名文和さんと秋山賢太さんに関しては上司が存在しない状態はまずいので
  もう少し調査を行います。
*/

-- 問２：店舗表をさらに結合して、全従業員の勤務店舗を表示してください。
SELECT  M.WORK_STORE, S.SNAME, M.ENAME, E.EMP_NO,  E.ENAME
FROM EMPLOYEE AS M
LEFT JOIN STORE AS S ON ( M.WORK_STORE = S.STORE_NO )
LEFT JOIN EMPLOYEE AS E ON ( M.MGR_NO = E.EMP_NO )
ORDER BY M.WORK_STORE;

/*
  山名文和さんと秋山賢太さんはデータ登録時のミスによるものでした。
  正しい情報に修正したいと思います。
*/

-- 問３：以下の内容で従業員の情報を更新して下さい。※SQL文は２つになります。
UPDATE EMPLOYEE
SET JOB = '店長',RANK_POINT = '1200',WORK_STORE  = '006',MGR_NO = '00001'
WHERE EMP_NO = '00018';

UPDATE EMPLOYEE
SET JOB = '調理', RANK_POINT = '100', WORK_STORE = '006', MGR_NO ='00018'
WHERE EMP_NO = '00019';

-- 問４：２名の従業員情報を表示してください。
--       正しく更新されていればトランザクションの確定をしてください。
SELECT EMP_NO, ENAME, JOB, RANK_POINT, WORK_STORE, MGR_NO
FROM EMPLOYEE
WHERE EMP_NO >= '00018';

COMMIT;
/*
  従業員の情報は修正することが出来ました。
  次に、商品情報が正しく登録できているか調査を進めていきます。
*/

-- 問５：カテゴリーがピザである商品情報を試作品も含めて表示してください。
SELECT P.PRODUCT_NO, PNAME, P.PRICE FROM PRODUCT AS P
WHERE P.CATEGORY = 'ピザ'
UNION
SELECT R.PROTOTYPE_NO,R.PROTONAME,R.PRICE FROM PROTOTYPE AS R;

/*
  以前、商品名称を変更したBBQチキンとBBQシーフードの商品を調査します。
*/

-- 問６：商品名にBBQが含まれる商品のレシピ情報を表示してください。

SELECT P.PRODUCT_NO, P.PNAME , M.MNAME , R.QUANTITY
FROM PRODUCT AS P 
LEFT JOIN RECIPE AS R
ON P.PRODUCT_NO = R.PRODUCT_NO
LEFT JOIN MATERIAL AS M 
ON M.MATERIAL_NO = R.MATERIAL_NO
WHERE P.PNAME LIKE '%BBQ%';


/*
  BBQシーフードのレシピ情報が取得できませんでした。
  レシピ情報が正しいかチェックして原因を探りたいと思います。
*/

-- 問７：レシピ情報を元に結合を行い、商品が存在しないレシピ情報の確認をしてください。

SELECT R.PRODUCT_NO, P.PNAME , M.MNAME , R.QUANTITY
FROM PRODUCT AS P
RIGHT JOIN RECIPE AS R ON P.PRODUCT_NO = R.PRODUCT_NO
LEFT JOIN MATERIAL AS M ON M.MATERIAL_NO = R.MATERIAL_NO
WHERE P.PNAME IS NULL;

/*
  調査を進めたところ、レシピ表には試作品のレシピ情報も管理されており
  商品表との結合では、結合できないレシピが存在していました。
*/

-- 問８：試作品表との結合を行い、試作品のレシピ情報を表示してください。

SELECT P.PROTOTYPE_NO, P.PROTONAME , M.MNAME , R.QUANTITY
FROM PROTOTYPE AS P
LEFT JOIN RECIPE AS R ON P.PROTOTYPE_NO = R.PRODUCT_NO
LEFT JOIN MATERIAL AS M ON M.MATERIAL_NO = R.MATERIAL_NO;


/*
  前回ＢＢＱシーフードを試作品表から商品表にデータを移し替えた時に
  レシピの情報を登録し忘れていました。
*/

-- 問９：レシピ表の更新を行い、BBQシーフードのレシピ情報の結合が正しくされるようにして下さい。
--       データの内容に問題が無ければトランザクションの確定をして下さい。

UPDATE RECIPE SET PRODUCT_NO = '0007' WHERE PRODUCT_NO = '9003';
SELECT R.PRODUCT_NO,P.PNAME,M.MNAME,R.QUANTITY
FROM RECIPE  AS R
LEFT JOIN PRODUCT AS P ON (P.PRODUCT_NO = R.PRODUCT_NO)
LEFT JOIN MATERIAL AS M ON (M.MATERIAL_NO = R.MATERIAL_NO)
WHERE R.PRODUCT_NO = '0007';

COMMIT;

