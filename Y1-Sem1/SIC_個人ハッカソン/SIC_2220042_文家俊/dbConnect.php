<?php
$dbConnection = mysqli_connect("localhost","root","root","products");

if(mysqli_connect_errno()){
    print "Failed to connect to database" . mysqli_connect_error();
    exit();
}

?>