<?php

$password = "SK1A";

$hashPassword = hash( "sha256" , $password );

print "パスワード<br>";
print $password."<br>";

print "ハッシュパスワード<br>";
print $hashPassword."<br>";

$solt = "ECC";

$hashSolt = hash( "md5" , $solt);

print "ソルト<br>";
print $solt;
print "<hr>";
print "ハッシュソルト";
print $hashSolt."<br>";

// password + solt
$resultPassword = hash( "sha256" , $hashPassword . $hashSolt);

print "完成した暗号化済みパスワード<br>";
print $resultPassword;
print "<hr>";
?>