/*
データベース演習I 課題7
クラス：SK1A04
制作者：文家俊
作成日：2022/11/24
*/

/*
  従業員の熟練度ですが、ポイントのみの表示だと自分のランクが分かりにくいと指摘を受けました。
  従業員表とランク表の結合を行い従業員のランクを表示しましょう。
*/

-- 問１：ランク表(RANKPOINT)の情報を表示して下さい。
SELECT RANK_NAME , RANK_DESC, LO_POINT, HI_POINT
FROM RANKPOINT;

-- 問２：ランク表のベテラン以上の従業員の情報を取得してください。
SELECT E.EMP_NO , E.ENAME , E.RANK_POINT , R.RANK_NAME
FROM EMPLOYEE AS E JOIN RANKPOINT AS R
ON E.RANK_POINT >= '2001' AND R.RANK_NAME = 'ベテラン';


/* ーー問2答えーー
SELECT
	E.EMP_NO,E.ENAME,E.RANK_POINT,
	R.RANK_NAME
FROM
	EMPLOYEE AS E
JOIN
	RANKPOINT AS R
ON
	(
	E.RANK_POINT >= R.LO_POINT 
	AND
	E.RANK_POINT <= R.HI_POINT
	)
WHERE
	R.LO_POINT >= '2001';
*/


/*
  結合により、従業員の情報をより詳しく調べることが可能になりました。
  従業員表と店舗表の結合を行い、必要なデータを取得していきましょう。
*/

-- 問３：定休日が土曜、日曜日の店舗に勤務する従業員の情報を取得してください。
SELECT S.SNAME ,S.STATUS ,E.EMP_NO ,E.ENAME ,E.JOB 
FROM EMPLOYEE AS E JOIN STORE AS S 
ON E.WORK_STORE = S.STORE_NO AND S.HOLIDAY = '土日';

-- 問４：都道府県別で働いている従業員の数を調べてください。
SELECT S.PREFECTURES AS '店舗エリア' , COUNT(E.WORK_STORE) AS '人数'
FROM STORE AS S JOIN EMPLOYEE AS E
ON E.WORK_STORE = S.STORE_NO
GROUP BY PREFECTURES;

/*
  材料表があるので、商品で使用する原材料を調べたいと思います。
  しかし、商品表と材料表を紐づける結合条件が見当たりません。
*/

-- 問５：商品のレシピ情報を管理しているレシピ表(RECIPE)を取得してください。
SELECT * FROM RECIPE;

/*
  このように、レシピ表には商品番号と原材料番号および数量を持っているので
  レシピ表を管理することで商品を作るのに必要な材料がわかるようになっています。
  レシピ表と商品表、材料表を結合して必要なデータを取得していきましょう。
*/

-- 問６：レシピ表と材料表からマルゲリータのレシピ情報を表示してください。
SELECT P.PNAME , M.MNAME , M.ORIGIN , R.QUANTITY
FROM PRODUCT AS P JOIN MATERIAL AS M JOIN RECIPE AS R
ON M.MATERIAL_NO = R.MATERIAL_NO
ON P.PRODUCT_NO = R.PRODUCT_NO
WHERE P.PNAME = 'マルゲリータ'
GROUP BY MNAME;

-- 問７：レシピ表を元に商品ごとの原価を調べてください。
SELECT P.PNAME , SUM(M.COST * R.QUANTITY) AS '商品原価'
FROM PRODUCT AS P JOIN RECIPE AS R ON P.PRODUCT_NO = R.PRODUCT_NO
JOIN MATERIAL AS M ON M.MATERIAL_NO = R.MATERIAL_NO
GROUP BY PNAME;

