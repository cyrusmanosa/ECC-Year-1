<?php include_once('header.php');?>

<div id="indexBG">
    <nav id="BG"><img src="./image/Background/01.jpg" width="65%"></nav>
    <div class="index_photo">
        <?php
            $brandQ = mysqli_query($dbConnection, "SELECT * FROM `brand`");
            while( $brand = mysqli_fetch_assoc($brandQ) )
            {
                print '<img src="image/Logo/'.$brand['image'].'">';
            }
        ?>
    </div>
</div>
<?php include_once('footer.php'); ?>



