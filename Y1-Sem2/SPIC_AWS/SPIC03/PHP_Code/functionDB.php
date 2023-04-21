<?php 
function db_open():PDO{	
  $dname = 'spic_db';//DB名
  $url = 'endpoint';//RDSエンドポイント
  $dsn = "mysql:dbname=$dname;host=$url;charset=utf8";//DSN接頭辞、DBとRDSエンドポイント
  $user = "root";//ユーザー名
  $password = "123qwECC";//パスワード
  $db = new PDO($dsn, $user, $password);
  return $db;
}
?>
