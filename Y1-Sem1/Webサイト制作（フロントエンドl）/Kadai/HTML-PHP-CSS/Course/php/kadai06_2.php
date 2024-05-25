<?php
    //  04　ブンカシュン
    //  2022－06－16
    //  練習6-2
    $view["name"] = htmlspecialchars( $_POST["name"],ENT_QUOTES,"UTF-8");
    if ($view["name"] == ""){
        $view["name"] = "お名前が入力されていません";
    }
    
    $view["email"] = htmlspecialchars( $_POST["email"],ENT_QUOTES,"UTF-8");
    if ($view["email"] == ""){
        $view["email"] = "メールアドレスが入力されていません";
    }

    $view["content"] = htmlentities( $_POST["content"],ENT_QUOTES,"UTF-8");

    $view["cheese1"] = $_POST["cheese1"]; 
    if ($view["cheese1"] == 1 ){
        $view["cheese1"] = "カフェについて";
    }else if ($view ["cheese1"] == 2){
        $view["cheese1"] = "その他";
    }

    $view["information"] = $_POST["information"];
    if ($view["information"] == 1 ) {
        $view["information"] = "希望する";
    }else{
        $view["information"] = "希望しない";
    }

    $content = nl2br($view["content"]); 
?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>CONTACT | スローライフカフェ</title>
    </head>
    <body>

        <h1><img src="./image/kadai04_logo.png" alt="スローライフカフェ" width="128" height="133"></h1>

        <ul>
            <li>HOME</li>
            <li>FOOD</li>   
            <li>DRINK</li>
            <li>DESSERT</li>
            <li>ACCESS</li>
            <li>SHOP INFORMATION</li>
        </ul>

        <h2><img src="./image/kadai06_contact.jpg" alt="スローライフカフェへのお問い合わせ" width="850" height="370"></h2>

        <p>お問い合わせの確認</p>
            <table>
                <thead>
                    <tr>
                        <th>お名前（必須）</th><td><?= $view["name"]; ?></td>
                    </tr>

                    <tr>
                        <th>メールアドレス（必須）</th><td><?= $view["email"]; ?></td>
                    </tr>

                    <tr>
                        <th>お問い合わせ内容について</th><td><?= $view["cheese1"]; ?></td>
                    </tr>

                    <tr>
                        <th>お得な情報</th><td><?= $view["information"]; ?></td>
                    </tr>

                    <tr>
                        <th>メッセージ</th><td><?= $content ?></td>
                    </tr>

                </thead>
            </table>

        </form>
    </body>

</html>