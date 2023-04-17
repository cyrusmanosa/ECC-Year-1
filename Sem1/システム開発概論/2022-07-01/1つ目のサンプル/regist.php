<?php
session_start();

$view["name"] = trim(htmlspecialchars($_POST['namae']));
$_SESSION['name'] = $name;
$view["age"] = trim(htmlspecialchars($_POST['namae']));
$view["mailaddress"] = trim(htmlspecialchars($_POST['mailaddress']));
$view["address"] = trim(htmlspecialchars($_POST['address'])); 

?>
<html>
<head>
<link rel="stylesheet" href="./abc.css">
<meta charset='uft-8'>
<title>登録確認</title>
</head>
<body>
    <h1>ユーザ登録確認</h1>
    <p>問題がなければ、下の「登録」ボタンをクリックしてください</p>
    <h2>名前：<?=$view["name"] ?></h2>
    <h2>年齢：<?=$view["age"] ?></h2>
    <h2>メールアドレス：<?=$view["mailaddress"] ?></h2>
    <h2>住所：<?=$view["mailaddress"] ?></h2>
    <form action="complete.php" method="POST">
        <button type='submit' name='send' id='send'>登録</button>
    </form>
</body>