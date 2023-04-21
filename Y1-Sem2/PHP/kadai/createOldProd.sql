/*-- 旧商品表 構築スクリプト */

/*---------------テーブル削除----------------------*/
DROP TABLE OLDPRODUCT;

/*---------------テーブル作成----------------------*/
-- 旧商品表
CREATE TABLE  OLDPRODUCT(
    Product_NoCHAR(4),
    PNAME      VARCHAR(50),
    Category   VARCHAR(4),
    Price      INT(5)
);

/*---------------------データ挿入---------------------------*/
-- 旧商品表
INSERT INTO OLDPRODUCT(Product_No, PNAME, Category, Price)
VALUES ('0901','エビマヨネーズ','ピザ',1600);

INSERT INTO OLDPRODUCT(Product_No, PNAME, Category, Price)
VALUES ('0902','アスパラベーコン','ピザ',1800);

INSERT INTO OLDPRODUCT(Product_No, PNAME, Category, Price)
VALUES ('2901','ビール','ドリンク',500);

INSERT INTO OLDPRODUCT(Product_No, PNAME, Category, Price)
VALUES ('2902','レモンチューハイ','ドリンク',350);

INSERT INTO OLDPRODUCT(Product_No, PNAME, Category, Price)
VALUES ('2903','ウイスキー','ドリンク',3400);

COMMIT;

SELECT * FROM OLDPRODUCT;


