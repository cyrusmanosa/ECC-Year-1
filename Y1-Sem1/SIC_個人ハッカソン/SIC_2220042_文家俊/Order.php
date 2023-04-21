<?php 
    include_once('header.php'); 
    include_once('Canon_Product_arrag.php');
    global $dbConnection;
    $CLQ = mysqli_query($dbConnection, "SELECT * FROM `canon_lens`");
    $cl = mysqli_fetch_assoc($CLQ);
?>

<div class="Order">
    <form action="/functions.php?op=createOrder" method="post">

        <?php echo $CLP[$_GET['CLP_id']-1]['image'];?>

        <input type="hidden" id="gem_id" name="gem_id" value='<?php echo $cl['CL_id'];?>'>

        <h2><?php echo $CLP[$_GET['CLP_id']-1]['name'];?></h2>

        <label for="name">名前</label>
        <input type="text" id="name" name="name"><br/>

        <label for="email">メール</label>
        <input type="email" id="email" name="email" require><br/>

        <label for="quantity">購入数量</label>
        <input type="number" id="quantity" name="quantity" min="1" max="5" value="1"><br/>

        <input class="buyBtn" type="submit" value="注文する">
    </form>
</div>

<?php include_once('footer.php'); ?>