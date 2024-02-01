<?php
    $num=1;
    $word="1";
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai01_3</title>
</head>
<body>
    <div class="container mx-auto">
        <h1>PHPの基本</h1>
            <h2 class="text-lg border-b border-gray-200"><h2>   
            <p>$numの値：<?=$num?>（<?=gettype($num)?>）</p>
            <p>$wordの値：<?=$word?>（<?=gettype($word)?>）</p>

            <p>&nbsp</p>

            <h1 class="text-2x1">
                <?="抽象比較<br>\$numと\$wordは等しい"?>
            </p>

            <p>&nbsp</p>

            <p><?="厳密比較（データ型まで比較対象）<br>\$numと\$wordは等しくない"?></p>
    </div>
</body>
</html>