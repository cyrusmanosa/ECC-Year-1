<?php include_once ('header.php'); ?>

<?php 
    $LQ = mysqli_query($dbConnection, "SELECT * FROM {$Table} WHERE Brand = '{$S}'");
    while( $pl = mysqli_fetch_assoc ($LQ) )
    {
        print 
        '<table class="Show_Product">
            <tr>
                <td>
                    <img src="image/Product/'.$pl['Brand'].'/'.$pl['image'].'01'.$pl['photoT'].'" heigh="200px" width="200px">
                </td>

                <td class="Product_info_name">
                    <p>'.$pl['name'].'<br>￥'.$pl['price'].'<br>'.
                        '<a href="/SPIC_2220042/Order.php?Lens_id='.$pl[ 'Lens_id' ].'" class="buyBtn">予定商品</a><br>
                    </p>
                </td>
            </tr>
        </table>';
    }
?>
<?php include_once('footer.php'); ?>