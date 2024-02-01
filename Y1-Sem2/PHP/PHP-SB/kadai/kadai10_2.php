<?php 
require_once "define.php";

if ( $_SERVER["REQUEST_METHOD"] !== "POST" ){
    header("Location: kadai07_1.php");
    exit;
}

// product no
$ProductNo = filter_input( INPUT_POST, "Product_No");
// Category
$Category = filter_input( INPUT_POST, "Category");
// Price
$Price = filter_input( INPUT_POST, "Price", FILTER_VALIDATE_INT);
// product Name
$ProductName = filter_input( INPUT_POST, "PNAME");
// product no が未入力のときは、リダイレクト
if ( !$ProductNo ){
    header("Location:kadai07_1.php");
    exit;
}
if ( !$ProductName){
    header("Location:kadai10_1.php?Product_No={$ProductNo}");
    exit;
}

try{
  $db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","Mkc_1207" );
    // プリペアードステートメントのエミュレータをとめる
    $db->setAttribute( PDO::ATTR_EMULATE_PREPARES, false );
    //オートコミットを停止
    $db->setAttribute( PDO::ATTR_AUTOCOMMIT , false );

    //Product_Noが登録済みをチェック
    $Sql = "UPDATE OLDPRODUCT 
    SET PNAME = :Product_Name, Category = :Category, Price = :Price 
    WHERE Product_No= :Product_No";

    $Stmt = $db -> prepare($Sql);
    
    $Stmt -> bindParam( ":Product_No", $ProductNo, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Product_Name", $ProductName, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Category", $Category, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Price", $Price, PDO::PARAM_INT );
    $Stmt -> execute();

    $db -> commit();
}

catch( PDOException $e ){
    print $e -> getMessage();
    $db -> rollBack();
}

catch( Exception $e ){ print $e -> getMessage();}

// kadai07_1.phpへ戻す
header( "Location: kadai07_1.php" );

?>