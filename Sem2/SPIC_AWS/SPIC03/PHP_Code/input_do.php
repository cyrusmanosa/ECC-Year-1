
<?php
   require_once("functionDB.php"); 
   $db=db_open();
    $statement = $db->prepare('INSERT INTO memos SET memo=?, created_at=NOW()');
    $statement->execute(array($_POST['newText']));
    header('Location: view.php'); 
?>
