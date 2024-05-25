<?php
  //PNAME
  $ProductName = filter_input ( INPUT_GET,"PNAME" );
  //Category 
  $Category = filter_input ( INPUT_GET,"Category" );

//1.DBへの接続
//PDO (dns,user,passward)
$db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","root" );
$db -> setAttribute ( PDO::ATTR_EMULATE_PREPARES, false );

  // WHEREの作成
  $Where = "";
  if( $ProductName ) {
    if( !empty ( $Where ) ) { $Where .= " AND "; }
    $Where .= " PNAME LIKE :PNAME ";
  }

  if( $Category ) {
    if( !empty ( $Where ) ) { $Where .= " AND "; }
    $Where .= "Category = :Category";
  }

  if( !empty( $Where ) ) { $Where = "WHERE" . $Where; }

//2.DBへのSQLの実行
$Sql = "SELECT * FROM OLDPRODUCT {$Where}";

$Stmt = $db -> prepare($Sql);

//productの値紐付け
if( $ProductName ) {
  $ProductName = "%{$ProductName}%";
  $Stmt -> bindParam(":PNAME", $ProductName, PDO::PARAM_STR);
}

//Categoryの値紐付け
if( $Category ) { $Stmt -> bindParam(":Category", $Category, PDO::PARAM_STR);}

$Stmt -> execute();

//3.SQLの結果を処理
$Rows = [];
while($Row = $Stmt -> fetch(PDO::FETCH_ASSOC)){ $Rows[] = $Row; }

//4.DBとの接続を閉じる
// print_r($Rows);

?>


<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta Name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- script -->
  <script src="https://cdn.tailwindcss.com"></script>
  <title>php1 - kadai07_1</title>
</head>
<body class="bg-gray-50">
<div class="container w-full h-full mx-auto">
  <h1 class="text-2xl text-teal-500 py-10">サーバーサイドスクリプト演習１</h1>
  <h2 class="text-lg py-3 mb-10 border-b">データベース処理</h2>

  <section class="w-full h-full mx-auto px-2 py-20">
    <div class="flex justify-between items-end border-b-2 border-green-400 pb-3 mb-10">
      <h3 class="text-xl">登録商品一覧</h3>
      <a href="kadai09_1.php" class="text-white text-center leading-10 bg-pink-600 px-10 hover:bg-pink-500 rounded-md">
        新規登録
      </a>
    </div>

    <div class="flex flex-col md:flex-row justify-between items-start">

      <div class="w-full md:w-3/12 h-80 mb-10 md:mb-0 p-5 shadow-md">
        <form action="kadai07_1.php" method="GET" class="h-full">

        <div class="flex flex-col justify-between h-full">
          <div>
            <div class="border-b border-gray-300 border-dashed mb-4 pb-6">
              <label for="Name" class="text-gray-500 text-xs uppercase tracking-wider">Name</label>
              <input type="text" Name="PNAME" id="Name" class="w-full h-10 px-3 text-sm border-2 border-gray-200 rounded-md outline-none focus:border-green-200" value="" placeholder="product Name">
            </div>

            <div>
              <label for="Category" class="text-gray-500 text-xs uppercase tracking-wider">Category</label>
              <select Name="Category" id="Category" class="w-full h-10 px-3 text-sm border-2 border-gray-200 rounded-md outline-none focus:border-green-200">
                <option value="" selected>すべての商品</option>
                <option value="ピザ">ピザ</option>
                <option value="ドリンク">ドリンク</option>
              </select>
            </div>
          </div>

          <div class="flex justify-center">
            <button type="submit" class="w-40 h-10 text-white text-lg bg-indigo-600 hover:bg-indigo-500 rounded-md">検索</button>
          </div>
        </div>

        </form>
      </div>

      <div class="w-full md:w-8/12">

        <table class="w-full table-fixed">
          <thead>
            <tr class="bg-gray-100 text-gray-500 text-xs text-left uppercase tracking-wider border-b border-gray-300">
              <th class="w-2/12 h-6 font-medium px-6 py-3">code</th>
              <th class="w-6/12 h-6 font-medium px-6 py-3">Name</th>
              <th class="w-2/12 h-6 font-medium px-6 py-3">Price</th>
              <th class="w-2/12 h-6 text-center font-medium px-6 py-3">setting</th>
            </tr>
          </thead>
          <tbody>
            <?php foreach( $Rows as $Row): ?>
            <tr class="tracking-wider border-b border-gray-200 hover:bg-gray-100 ">
              <td class="h-10 px-6 py-5"><?= $Row[ "Product_No" ] ?></td>
              <td class="h-10 px-6 py-5"><?= $Row[ "PNAME" ] ?></td>
              <td class="h-10 px-6 py-5"><?= $Row[ "Price" ] ?></td>
              <td class="h-10 text-center px-6 py-5">
                <a href="kadai08_1.php?Product_No=<?= $Row[ "Product_No" ] ?>" class="text-pink-600 hover:text-pink-400">詳細</a>
              </td>
            </tr>
            <?php endforeach ?>
          </tbody>
        </table>
      </div>

      <div>
        <!-- <p class="text-xl"><?= $Response[ "Message" ] ?></p> -->
      </div>

    </div>

  </section>

</div><!--/.container-->
</body>
</html>