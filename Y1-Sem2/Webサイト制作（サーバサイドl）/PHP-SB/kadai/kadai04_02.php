<?php

    require_once "define.php";
    require_once "kadai04_01.php";

    $title = "外部ファイルの読み込み";
    $kadai = new kadai04(1000);
?>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title><?php SITE_NAME ?> - kadai04_03</title>
</head>
<body>
    <div class="container mx-auto">
        <?php 
        require_once "header.php";
        echo "定数の宣言"."<br>";
        echo "料金：".$kadai -> getprice()."円".'<br>';
        echo "消費税率：".$kadai -> getrate() ."%".'<br>';
        echo "合計：".$kadai -> calc()."円";
        ?>
    </div>
</body>
</html>