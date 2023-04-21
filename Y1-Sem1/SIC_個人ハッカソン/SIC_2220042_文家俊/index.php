<?php include_once('header.php'); ?>
<div id="indexBG">
    <nav id="BG">
        <img src="./image/Background/01.jpg" width="65%">
    </nav>
    <div class="index_photo">
        <?php
        $brankQ = mysqli_query($dbConnection, "SELECT * FROM `brank`");
        while($brank = mysqli_fetch_assoc($brankQ))
        {
            print 
            '<a href="./'.$brank['php'].'">
                <img src="image/Logo/'.$brank['image'].'">
            </a>';
        }?>
    </div>
</div>
<?php include_once('footer.php'); ?>