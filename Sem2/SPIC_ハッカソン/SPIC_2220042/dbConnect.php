<?php
$dbConnection = mysqli_connect("localhost","root","Mkc_1207","products");

if( mysqli_connect_errno () ){
    print "Failed to connect to database" . mysqli_connect_error();
    exit();
}
?>