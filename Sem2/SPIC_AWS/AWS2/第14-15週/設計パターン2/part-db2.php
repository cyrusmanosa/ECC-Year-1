<?php
//header('charset=utf-8');
$number = $_GET['pid'];
if (isset($number) && $_GET['pid'] != '') {

    //$number = 1001;
    //Web APIのURL
    $url = 'APIゲートウェイのURL?pid=' . $number;
    //APIのJSONファイルを取得
    $apidata = file_get_contents($url);
    $data = json_decode($apidata, true);
}
?>
<html lang="ja">
<head>
<!--link rel="stylesheet" href="../css/kad.css" -->
<title>cake shop lambda版</title>
</head>
<body>
<header>
<h1><span>Web API(patern2)</span></h1>
</header>
<div id="contents">
<p>
<form action='cake-lambda.php' method='GET'>
    商品番号：
    <select id='pid' name='pid'>
        <option value=1001>1001</option>
        <option value=1002>1002</option>
        <option value=1003>1003</option>
    </select>
    <!--input type='text' id='pid' name='pid' value='' size='4' placeholder='商品番号'-->
    <input type = 'submit' value='選択'>
</form>
<?php
//表示処理
if(isset($data)){
    print '<p>商品</p>';
    print "<table border=\"1\">\n";
    print "<tr><td>Photo</td><td>商品名</td><td>カテゴリー</td><td>価格</td></tr>\n";
    print("<tr>");
    printf("<td><img src=エンドポイント/images/%s></td>", $data['photo']);
    printf("<td>%s</td>", $data['pname']);
    printf("<td>%s</td>", $data['category']);
    printf("<td>%d</td>", $data['price']);
    print "</tr>\n";
    print'</table>';
    // print '<p>No.：' . $data['pid'] . '</p>';
    // print '<p>No.：' . $data['photo'] . '</p>';
    // print '<p>商品名：' . $data['pname'] . '</p>';
    // print '<p>値段：' . $data['price'] . '円</p>';
}
?>
</div>
</body>
</html>