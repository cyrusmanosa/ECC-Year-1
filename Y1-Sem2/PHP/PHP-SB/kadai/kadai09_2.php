<?php
require_once "define.php";

// セッションの開始
session_start();

// CSRF Token
print_r($_POST);
print "<hr>";
print_r($_SESSION);
exit;

// $_SESSION["Message"] = "Session Test";
if ($_SERVER["REQUEST_METHOD"] !== "POST") {
    header("Location: kadai09_1.php");
    exit;
}

//Post データにCSRF Tokenが含まれているかチェック
if (!isset($_POST["_Token"])) {
    header("Location: kadai09_1.php");
    exit;
}

// SessionにCSRF　Token　がないとき
if (isset($_SESSION["_Token"])) {
    // CSRF Tokenが一致するかチェック
    if ($_POST["_Token"] !== $_SESSION["_Token"]) {
        $_SESSION["error"] = "CSRF Token Error";
        header("Location: kadai09_1.php");
        exit;
    } else {
        // print "CSRF Token OK";
        // CSRF Tokenの消去
        unset($_SESSION["_Token"]);
    }
}
// Session に　CSRF Token　がないとき
else {
    $_SESSION["error"] = "CSRF Token Error";
    header("Location: kadai09_1.php");
    exit;
}

exit;

// 復元用にセッションに送信データを保存
$_SESSION = $_POST;
// product no
$ProductNo = filter_input( INPUT_POST, "Product_No");
// Category
$Category = filter_input( INPUT_POST, "Category");
// Price
$Price = filter_input( INPUT_POST, "Price", FILTER_VALIDATE_INT);
// product Name
$ProductName = filter_input( INPUT_POST, "PNAME");

// product no が未入力のときは、リダイレクト
if ( !$ProductNo ) {
    $_SESSION["Error"] = "商品番号は必要です。";
    header("Location:kadai09_1.php");
    exit;
}

if ( !$ProductName ) {
    $_SESSION["Error"] = "商品の名前は必要です。";
    header("Location:kadai09_1.php");
    exit;
}

try {
  $db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","Mkc_1207" );
    // プリペアードステートメントのエミュレータをとめる
    $db->setAttribute( PDO::ATTR_EMULATE_PREPARES, false );
    //オートコミットを停止
    $db->setAttribute( PDO::ATTR_AUTOCOMMIT , false );

    //Product_Noが登録済みをチェック
    $Sql = "SELECT * FROM OLDPRODUCT WHERE Product_No= :Product_No";
    $Stmt = $db -> prepare($Sql);
    $Stmt -> bindParam(":Product_No", $ProductNo, PDO::PARAM_INT);
    $Stmt -> execute();

    // row count を使わないで、レコード数を調べる
    if ($Stmt->fetch(PDO::FETCH_ASSOC)) {
        print "{$ProductNo} は登録済み";
        throw new Exception();
    }

    //ステートメントの解放
    $Stmt -> closeCursor();

    $Sql = "INSERT INTO oldproduct (Product_No,PNAME,Category,Price) 
    VALUES( :Product_No, :Product_Name, :Category, :Price)";

    $Stmt = $db -> prepare($Sql);
    
    $Stmt -> bindParam( ":Product_No", $ProductNo, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Product_Name", $ProductName, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Category", $Category, PDO::PARAM_STR );
    $Stmt -> bindParam( ":Price", $Price, PDO::PARAM_INT );
    $Stmt -> execute();

    $db->commit();
    
} catch (PDOException $e) {
    print $e->getMessage();
    $db->rollBack();
} catch (Exception $e) {
    print $e->getMessage();
}

// kadai07_1.phpへ戻す
header("Location: kadai07_1.php");
