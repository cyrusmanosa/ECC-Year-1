<?php
    //  04　ブンカシュン
    //  2022－06－16
    //  練習06
    $view["seibetu"] = htmlspecialchars( $_POST["seibetu"],ENT_QUOTES,"UTF-8");
    if ($view["seibetu"] == 1){
        $view["seibetu"] = "男性";
    }else if ($view["seibetu"] == 2) {
        $view["seibetu"] = "女性";
    }

    
    $view["mail"] = "";
    if (isset($_POST["mail"])) {
        $view["mail"] = "メール送信：お知らせメールを受け取る";
    }
    
?>
<!DOCTYPE html>
<html lang="ja">
<head>
  <!-- meta -->
  <meta charset="UTF-8">
  
  <title>練習06</title>
</head>
    <body>
        <h1>練習06 フォーム処理2</h1>
        <h2>■ フォームに入力された内容を表示する</h2>

        <p>
            性別：<?php print $view["seibetu"]; ?><br>
            <?php print $view["mail"]; ?>
        </p>

    </body>
</html>