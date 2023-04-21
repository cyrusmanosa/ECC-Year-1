<?php

require_once "utils.php";

// セッションの開始
session_start();


// セッションへアクセス
// print_r( $_SESSION );

$msg = "";
if (!empty($_SESSION["Error"])) {
  $msg = $_SESSION["Error"];
}

$Input_Data = [];
if (!empty($_SESSION["Input_Data"])) {
  $Input_Data = $_SESSION["Input_Data"];
}

// Sessison ID
//print session_id();

// すべてのSessionデータを削除
// session_destroy();

// CSRF Tokenの作成
$Token = generateToken( 12 );
// CSRF TokenをSessionに保存
$_SESSION[ "_Token" ] = $Token;

?>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta Name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="asset/styles/style.css" rel="stylesheet">
  <script src="https://cdn.tailwindcss.com"></script>
  <title>php1 - kadai09_1</title>
</head>
<body class="bg-gray-50">
  <div class="container w-full h-full mx-auto">
    <h1 class="text-2xl text-teal-500 py-10">サーバーサイドスクリプト演習１</h1>
    <h2 class="text-lg py-3 mb-10 border-b">データベース処理</h2>

    <section class="w-full h-full mx-auto px-2 py-20">

      <div class="mb-10">
        <h3 class="text-xl border-b-2 border-teal-400 pb-2 mb-5">商品の新規登録</h3>
        <p class="text-red-600"> <?= $msg ?></p>
      </div>

      <div class="product-wrap px-5 py-10 shadow-md">
        <h4 class="font-bold mb-5">商品情報</h4>

        <form action="kadai09_2.php" method="POST">
          <input type="hidden" name="_Token" value="<?= $Token ?>">

          <div class="flex flex-col md:flex-row mb-10">
            <div class="flex-grow mr-0 md:mr-10 mb-5 md:mb-0">
              <div class="mb-5">
                <div class="flex flex-col w-6/12">
                  <label for="Product_No" class="text-gray-500 text-left uppercase tracking-wider">code</label>
                  <input type="text" Name="Product_No" id="Product_No" class="px-2 py-2 border rounded-md outline-none focus:border-green-200" value="<?= Old("Product_No") ?>">
                </div>
              </div>

              <div class="flex justify-between mb-5">
                <div class="flex flex-col flex-grow mr-10">
                  <label for="Category" class="text-gray-500 text-left uppercase tracking-wider">Category</label>
                  <select Name="Category" id="Category" class="px-2 py-2 border  rounded-md outline-none focus:border-green-200">
                    <option value="ピザ" selected>ピザ</option>
                    <option value="ドリンク">ドリンク</option>
                  </select>
                </div>
                <div class="flex flex-col w-4/12">
                  <label for="Price" class="text-gray-500 text-left uppercase tracking-wider">Price</label>
                  <input type="text" Name="Price" id="Price" class="px-2 py-2 border rounded-md outline-none focus:border-green-200" value="<?= Old("Price") ?>">
                </div>
              </div>

              <div class="flex flex-col">
                <label for="Name" class="text-gray-500 text-left uppercase tracking-wider">Name</label>
                <input type="text" Name="PNAME" id="Name" class="px-2 py-2 border rounded-md outline-none focus:border-green-200" value="<?= old("Name") ?>">
              </div>
            </div>

            <div class="flex flex-col items-stretch flex-grow">
              <label for="description" class="text-gray-500 text-left uppercase tracking-wider">description</label>
              <textarea Name="description" id="description" class="w-full h-full text-lg px-2 bg-gray-100 py-2 border rounded-md" disabled></textarea>
            </div>
          </div>

          <div class="flex flex-col sm:flex-row justify-end">
            <a href="kadai07_1.php" class="text-white text-center leading-10 bg-gray-600 px-10 mr-0 sm:mr-5 hover:bg-gray-500 rounded-md">一覧へ戻る</a>
            <button type="submit" class="order-first sm:order-1 text-white text-center leading-10 bg-pink-600 px-10 mb-2 sm:mb-0 hover:bg-pink-500 rounded-md">登録する</button>
          </div>
        </form>
      </div>
    </section>
  </div>
</body>

</html>