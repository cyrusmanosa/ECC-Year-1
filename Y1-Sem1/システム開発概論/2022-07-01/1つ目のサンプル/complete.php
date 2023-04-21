<?php
session_start();
print '<h1>登録完了</h1>';
print $_SESSION['name'] . 'さん、ユーザ登録ありがとうございました。'
?>

<!DOCTYPE html>
<html lang="Ja">
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登録完了</title>
</head>
<body>
    <link rel="stylesheet" href="./abc.css">
</body>
</html>