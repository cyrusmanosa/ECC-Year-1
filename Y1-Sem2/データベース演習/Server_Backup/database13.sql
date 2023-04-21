/*
データベース演習I 課題13
クラス：SK1A04
制作者：文家俊
作成日：2023/02/02
*/


/*
  データの検索処理を高速化するためにインデックスの定義を行います。
  データベース定義書を元にインデックスの作成をして下さい。
*/

-- 問１：店舗表シートをもとに、定休日にインデックスを作成してください。
CREATE INDEX STO_STA_IDX ON STORE ( STATUS );
SHOW INDEX FROM STORE;

-- 問２：新従業員表シートをもとに、必要なインデックスを作成してください。
CREATE INDEX EMP_HIR_IDX ON EMPLOYEE ( HIREDATE );
CREATE INDEX EMP_SAL_IDX ON EMPLOYEE ( SALARY );

SHOW INDEX FROM EMPLOYEE;

-- 問３：サイズ表に外部キー制約を設定しようとするとエラーが発生します。
--      原因を探し出して対応をして下さい。

CREATE INDEX PRODUCT_CATEGORY_INX ON product ( CATEGORY );

-- 問４：改めて、サイズ表シートをもとに外部キー制約を設定してください。
ALTER TABLE SIZE ADD FOREIGN KEY ( CATEGORY ) REFERENCES product ( CATEGORY );

SHOW CREATE TABLE SIZE;
/*
  レシピを確認する時に、毎回テーブルを結合するSQLを書くのは大変なので
  レシピビューを作成して、簡単に情報を取得できるようにします。
*/

-- 問５：以下の情報を持つ、レシピビュー(RECIPEVIEW)を作成してください。
CREATE VIEW RECIPEVIEW AS 
	SELECT P.PRODUCT_NO,P.PNAME,M.MNAME,R.QUANTITY
    FROM PRODUCT AS P
    JOIN RECIPE AS R ON ( P.PRODUCT_NO = R.PRODUCT_NO )
    JOIN MATERIAL AS M ON ( R.MATERIAL_NO = M.MATERIAL_NO );
    
SHOW COLUMNS FROM RECIPEVIEW;

-- 問６：レシピビューから夏野菜ピザの情報を取得してください。
SELECT * FROM RECIPEVIEW WHERE PRODUCT_NO = '0009';

/*
  従業員表にはセキュリティ度の高い情報が管理されています。
  一般ユーザ向けに情報を限定したビューを作成することにしました。
*/

-- 問７：以下の情報を持つ、従業員ビューを作成してください。
CREATE VIEW EMPVIEW AS
	SELECT S.SNAME , J.JNAME , R.RANK_NAME , E.ENAME
	FROM STORE AS S
	JOIN EMPLOYEE AS E ON ( S.STORE_NO = E.WORK_STORE)
	JOIN JOB AS J ON ( J.JOB_NO = E.JOB_NO )
	JOIN RANKPOINT AS R ON ( E.RANK_POINT >= R.LO_POINT AND E.RANK_POINT < R.HI_POINT );


SHOW COLUMNS FROM EMPVIEW;
-- 問８：従業員ビューから尼崎店で勤務している従業員情報を取得してください。

SELECT * FROM EMPVIEW WHERE SNAME = '尼崎店';

