<?php 
session_start();
include_once('dbConnect.php');
?>

<!DOCTYPE html>
<html lang="JP">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="Stylesheet" href="./css.CSS">
    <title>Cyrus Studio</title>
<head>
    <h1 class="Title">Cyrus Studio</h1>
    <nav class="bar">
        <a href="./index.php">ホームページ</a>
        <a href="./about.php">会社概要</a>
        <?php
        if (!$_SESSION )
        {
            print
        '<div class="dropdown">
            <button class="dropbtn">ブランド</button>
            <div class="dropdown-content">
                <a href="./Canon_Products_info.php">Canon</a>

            </div>
        </div>'; 
        } 
        ?>
        <?php
            if($_SESSION)
            {
                print '<a href="./allorder.php">注文一覧表</a>';
                print '<a href="functions.php?op=logout">ログアウト</a>';
            }
            else
            {
                print '<a href="./Login.php">スタッフログイン</a>';
            }
        ?>
    </nav>

</head>
