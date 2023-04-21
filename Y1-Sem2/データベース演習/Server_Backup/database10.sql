/*
データベース演習I 課題10
クラス：SK1A04
制作者：文家俊
作成日：2023/01/12
*/


/*
  DDL(データ定義言語)を学習したことにより、データベースにテーブルを追加することが出来ます。
  ピザ屋で配達に利用するバイクを管理したいですが、情報を保存するためのテーブルがありません。
  バイクを管理する車体管理表の作成をしていきましょう。
*/

-- 問１：テーブル定義書_車体管理表.xlsをもとに車体管理表を作成して列構造を表示してください。

CREATE TABLE BIKE(
	BIKE_NO char(5),
	BNAME varchar(50),
	BUY_DATE date,
	LENGTH int(4), 
	HEIGHT int(4),
	WIDTH  int(4),
	SEAT_HEIGHT int(4),
	WEIGHT int(4),
	CAPACITY double(4,1),
	DISPLACEMENT int(4),
	STORE_NO char(3)
	);

SHOW COLUMNS FROM BIKE ;

/*
  車体を管理できるようになったので、新しく配達用のバイクを購入することにしました。
  森ノ宮店に「スーパーカブ50 プロ」、阿倍野店に「ジャイロ キャノピー」を配置するのでデータを登録しましょう。
*/

-- 問２：上記、バイクの情報を登録してください。
--       データの表示を行い内容に間違いがなければトランザクションの確定をしてください。
--       本田技研工業：https://www.honda.co.jp/motor-lineup/

INSERT INTO BIKE( BIKE_NO , BNAME , BUY_DATE , LENGTH , HEIGHT , WIDTH , SEAT_HEIGHT , WEIGHT , CAPACITY , DISPLACEMENT , STORE_NO)
VALUES 
	( '00001','スーパーカブ50 プロ','2023-01-12','1860','1040','695','735','96','4.3','49','002'),
	( '00002','ジャイロ キャノピー','2023-01-12','1895','1690','660','700','139','5.9','49','005');

SELECT * FROM BIKE;

COMMIT;

/*
  大きめや小さめの商品を提供するために一部の商品をサイズ管理できるようにしたいです。
  しかし、商品表にサイズ情報を持たせるとデータが正しく管理できなくなるので
  サイズ表を作成することにしました。
*/

-- 問３：テーブル定義書_サイズ表.xlsをもとにサイズ表を作成して列構造を表示してください。

CREATE TABLE SIZE(
	CATEGORY varchar(4),
	SIZE char(1),
	DIFF int(5));

SHOW COLUMNS FROM SIZE; 

-- 問４：カテゴリーがピザとドリンクのサイズ情報を登録してください。
--       正しくデータが登録されていればトランザクションの確定をしてください。

INSERT INTO SIZE( CATEGORY , SIZE , DIFF)
VALUES 
	( 'ピザ','S','0'),
	( 'ピザ','M','500'),
	( 'ピザ','L','1000'),
	( 'ドリンク','S','-30'),
	( 'ドリンク','M','0'),
	( 'ドリンク','L','50');
	
SELECT * FROM SIZE;

COMMIT;

-- 問５；サイズに合わせた商品価格を含む情報を表示してください。（計51件表示）

SELECT P.PRODUCT_NO, P.PNAME, S.SIZE, (P.PRICE + S.DIFF) AS PRICE
FROM PRODUCT AS P JOIN SIZE as S ON S.CATEGORY = P.CATEGORY;

/*
  今回、新たに職種の管理を職種表で行うことにしました。
  今のままだと従業員表と職種表のリレーションが出来ないので従業員表を作り直します。
  同じ名前のテーブルは作成できないので、現在の従業員表を退避させて作業を進めていきます。
*/

-- 問６：現在の従業員表のテーブル名をOLD_EMPに変更してください。
--       ※テーブル一覧を確認するにはSHOW TABLESを実行してください

ALTER TABLE EMPLOYEE RENAME TO OLD_EMP;

SHOW TABLES;

-- 問７：テーブル定義書_新従業員表.xlsをもとに新従業員表を作成して列構造を表示してください。
CREATE TABLE EMPLOYEE(
	EMP_NO char(5),
	ENAME varchar(20),
	BIRTHDAY date,
	TEL varchar(10),
	ADDRESS varchar(100),
	HIREDATE date,
	JOB_NO int(1),
	RANK_POINT int(4),
	SALARY int(4),
	WORK_STORE char(3),
	MGR_NO char(5));

SHOW COLUMNS FROM EMPLOYEE; 

-- 問８：旧従業員にあるデータを新従業員表に全てのデータを移行してください。
--       正しくデータが更新されていればトランザクションの確定をしてください。
--       ※INSERT SELECT文を使用してください。

INSERT INTO EMPLOYEE (EMP_NO,ENAME,BIRTHDAY,TEL,ADDRESS,HIREDATE,JOB_NO,RANK_POINT,SALARY,WORK_STORE,MGR_NO)
SELECT 
	O.EMP_NO,
	O.ENAME,
	O.BIRTHDAY,
	O.TEL,ADDRESS,
	O.HIREDATE,
	J.JOB_NO,
	O.RANK_POINT,
	O.SALARY,
	O.WORK_STORE,
	O.MGR_NO
FROM OLD_EMP AS O
JOIN JOB AS J ON J.JNAME = O.JOB;

COMMIT;

SELECT EMP_NO , ENAME , JOB_NO FROM EMPLOYEE;

-- 問９：旧従業員表を削除してテーブル一覧を確認してください。

DROP TABLE OLD_EMP;  

SHOW TABLES;
