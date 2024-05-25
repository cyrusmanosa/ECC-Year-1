<?php
    $group1 = array("一朗","次郎","三郎","四郎","五郎");
    $group2 = array("花子","蝶子","緑子","月子","陽子");
    $students = array(array("一朗","次郎","三郎","四郎","五郎"),array("花子","蝶子","緑子","月子","陽子"));
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>PHP1 - Kadai02_2</title>
</head>
<body>
    <div class="container mx-auto">
            <h1>多次元配列</h1>
            <h2 class="text-lg border-b border-gray-200"><h2>
            
            <?php
                echo "&nbsp".'<br>';
                echo "&nbsp".'<br>';
                echo "\$group1と\$group2の配列構造";
                echo "&nbsp".'<br>';
                var_dump($group1);
                var_dump($group2);

                echo "&nbsp".'<br>';
                echo "&nbsp".'<br>';
                echo "\$studentsの多次元配列構造".'<br>';
                print_r($students);

                echo "&nbsp".'<br>';
                echo "&nbsp".'<br>';
                echo "多次元配列の要素参照";
                echo "&nbsp".'<br>';
                echo "\$studentsの２行３列目の学生は、". $students[1][2] ."です。";

            ?>
    </div>
</body>
</html>