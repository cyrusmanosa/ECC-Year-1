<?php
require_once "define.php";
//GET
//Product_No
$ProductNo = filter_input(INPUT_GET, "Product_No");

//Product_Noがない時
if (!$ProductNo) {
  //kadai07_1.phpへリダイレクト
  header("Location: kadai07_1.php");
  exit;
}

try {
$db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","Mkc_1207" );
  $db -> setAttribute(PDO::ATTR_EMULATE_PREPARES, false);
  //SQLを作成
  $Sql = "SELECT * FROM OLDPRODUCT WHERE Product_No=:Product_No";
  //SQLのプリペアードステートメントを実行
  $Stmt = $db->prepare($Sql);
  //WHEREの値を紐付け
  $Stmt->bindParam(":Product_No", $ProductNo, PDO::PARAM_STR);
  //ステートメントを実行
  $Stmt->execute();

  //ステートメントから結果のレコードを取り出す
  if ($Stmt->rowCount()) {
    $Result = $Stmt->fetch(PDO::FETCH_ASSOC);
  } else {
    //ヒット件数が０の時は、リダイレクト
    header("Location: kadai07_1.php");
    exit;
  }
} catch (PDOException $e) {
  print $e->getMessage();
}

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
  <title>php1 - kadai08_1</title>
</head>

<body class="bg-gray-50">
  <div class="container w-full h-full mx-auto">
    <h1 class="text-2xl text-teal-500 py-10">サーバーサイドスクリプト演習１</h1>
    <h2 class="text-lg py-3 mb-10 border-b">データベース処理</h2>
    <section class="w-full h-full mx-auto px-2 py-20">
      <h3 class="text-xl border-b-2 border-teal-400 pb-2 mb-10">商品の詳細</h3>

      <div class="flex flex-col sm:flex-row justify-end mb-10">
        <a href="kadai07_1.php" class="text-white text-center leading-10 bg-gray-600 px-10 hover:bg-gray-500 rounded-md">一覧へ戻る</a>
        <!--kadai11_1-->
        <!--<a href="#" class="w-full sm:w-fit text-white text-center leading-10 bg-red-700 px-10 px-10 mx-0 sm:mx-5 my-2 sm:my-0 hover:bg-red-600 rounded-md">削除する</a>-->
        <form action="kadai11_1.php" method="POST">
          <input type="hidden" Name="Product_No" value="<?= $Result["Product_No"] ?>">
          <button type="submit" class="w-full sm:w-fit text-white text-center leading-10 bg-red-700 px-10 px-10 mx-0 sm:mx-5 my-2 sm:my-0 hover:bg-red-600 rounded-md">削除する</button>
        </form>

        <!--/kadai10_1-->
        <a href="kadai10_1.php?Product_No=<?= $Result["Product_No"] ?>" class="text-white text-center leading-10 bg-pink-600 px-10 hover:bg-pink-500 rounded-md">編集する</a>
      </div>

      <div class="product-wrap px-5 py-10 shadow-md">
        <h4 class="font-bold mb-5">商品情報</h4>
        <div class="flex flex-col md:flex-row">
          <div class="flex-grow mr-0 md:mr-10 mb-5 md:mb-0">
            <div class="mb-5">
              <div class="w-6/12">
                <p class="text-gray-500 text-left uppercase tracking-wider">code</p>
                <p class="px-2 py-2 border rounded-md"><?= $Result["Product_No"] ?></p>
              </div>
            </div>

            <div class="flex justify-between mb-5">
              <div class="flex-grow mr-10">
                <p class="text-gray-500 text-left uppercase tracking-wider">Category</p>
                <p class="px-2 py-2 border  rounded-md"><?= $Result["Category"] ?></p>
              </div>
              <div class="w-4/12">
                <p class="text-gray-500 text-left uppercase tracking-wider">Price</p>
                <p class="px-2 py-2 border  rounded-md"><?= $Result["Price"] ?></p>
              </div>
            </div>

            <div>
              <p class="text-gray-500 text-left uppercase tracking-wider">Name</p>
              <p class="text-lg px-2 py-2 border  rounded-md"> <?= $Result["PNAME"] ?> </p>
            </div>
          </div>

          <div class="flex flex-col items-stretch flex-grow">
            <p class="text-gray-500 text-left uppercase tracking-wider">description</p>
            <p class="flex-grow h-32 md:h-max text-lg px-2 bg-gray-100 py-2 border rounded-md"></p>
          </div>
        </div>
      </div>
    </section>
  </div>
</body>
</html>