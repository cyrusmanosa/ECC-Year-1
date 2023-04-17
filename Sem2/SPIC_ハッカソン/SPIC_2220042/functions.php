<?php
    include_once('dbConnect.php');
    
    $op ='none';
    if( isset($_GET['op']) ) $op = $_GET['op'];
    if( $op == 'createOrder'){ createOrder(); }
    if( $op == 'logout'){ Logout(); }

    function isStaff(){ return isset($_SESSION['email']); }

    if($op == 'checklogin'){ checklogin($_POST['email'],$_POST['password']); }
    function Logout()
    {
        session_start();
        session_destroy();
        header("Location:index.php");
    }


    function checklogin($email, $password)
    {
        global $dbConnection;
        $staffQ = mysqli_query($dbConnection, " SELECT * FROM `staff` WHERE `email` = '.$email.' ");
        $staff = mysqli_fetch_assoc($staffQ);
        $hashPassword = password_hash($password , PASSWORD_BCRYPT, [ "cost" => 12 ] );

        if($email != $staff['email'] && !var_dump(password_verify($staff['password'], $hahashPasswordsh)) )
        {
            session_start();
            $_SESSION['email'] = $_POST['email'];
            header("Location: allorder.php");
        }
        else
        { 
            header("Location: Login.php"); 
        }
    }

    function createOrder()
    {
        session_start();
        global $dbConnection;
        mysqli_begin_transaction($dbConnection);

        $order_range = '1234567890abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPUQRSTUVWXYZ';
        $order_id = substr( str_shuffle($order_range), 0, 10 );
        $today = date("Y-m-d H:i:s");

        $inOrder = mysqli_prepare($dbConnection,"INSERT INTO order_data( order_id , client_name , client_email , Tel , product_id , quantity , order_time) VALUES (?,?,?,?,?,?,?)");
        mysqli_stmt_bind_param($inOrder,'ssssiis',$order_id,$_POST['name'],$_POST['email'],$_POST['tel'],$_SESSION['PLen_id'],$_POST['quantity'],$today);

        $res = mysqli_stmt_execute($inOrder);

        mysqli_commit($dbConnection);
        if ( !mysqli_commit($dbConnection) ){
            session_destroy();
            header("Location: Orderfail.php"); 
        }

        if ($res) {
            session_destroy();
            header("Location: OrderComplete.php"); 
        }
    }
