<?php
/**
 * ファイル名：cake-lambda.php
 *
 * Web APIを利用したスクリプト
 * cakeの情報を取得
 * Relese1.0 
 */
    /**
     * 文字コードの設定
     */
    header('charset=utf-8');

    $number = 1001;
    //Web APIのURL
    $url = 'https://xvic3175f9.execute-api.us-east-1.amazonaws.com/default/ie3a00-cake-function?pid=' . $number;
    //print($url);
    //APIのJSONファイルを取得
    $apidata = file_get_contents($url);
    $data = json_decode($apidata, true);
    //print $data['status'];
    //$data = json_decode(file_get_contents($url));
    //print var_dump($data);
?>

<html lang="ja">
<head>
<!--link rel="stylesheet" href="../css/kad.css" -->
<title>cake shop lambda版</title>
</head>
<body>
<header>
<h1><span>Web API(API Gateway)</span></h1>
</header>
<div id="contents">
<p>
<p>商品</p>
<?php
//print $data['pname'];
if(isset($data)){
    print '<p>No.：' . $data['pid'] . '</p>';
    print '<p>商品名：' . $data['pname'] . '</p>';
    print '<p>値段：' . $data['price'] . '円</p>';
}
?>
</div>
</body>
</html>
