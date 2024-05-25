<?php
    //  04　ブンカシュン
    //  2022－06－02
    //  練習04
    $view["name"] = htmlspecialchars( $_POST["name"],ENT_QUOTES,"UTF-8"); 
    $view["pass"] = htmlspecialchars( $_POST["pass"],ENT_QUOTES,"UTF-8"); 
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
    <!-- meta -->
    <meta charset="UTF-8">
    
    <title>練習04</title>
    </head>
    <body>
        <h1>練習04 フォーム処理１</h1>
        <h2>■ フォームに入力された内容を表示する</h2>
        <p>
            <!--$_POST["name"]のname 係 HTML の"name"-->
            お名前：<?php print $view["name"]; ?><br>
            パスワード：<?php print $view["pass"]; ?>
        </p>
    </body>
</html> 