<?php 
    include_once('header.php'); 
?>

<form action="functions.php?op=checklogin" method="post">
    
    <div class="Login_all">
        <p>スタッフ登録</p>

        <div class="LoginForm">
            <label for="email">メール: </label>
            <input type="email" name="email" id="email" required><br>
        </div>

        <div class="LoginForm">
            <label for="email">暗証番号: </label>
            <input type="password" name="password" id="password" min="1" max="5" required><br>
        </div>

        <div class="LoginForm"><input type="submit" value="登録"></div>
    </div>

    <h2>システム</h2>
<?php include_once('footer.php'); ?>