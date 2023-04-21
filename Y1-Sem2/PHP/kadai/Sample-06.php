<?php
  //PNAME
  $ProductName = filter_input ( INPUT_GET,"PNAME" );
  //Category 
  $Category = filter_input ( INPUT_GET,"Category" );

//1.DBへの接続
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

//fileのmimetype
header("Content-Type: application/json");

//json format 変換
print json_encode($Rows);

?>