<?php
    $foods = 
    [
        "fruits" => 
        [
            "apple" => 220 , 
            "banana" => 110, 
            "strawberry" => 490, 
            "grape" => 550, 
            "kiwi" => 150
        ]
        ,
        "vegetable" => 
        [
            "cabbage" => 130,
            "carrot" => 80,
            "greenPepper" => 120, 
            "eggplant" => 160,
            "pumpkin" => 240
        ]
    ];
?>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai02_3</title>
</head>
<body>
    <div class="container mx-auto">
        <h1>連想配列</h1>
        <h2 class="text-lg border-b border-gray-200"><h2>
        <?php
        //part 1:
            echo "\$foodsの配列構造".'<br>';
            echo '<pre>';
            print_r($foods);
            echo '</pre>';
        //part 2:
            echo "&nbsp".'<br>';
            echo "foreachを使った\$foodsのループ処理",'<br>';
            foreach($foods as $key => $valus){
                print_r($key);
                echo '<pre>';
                print_r($valus);
                echo '</pre>';
            }
        //part 3:
            echo "&nbsp".'<br>';
            echo "&nbsp".'<br>';
            echo "foreachを使った\$foodsのループ処理2";
            echo "&nbsp".'<br>';
        foreach($foods as $k1 => $v1){
            echo $k1;
                foreach($valus as $k2 => $v2){
                    echo '<pre>';
                    echo $k2.": ￥".$v2.'円';
                    echo '<pre>';
                }
            echo "&nbsp".'<br>';
        }
        ?>
    </div>
</body>
</html>