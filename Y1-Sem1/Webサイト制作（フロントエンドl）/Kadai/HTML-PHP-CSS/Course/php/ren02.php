<?php
    //  04　ブンカシュン
    //  2022－05－26
    //  練習02 if文
    $number2 = "0";
    define("NUMBER1","3");
    $errmessage = "number2 は 0 より大きい値を設定してください。";
?>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>練習２</title>
</head>
    <body>
        <h1>練習02 if文</h1>
        <h2>■ if文</h2>
            <p>
                定数(NUMBER1):
                    <?php
                        if( NUMBER1 %2 == 0) 
                        {
                            print "NUMBER1 は  偶数です。";
                        }else{
                            print "NUMBER1 は  奇数です。";
                        }
                    ?>
            </p>

        <p>変数($number2):<?= $number2 ?></p>

            <p>
                <?php
                    if( $number2 < 0)
                    {
                      print "<strong>ERROR!!</strong>";
                      print "$errmessage";
                    }
                ?>
            </p>
    </body>
</html>