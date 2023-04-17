/*
データベース演習I 課題2
クラス：SK1A 04
制作者：文家俊
作成日：2020/10/06
*/

/*
  ピザ屋ですが新しく新規店舗をオープンすることになりました。
  新規店舗と新しく雇う従業員の情報を登録していきましょう。
*/

-- 問１：店舗表(STORE)に阿倍野店の情報を登録して、データの確認をしてください。
	INSERT INTO STORE(STORE_NO,SNAME,TEL,PREFECTURES,ADDRESS,OPEN_TIME,CLOSE_TIME,HOLIDAY,STATUS)
	VALUES('005','阿倍野店','0666229986','大阪府','大阪市阿倍野区文の里１―１―４０','09:00','22:00','土日','未オープン');
	SELECT * FROM STORE WHERE STORE_NO = '005';

-- 問２：従業員表(EMPLOYEE)に阿倍野店の店長を登録して、データの確認をしてください。
	INSERT INTO EMPLOYEE(EMP_NO,ENAME,BIRTHDAY,TEL,ADDRESS,HIREDATE,JOB,RANK_POINT,SALARY,WORK_STORE,MGR_NO)
	VALUES ('00016','升野英知','1975-11-28','0332221234','福岡県福岡市博多区住吉１－２','2020-09-01','店長','0','2000','005','00001');
	SELECT * FROM EMPLOYEE WHERE EMP_NO='00016';
	
-- 問３：上記トランザクションの確定処理をしてください。
	COMMIT;

/*
  阿倍野店には店長しか決まっていません。オープニングスタッフはこれから募集を行いますが
  教育係として他の店舗からアルバイトのスタッフを配置したいと思います。
*/

-- 問４：森ノ宮店に勤務する横山裕を阿倍野店勤務に変更してください。
--       上司は升野英知に変わるので上司番号の更新も行い、データの確認をして下さい。
--       ※ヒント：勤務店舗はWORK_STORE、上司番号はMGR_NOです。
	UPDATE EMPLOYEE SET MGR_NO='00016',WORK_STORE='005'
    WHERE EMP_NO='00007';
    
	SELECT * FROM EMPLOYEE WHERE EMP_NO='00007';

-- 問５：横山裕は森ノ宮店専属スタッフであることが発覚したのでトランザクションを
--       取り消してデータが元に戻っていることを確認してください。
	ROLLBACK;

/*
  阿倍野店より早くにオープンする予定だった三宮店ですが、問題が発覚したため出店を取りやめます。
  三宮店で働く予定だった従業員は阿倍野店で勤務することにします。
*/

-- 問６：三宮店に勤務する従業員を阿倍野店勤務して、上司を升野英知に変更してください。
	UPDATE EMPLOYEE SET MGR_NO='00016'
    WHERE WORK_STORE='004';
	UPDATE EMPLOYEE SET WORK_STORE='005'
    WHERE WORK_STORE='004';
	SELECT * FROM EMPLOYEE WHERE WORK_STORE='005';
	
-- 問７：斎藤飛鳥が退職することになりました。従業員表から削除してください。
	DELETE FROM EMPLOYEE
    WHERE EMP_NO='00013';
	SELECT * FROM EMPLOYEE;
	
-- 問８：秋元真夏の役職を店長から調理に、給与を950に更新してください。
 	UPDATE EMPLOYEE SET JOB='調理'
    WHERE EMP_NO='00011';
	UPDATE EMPLOYEE SET SALARY='950'
    WHERE EMP_NO='00011';
	SELECT * FROM EMPLOYEE WHERE EMP_NO = '00011';

-- 問９：阿倍野店に勤務する従業員を表示してください。
--       正しくデータが更新されていればトランザクションの確定を行ってください。
--       ※不正な場合はROLLBACKを行い、問６からSQL文を見直してください。
	UPDATE EMPLOYEE SET MGR_NO='00016'
	WHERE EMP_NO > '00010' AND EMP_NO < '00016';
	SELECT * FROM EMPLOYEE WHERE WORK_STORE='005';
	
-- 問１０：スタッフの配置換えも完了して無事に阿倍野店をオープンすることになりました。
--         阿倍野店のステータスを営業中に変更して、出店を取りやめた三宮店を削除してください。
--         データを確認してトランザクションの確定を行ってください。
	DELETE FROM STORE
    WHERE STORE_NO='004';
    UPDATE STORE SET STATUS='営業中'
    WHERE STORE_NO='005';
    SELECT * FROM STORE;
    
    COMMIT;


