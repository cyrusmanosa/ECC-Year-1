<?php
    $word = "ECC太郎";
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai01_2</title>
</head>
<body>
    <div class="container mx-auto">
        <h1>PHPの基本</h1>
        <h2 class="text-lg border-b border-gray-200"><h2>   
        <p><?="こんにちは、{\$word}さん"?></p>
        <p><?="こんにちは、{$word}さん"?></p>
        <p><?="エスケープ文字の利用\\tシングル"?></p>
        <p><?="エスケープ文字の利用\tダブル"?></p>
    </div>
</body>
</html>