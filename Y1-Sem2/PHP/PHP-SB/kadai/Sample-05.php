<?php

// password
$password = "123456";
// hash password
$hashPassword = password_hash($password , PASSWORD_BCRYPT, [ "cost" => 12 ] );
print "hash password : {$hashPassword}";
print "<hr>";
//確認
if ( password_verify( "SK1A" , $hashPassword) ){
    print "password OK";
}
else{
    print "password NG";
}
?>