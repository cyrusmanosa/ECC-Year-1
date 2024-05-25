<?php
    $price = 1000;
    $taxRate = "0.1";
    $totalprice = $price + ($price * $tax);
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai01_1</title>
</head>
<body>
    <div class="container mx-auto">
        <h1>PHPの基本</h1>
        <h2 class="text-lg border-b border-gray-200"><h2>   
        <p>金額：<?= $price?> (税込み<?=$totalprice?>)</p>
        <p>$taxRateのデータ型：<?= gettype($taxRate)?></p>
    </div>
</body>
</html>