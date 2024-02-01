<?php
    $foods = 
    [
        [
            "category" => "フルーツ",
            "item" => 
                [
                    ["name" => "りんご","price" => 220],
                    ["name" => "バナナ","price" => 110],
                    ["name" => "ストロベリー","price" => 490],
                    ["name" => "グレープ","price" => 550],
                    ["name" => "キウイ","price" => 160],
                ],
            ],
        ["category" => "ベジタブル",
            "item" => 
                [
                    ["name" => "キャベツ","price" => 130],
                    ["name" => "キャロット","price" => 80],
                    ["name" => "ピーマン","price" => 120],
                    ["name" => "ナス","price" => 160],
                    ["name" => "カポチャ","price" => 240],
                ]
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
    <title>PHP1 - Kadai02_3ex</title>
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
            echo "foreachを使った\$foodsのループ処理3";
            foreach($foods as $foods){
                echo '<pre>';
                echo $foods["category"];
                foreach($foods["item"] as $item){
                    echo '<pre>';
                    echo $item["name"] . ': ￥' .$item["price"];
                    echo '</pre>';
                }
                echo '</pre>';
                echo "&nbsp".'<br>';
            }
        ?>
    </div>
</body>
</html>