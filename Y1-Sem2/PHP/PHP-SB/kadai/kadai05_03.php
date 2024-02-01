<?php

require_once "define.php";


$title = "フォーム処理";
?>

<?php require_once "kadai05_resource.php"; ?> 

<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title><?php SITE_NAME ?> - kadai05_03</title>
</head>

<body>
    <div class="container mx-auto">
        <?php require_once "header.php" ?>

        <form action="kadai05_04.php" method="POST" novalidate>
            <section>
                <div class="flex flex-col lg:flex-row mb-20">
                    <div class="lg:w-6/12 lg:mr-10">
                        <div class="lg:flex mb-10">
                            <div class="lg:w-1/2 mb-10 lg:mr-5 lg:mb-0">
                                <label class="block" for="department">学科</label>
                                <select name="department" id="department" class="w-full p-2 border-2 border-gray-200 focus:border-green-200 rounded-lg outline-none">
                                <?php 
                                    foreach( $school[ "departments" ] as $key ){
                                        echo '<option value='. $key["id"] .'>'.$key["name"].'</option>' ; 
                                    }
                                ?>
                                </select>
                            </div>

                            <div class="lg:w-1/2">
                                <label class="block" for="course">コース</label>
                                <select name="course" id="course" class="w-full p-2 border-2 border-gray-200 focus:border-green-200 rounded-lg outline-none">
                                <?php 
                                    foreach( $school[ "departments" ] as $department ){
                                        foreach( $department["courses"] as $de){
                                            echo '<option value='. $de["id"] .'>'.$de["name"].'</option>' ; 
                                        }
                                    }
                                ?>
                                </select>
                            </div>
                        </div>

                        <div class="mb-10">
                            <label class="block" for="name">名前<em class="text-red-600 text-sm not-italic p-0.5 ml-3">必須</em></label>
                            <input type="text" name="name" id="name" class="text-lg w-full p-2 border-2 border-gray-200 focus:border-green-200 rounded-lg outline-none" placeholder="ECC 太郎" required>
                        </div>

                        <div class="mb-10 lg:mb-0">
                            <label class="block" for="kana">フリガナ<em class="text-red-600 text-sm not-italic ml-3">必須</em></label>
                            <input type="text" name="kana" id="kana" class="text-lg w-full p-2 border-2 border-gray-200 focus:border-green-200 rounded-lg outline-none" placeholder="イーシーシー タロウ" required>
                        </div>
                    </div>

                    <div class="lg:w-6/12 flex flex-col items-stretch">
                        <label class="w-full" for="note">備考</label>
                        <textarea name="note" id="note" class="w-full flex-1 text-lg p-2 border-2 border-gray-200 focus:border-green-200 rounded-lg outline-none resize-none"></textarea>
                    </div>
                </div>

                <div class="flex justify-end">
                    <button type="submit" class="w-40 h-10 text-white bg-pink-600 hover:bg-pink-500 rounded-lg">入力内容の確認</button>
                </div>
            </section>
        </form>

    </div>
</body>

</html>