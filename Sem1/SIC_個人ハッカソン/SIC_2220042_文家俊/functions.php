<?php
    include_once('dbConnect.php');
    include_once('Canon_Product_arrag.php');
    $op ='none';
    
    if(isset($_GET['op'])) $op = $_GET['op'];
    
    if($op == 'createOrder'){createOrder();}
    
    if($op == 'logout'){Logout();}

    function isStaff()
    {return isset($_SESSION['email']);}
    
    if($op == 'checklogin'){checklogin($_POST['email'],$_POST['password']);}

    function Logout()
    {
        session_start();
        session_destroy();
        header("Location:/index.php");
    }
    
    function checklogin($email, $password)
    {
        global $dbConnection;
        $staffQ = mysqli_query($dbConnection, "SELECT * FROM `staff` WHERE `email` = '".$email."'");

        $staff = mysqli_fetch_assoc($staffQ);

        if($email == $staff['email'] && $password == $staff['password'])
        {
            session_start();
            $_SESSION['email'] = $_POST['email'];
            header("Location: /allorder.php");
        }
        else
        {
            header("Location: /Login.php");
        }
    }

    function createOrder()
    {
        echo $_POST['gem_id']."<br>";
        echo $_POST['name']."<br>";
        echo $_POST['email']."<br>";
        echo $_POST['quantity']."<br>";
        echo date('Y-m-d H:i:s')."<br>"; 

        $myfile = fopen("data.csv", "a") or die("未能開啟檔案");
        $data = $_POST['gem_id'].','.$_POST['name'].','.$_POST['email'].','.$_POST['quantity'].','.date('Y-m-d H:i:s')."\r\n";
        fwrite($myfile, $data);
        fclose($myfile);
        
        header("Location: /Order-complete.php");
    }

    // {
    //     global $dbConnection;
    //     mysqli_begin_transaction($dbConnection);
        
    //     $sql = "INSERT INTO products.order(
    //         client_name, 
    //         client_email,
    //         quantity, 
    //         order_time
    //         ) VALUES (
    //             '{$_POST['name']}', 
    //             '{$_POST['email']}',
    //             '{$_POST['quantity']}', 
    //             '".date('Y-m-d H:i:s')."'
    //         )";
            
    //         echo $sql;
            
    //     if(mysqli_query($dbConnection, $sql))
    //     {
    //         header("Location: /Order-complete.php");
    //     }
    // }