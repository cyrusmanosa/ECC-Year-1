<?php

function h ($Str){
    return htmlspecialchars($Str, ENT_QUOTES);
}

function generateToken($Lenght = 16){
    $Token = "";
    while ($Lenght - strlen($Token)){
        $Bytes = random_bytes($Lenght);
        $Base64str = base64_encode($Bytes);
        $Base64str = str_replace(["+","/","="], "",$Base64str);
        $Token .= substr($Base64str, 0, $Lenght - strlen($Token));
    }
    return $Token;
}

// セッションからデータを取り出す
function Old($Name){
    
    if ( session_status() === PHP_SESSION_NONE ) {
        session_start();
    }

    if ( !empty ( $_SESSION[$Name] ) ) {
        return $_SESSION[$Name];
    }else{
        return null;
    }
}