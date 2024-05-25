<?
    require_once "define.php";

if ( $_SERVER["REQUEST_METHOD"] !== "POST" ){
    header("Location: kadai07_1.php");
    exit;
}

$ProductNo = filter_input( INPUT_POST, "Product_No");

if ( !$ProductNo ){
    header("Location:kadai07_1.php");
    exit;
}

try{
    $db = new PDO( "mysql:host=localhost;dbname=phpc;charset=utf8mb4;","root","root" );
    $db -> setAttribute( PDO::ATTR_EMULATE_PREPARES, false );
    $db -> beginTransaction();
    
    $Sql = "DELETE FROM OLDPRODUCT WHERE Product_No = :Product_No";
    $Stmt = $db -> prepare($Sql);
    
    $Stmt -> bindParam(":Product_No", $ProductNo, PDO::PARAM_STR);
    $Stmt -> execute();

    $db -> commit();
}
catch( PDOException $e){
    print $e -> getMessage();
    $db -> rollback();
}

// kadai07_1.phpへ戻す
header("Location:kadai07.php");  

?>