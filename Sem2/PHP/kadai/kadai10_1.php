<?php
require_once "define.php";

// Product_No
$ProductNo = filter_input( INPUT_GET, "Product_No"); 

//Product_Noが無いとき
if ( !$ProductNo ){
  header("Location:kadai07_1.php");
  exit;
}

try {
  // DBへ接続
  $db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","root" );
  $db -> setAttribute(PDO::ATTR_EMULATE_PREPARES,false);

  // SQL
  $Sql = "SELECT * FROM OLDPRODUCT WHERE Product_No= :Product_No";

  //プリペアードステートメント
  $Stmt = $db -> prepare($Sql);

  //値のバインド
  $Stmt -> bindParam(":Product_No", $ProductNo, PDO::PARAM_INT);
  
  //ステートメントの実行
  $Stmt -> execute();

  $Result = $Stmt -> fetch(PDO::FETCH_ASSOC);

  if ( !$Result ){
    header( "Location: kadai071.php" );
    exit;
  }

}

catch( PDOException $e ) { print $e -> getMessage(); }
catch( Exception $e){ print $e -> getMessage(); }

?>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta Name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- link -->
  <link href="asset/styles/style.css" rel="stylesheet">

  <!-- script -->
  <script src="https://cdn.tailwindcss.com"></script>
  <title>php1 - kadai10_1</title>
</head>
<body class="bg-gray-50">
<div class="container w-full h-full mx-auto">
  <h1 class="text-2xl text-teal-500 py-10">サーバーサイドスクリプト演習１</h1>
  <h2 class="text-lg py-3 mb-10 border-b">データベース処理</h2>

  <section class="w-full h-full mx-auto px-2 py-20">

    <div class="mb-10">
      <h3 class="text-xl border-b-2 border-teal-400 pb-2 mb-5">登録商品の編集</h3>
      <p class="text-red-600">エラーメッセージの表示</p>
    </div>

    <div class="product-wrap px-5 py-10 shadow-md">
      <h4 class="font-bold mb-5">商品情報</h4>

      <form action="kadai10_2.php" method="POST">
        <input type="hidden" Name="Product_No" value="<?= $Result["Product_No"] ?>">  

        <div class="flex flex-col md:flex-row mb-10">
          <div class="flex-grow mr-0 md:mr-10 mb-5 md:mb-0">
            <div class="mb-5">
              <div class="flex flex-col w-6/12">
                <label for="Product_No" class="text-gray-500 text-left uppercase tracking-wider">code</label>
                <p class="bg-white px-2 py-2 border rounded-md outline-none"><?= $Result["Product_No"] ?></p>
              </div>
            </div>

            <div class="flex justify-between mb-5">

              <div class="flex flex-col flex-grow mr-10">
                <label for="Category" class="text-gray-500 text-left uppercase tracking-wider">Category</label>
                <select Name="Category" class="px-2 py-2 border  rounded-md outline-none focus:border-green-200">
                  <option value="ピザ" selected>ピザ</option>
                  <option value="ドリンク"> ドリンク </option>
                </select>
              </div>

              <div class="flex flex-col w-4/12">
                <label for="Price" class="text-gray-500 text-left uppercase tracking-wider">Price</label>
                <input type="text" Name="Price" id="Price" class="px-2 py-2 border rounded-md outline-none focus:border-green-200" value="<?= $Result["Price"] ?>">
              </div>
            </div>

            <div class="flex flex-col">
              <label for="Name" class="text-gray-500 text-left uppercase tracking-wider">Name</label>
              <input type="text" Name="PNAME" id="Name" class="px-2 py-2 border rounded-md outline-none focus:border-green-200" value="<?= $Result[ "PNAME" ]?>">
            </div>

          </div>

          <div class="flex flex-col items-stretch flex-grow">
            <label for="description" class="text-gray-500 text-left uppercase tracking-wider">description</label>
            <textarea class="w-full h-full text-lg px-2 bg-gray-100 py-2 border rounded-md" disabled></textarea>
          </div>
        </div>

        <div class="flex flex-col sm:flex-row justify-end">
          <a href="kadai08_1.php?" class="text-white text-center leading-10 bg-gray-600 px-10 mr-0 sm:mr-5 hover:bg-gray-500 rounded-md">戻る</a>
          <button type="submit" class="order-first sm:order-1 text-white text-center leading-10 bg-pink-600 px-10 mb-2 sm:mb-0 hover:bg-pink-500 rounded-md">更新する</button>
        </div>

      </form>
    </div>

  </section>
</div>
</body>
</html>