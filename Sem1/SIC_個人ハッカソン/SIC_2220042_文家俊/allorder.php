<?php 
    include_once('header.php');
    include_once('Canon_Product_arrag.php'); 

    if(!isset($_SESSION['email']))
    {
        header("Location:/Login.php");
    }
?>

<div class="allorder">
<h1>注文一覧表</h1>

<?php
    $orderData = file_get_contents('data.csv');
    $orders = str_getcsv($orderData, "\r\n"); 

    foreach($orders as $order)
    {
        $singleOrder = explode(",", $order);
        echo '<div class="order"><p>';
        echo 'お客様の名前 : '.$singleOrder[1].'<br/>';
        echo 'お客様のメール : '.$singleOrder[2].'<br/>';
        echo '予定商品 : '.$CLP[$singleOrder[0]-1]['name'].' X '.$singleOrder[3].'件 <br/>';
        echo '注文時間 : '.$singleOrder[4].'<br/>';
        echo '<br></p></div>';
    }
?>
</div>

<?php include_once('footer.php'); ?>






<!-- $orderQ = mysqli_query($dbConnection,"SELECT * FROM `order`");

while($order = mysqli_fetch_assoc($orderQ)){
    $CLPQ = mysqli_query($dbConnection,'SELECT * FROM `canon_lens`WHERE CL_id='.$order['CL_id']); 
    $cl = mysqli_fetch_assoc($CLPQ);
    print '<div class="allorder"><p>';
    print 'お客様の名前：'.$order['client_name'].'<br/>';
    print 'お客様のメール：'.$order['client_email'].'<br/>';
    print '予定商品：'.$cl['name'].'X'.$order['quantity'].'件<br/>';
    print '注文時間：'.$order['order_time'].'<br/>';
    print '<br/>';
    print '</p></div>';
} -->
