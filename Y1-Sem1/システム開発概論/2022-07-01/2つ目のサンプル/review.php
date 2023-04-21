<?php
session_start();

$hname = trim(htmlspecialchars($_GET['hname']));
$_SESSION['name'] = $hname;
$title = trim(htmlspecialchars($_GET['rtitle']));
$comment = trim(htmlspecialchars($_GET['comment']));
$grade = trim(htmlspecialchars($_GET['grade'])); 

?>
<html>
<head>
<meta charset='uft-8'>
<title>投稿確認</title>
</head>
<body>
    <h1>口コミ内容確認</h1>
    <p>問題がなければ、下の「登録」ボタンをクリックしてください</p>
    <h2>ハンドルネーム：<?=$hname ?></h2>
    <h2>タイトル：<?=$title ?></h2>
    <h2>コメント：<?=$comment ?></h2>
    <h2>評価：<?=$grade ?></h2>
    <form action="complete2.php" method="POST">
        <button type='submit' name='send' id='send'>登録</button>
    </form>
</body>