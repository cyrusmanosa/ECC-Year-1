<?php
    $fruits = array("りんご","バナナ","いちご","ぶどう","キウイ","パイナツプル");
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai02_1</title>
</head>
<body>
<div class="container mx-auto">
        <h1>配列</h1>
            <h2 class="text-lg border-b border-gray-200"><h2>
        <p>$fruitsの配列構造<br><?=var_export($fruits)?></p>

        <?php

        echo "&nbsp".'<br>';

        echo "\$fruitsの3番目の要素に保存されているフルーツ".'<br>'.$fruits[2];

        echo "&nbsp".'<br>';
        echo "&nbsp".'<br>';

        echo "\$fruitsに新しいフルーツを追加(追加先は一番最後)して、配列構造を表示";

            echo '<pre>';
            print_r($fruits);
            echo '</pre>';
        
        echo "&nbsp".'<br>';
        
        echo "\$fruitsの先頭フルーツを「スイカ」に更新して、配列構造を表示";

        $fruits[0] = "スイカ";

            echo '<pre>';
            print_r($fruits);
            echo '</pre>';

        ?>
        
    </div>
</body>
</html>