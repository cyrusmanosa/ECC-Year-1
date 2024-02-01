<?php
    //  04　ブンカシュン
    //  2022－06－02
    //  練習03 配列・連想配列
    $name = ["PHP","JSP","Ruby","Perl","Python"];
    //連想配列の作成
    $url = array('yahoo' => 'https://www.yahoo.co.jp/',
		         'google' => 'https://www.google.co.jp/',
		         'msn' => 'https://www.msn.com/ja-jp'
                );

?>

<!DOCTYPE html>
<html lang="jp">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>配列</title>
    </head>

    <body>
        <h1>練習03 配列・連想配列</h1>
        <h2>■ 配列の表示</h2>
        <P>foreachを使用して配列の内容を表す</P>
            <?php 
                foreach($name as $n){
                    print "<p>{$n}</p>";
                }
            ?>

        <h2>■ 連想配列の表示</h2>
        <P>foreachを使用して連想配列の内容を表す</P>

        <?php
            foreach($url as $key => $value){
                print "<p><a href={$value}>{$key}</a></p>";
            }
        ?>
                
    </body>

</html>