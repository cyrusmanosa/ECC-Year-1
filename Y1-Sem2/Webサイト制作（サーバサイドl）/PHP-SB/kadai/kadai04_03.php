<?php
    $price;
    $taxPrice;
    $totalPrice;
    $title = "テンプレート";

    require_once "define.php";

    define(
        "CALLEGES",
        [
            [
                "name" => "ITカレッジ",
                "courses" => 
                [
                    [
                        "name" => "IT開発エキスパート",
                        "grade" => 4,
                    ],
                    [
                        "name" => "IT開発研究",
                        "grade" => 3,
                    ],
                    [
                        "name" => "Web",
                        "grade" => 3,
                    ],
                    [
                        "name" => "システムエンジニア",
                        "grade" => 3,
                    ]
                ],
            ],
            [
                "name" => "ゲーム。クリエイティブ",
                "courses" => 
                [
                    [
                        "name" => "ゲーム開発エキスパート",
                        "grade" => 4,
                    ],
                    [
                        "name" => "ゲームプログラム開発",
                        "grade" => 3,
                    ],
                    [
                        "name" => "CGデザイン",
                        "grade" => 3,
                    ]
                ]
            ]
        ]
    );
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
        <?php require_once "header.php" ?>
        <br>
        <h3>カレッジとコース</h3>
        <br>
        <?php foreach( CALLEGES as $college): ?>
            <h4> <?= $college["name"] ?></h4>
            <ul class="pl-5">
                <?php foreach($college["courses"] as $course): ?>
                    <li><?= $course["name"]?> (<?= $course["grade"] ?>年制）</li>
                <?php endforeach ?>
                <br>
            </ul>
        <?php endforeach ?>
    </div>
</body>
</html>