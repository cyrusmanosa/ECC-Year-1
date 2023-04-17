<?php include_once('header.php'); ?>

<form action="functions.php?op=checklogin" method="post">
    
    <div class="Login_all">
        <p>登録</p>

        <div class="LoginForm">
            <label for="email">メール: </label>
            <input type="email" name="email" id="email" require><br>
        </div>

        <div class="LoginForm">
            <label for="email">暗証番号: </label>
            <input type="password" name="password" id="password" min="1" max="5"><br>
        </div>

        <div class="LoginForm">
            <input type="submit" value="登録">
        </div>

    </div>

<?php include_once('footer.php'); ?>