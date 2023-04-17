<?php 
    include_once('header.php');
    if( !isset ($_SESSION['email']) ) { header("Location:Login.php"); }
?>

<div class="allorder">
    <h1>注文一覧表</h1>
    <?php
        $orderQ = mysqli_query($dbConnection,"SELECT * FROM `order_data`");
        while( $order = mysqli_fetch_assoc($orderQ) )
        {
            $ORDQ = mysqli_query($dbConnection , "SELECT * FROM `order_data` WHERE order_id = '{$order['order_id']}' " ); 
            $Ordl = mysqli_fetch_assoc($ORDQ);

            $productQ = mysqli_query($dbConnection, "SELECT * FROM {$Table} WHERE Lens_id = '{$Ordl['product_id']}' ");
            $product = mysqli_fetch_assoc($productQ);
            print 
                '<div class="allorder"><table>'.
                '<tr><th>お客様の名前：</th>' . '<td>' . $Ordl['client_name'].'</td></tr>'.
                '<tr><th>お客様のメール：</th>' . '<td>' . $Ordl['client_email'].'</td></tr>'.
                '<tr><th>予定商品：</th>' . '<td>' . $product['name'].'   X   '.$Ordl['quantity'].'件</td></tr>'.
                '<tr><th>注文時間：</th>' . '<td>' . $Ordl['order_time'].'</td></tr>'.
                '<br/></table></div>';
        } 
    ?>
</div>

<?php include_once('footer.php'); ?>







