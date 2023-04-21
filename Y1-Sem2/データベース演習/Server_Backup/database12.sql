/*
データベース演習I 課題12
クラス：SK1A04
制作者：文家俊
作成日：2023/01/26
*/


/*
  今回、新たに外部キー制約について学習しました。
  よりデータベースの安全性を高めるためにテーブル定義書を元に外部キー制約の追加をしましょう。
*/

-- 問１：車体管理表シートをもとに管理店舗に店舗表の店舗番号に対する
--      外部キー制約(FOREIGN KEY)制約を追加してください。
/*
	ALTER TABLE BIKE MODIFY BIKE_NO char(5) COLLATE utf8mb4_unicode_ci NOT NULL;
	ALTER TABLE BIKE MODIFY STORE_NO char(3) COLLATE utf8mb4_unicode_ci NOT NULL;
	ALTER TABLE BIKE ADD PRIMARY KEY (BIKE_NO);
	ALTER TABLE BIKE ADD KEY STORE_NO (STORE_NO);
*/
ALTER TABLE BIKE ADD FOREIGN KEY (STORE_NO)REFERENCES STORE (STORE_NO); 

SHOW CREATE TABLE BIKE;

-- 問２：新従業員表シートをもとに不足している外部キー制約(FOREIGN KEY)制約を追加してください。
/*
	ALTER TABLE EMPLOYEE MODIFY EMP_NO char(5) COLLATE utf8mb4_unicode_ci NOT NULL;
	ALTER TABLE EMPLOYEE ADD KEY WORK_STORE (WORK_STORE);
	ALTER TABLE EMPLOYEE ADD KEY JOB_NO (JOB_NO);
	ALTER TABLE EMPLOYEE ADD CHECK ((SALARY >= 0));
*/
ALTER TABLE EMPLOYEE ADD FOREIGN KEY (WORK_STORE) REFERENCES store (STORE_NO);
ALTER TABLE EMPLOYEE ADD FOREIGN KEY (JOB_NO)REFERENCES JOB (JOB_NO);

SHOW CREATE TABLE EMPLOYEE;

-- 問３：レシピ表シートをもとに必要な外部キー制約(FOREIGN KEY)制約を追加してください。
	/*
	ALTER TABLE RECIPE MODIFY PRODUCT_NO char(4) COLLATE utf8mb4_unicode_ci NOT NULL;
	ALTER TABLE RECIPE MODIFY MATERIAL_NO char(5) COLLATE utf8mb4_unicode_ci NOT NULL;
	ALTER TABLE RECIPE MODIFY QUANTITY int NOT NULL;
	ALTER TABLE RECIPE ADD PRIMARY KEY (PRODUCT_NO,MATERIAL_NO);
	ALTER TABLE RECIPE ADD KEY MATERIAL_NO (MATERIAL_NO);
	*/
ALTER TABLE RECIPE ADD FOREIGN KEY ( PRODUCT_NO ) REFERENCES product ( PRODUCT_NO );
ALTER TABLE RECIPE ADD FOREIGN KEY ( MATERIAL_NO ) REFERENCES material ( MATERIAL_NO );
				   
SHOW CREATE TABLE RECIPE;
/*
  現在、試作品表には「ミックスジュース」の情報が管理されています。
  ミックスジュースの原材料とレシピの登録を行います。
*/

-- 問４：ミックスジュースに使用する原材料を材料表に登録してください。
INSERT INTO MATERIAL( MATERIAL_NO , MNAME , ORIGIN , COST )
VALUES ('00025','牛乳','北海道','30'),
	   ('00026','バナナ','フィリピン','30'),
	   ('00027','桃','岡山','30'),
	   ('00028','みかん','和歌山','30');
	   
-- 問５：上記、原材料をミックスジュースのレシピとして登録を試みてください。
INSERT INTO RECIPE ( PRODUCT_NO , MATERIAL_NO , QUANTITY )
VALUES ('9003','00025','1'),
	   ('9003','00026','1'),
	   ('9003','00027','1'),
	   ('9003','00028','1');

/*
  試作品のレシピ情報を登録しようとすると、エラーが発生しました。
  今回、外部キー制約を追加したため商品表にある商品はレシピに登録できますが、
  試作品のレシピ情報が登録できないことが発覚しました。その為、設計を見直すことにしました。
*/

-- 問６：レシピ表にある商品番号の外部キー制約を削除してください。
ALTER TABLE RECIPE DROP FOREIGN KEY recipe_ibfk_1;

SHOW CREATE TABLE RECIPE;

-- 問７：再度、ミックスジュースのレシピ情報を登録してください。
--      データの確認をとり正しければトランザクションの確定をして下さい。
INSERT INTO RECIPE ( PRODUCT_NO , MATERIAL_NO , QUANTITY )
VALUES ('9003','00025','1'),
	   ('9003','00026','1'),
	   ('9003','00027','1'),
	   ('9003','00028','1');

COMMIT;

SELECT * FROM RECIPE WHERE PRODUCT_NO = '9003';
