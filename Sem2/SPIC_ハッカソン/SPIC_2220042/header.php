<?php 
    session_start();
    include_once('dbConnect.php');
    $Table = "Lens";
    $C = "Canon";
    $N = "Nikon";
    $S = "Sony";
    $F = "Fujifilm";
    $L = "Leica";
?>

<!DOCTYPE html>
<html lang="JP">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Zen+Kaku+Gothic+Antique:wght@700&display=swap" rel="stylesheet">
    <link rel="Stylesheet" href="./css.CSS">
    <title>Cyrus Studio</title>
<head>
    <a href="./index.php"><h1 class="Title">Cyrus Studio</h1></a>

    <form action="Search.php" method="get" class="Search_form">
        <input type="SearchText" name="SearchText" size = "40">
        <button type="submit" ><i class="fa fa-search" ></i></button>
    </form>

    <nav class="bar">
        <a href="./index.php">ホームページ</a>
        <a href="./about.php">会社概要</a>
        <?php
            if ( !$_SESSION ){
            print
                '<div class="dropdown">
                    <button class="dropbtn">ブランド</button>

                    <div class="dropdown-content">
                        <a href="./Canon_Products_info.php">Canon</a>
                        <a href="./Nikon_Products_info.php">Nikon</a>
                        <a href="./Sony_Products_info.php">Sony</a>
                        <a href="./Leica_Products_info.php">Leica</a>
                        <a href="./Fujifilm_Products_info.php">Fujifilm</a>
                    </div>
                </div>'; 
            }
            
            if( $_SESSION ){
                print   '<a href="functions.php?op=logout" class="INDLogin">ログアウト</a>
                        <a href="./allorder.php">注文一覧表</a>';
            } else { 
                print '<a href="./Login.php" class="INDLogin" >スタッフログイン</a>'; 
            }
        ?>
    </nav>
</head>
