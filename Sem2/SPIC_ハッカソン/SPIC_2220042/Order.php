<?php 
    include_once('header.php'); 
    global $dbConnection;
    $ALQ = mysqli_query($dbConnection, "SELECT * FROM {$Table} Where Lens_id = {$_GET['Lens_id']} ");
    $Al = mysqli_fetch_assoc($ALQ);
?>

<div class="Order">
    <form action="/SPIC_2220042/functions.php?op=createOrder" method="post">
        <div class="mySlides">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'01'.$Al['photoT'];?>" heigh="300px" width="300px">
        </div>

        <div class="mySlides">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'02'.$Al['photoT'];?>" heigh="300px" width="300px">
        </div>

        <div class="mySlides">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'03'.$Al['photoT'];?>" heigh="300px" width="300px">
        </div>

        <div class="column">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'01'.$Al['photoT'];?>" onclick="currentSlide(1)" width="8%">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'02'.$Al['photoT'];?>" onclick="currentSlide(2)" width="8%">
          <img src="image/Product/<?php echo $Al['Brand'] . '/' .$Al['image'].'03'.$Al['photoT'];?>" onclick="currentSlide(3)" width="8%">
        </div>

        <?php $_SESSION["PLen_id"] = $_GET['Lens_id']; ?>

        <h2><?php echo $Al['name'].'<br>';?></h2>
        
        <label for="name">* 名前</label>
        <input type="text" id="name" name="name" required><br/>
        
        <label for="email">* メール</label>
        <input type="email" id="email" name="email" required><br/>

        <label for="tel">電話番号</label>
        <input type="tel" id="tel" name="tel"><br/>
        
        <label for="quantity">購入数量</label>
        <input type="number" id="quantity" name="quantity" min="1" max="5" value="1"><br/>

        <input class="buyBtn" type="submit" value="注文する">
    </form>
</div>

<?php include_once('footer.php'); ?>

<script>
    let slideIndex = 1;
    showSlides(slideIndex);
    function currentSlide(n) { showSlides(slideIndex = n); }
    function showSlides(n) {
        let slides = document.getElementsByClassName("mySlides");
        let dots = document.getElementsByClassName("demo");
        for (let i = 0; i < slides.length; i++) { slides[i].style.display = "none"; }
        slides[slideIndex-1].style.display = "block";
    }
</script>

