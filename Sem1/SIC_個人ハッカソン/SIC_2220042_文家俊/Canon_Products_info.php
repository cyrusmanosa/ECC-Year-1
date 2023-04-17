<?php include_once('header.php'); ?>

<?php 
$CLQ = mysqli_query($dbConnection, "SELECT * FROM `canon_lens`");
while($cl = mysqli_fetch_assoc($CLQ))
{
    print 
    '<div class="All_Product_info">

        <div class="Product_info_photo">
            <img src="/image/Product/Canon/Canon-Lens/'.$cl['image'].'" heigh="200px" width="200px">
        </div>'.
        
        '<div class="Product_info_name">
            <p>'.$cl['name'].'<br>￥'.$cl['price'].'<br>
            <a href="/Order.php?CLP_id='.$cl['CL_id'].'"class="buyBtn">予定商品</a><br>
        </div>
    </div>';
}
?>

<?php include_once('footer.php'); ?>