<?php 
   require_once("functionDB.php"); 
   $db=db_open();
   $memos = $db->query('SELECT * FROM memos ORDER BY id DESC');
   while ($memo = $memos->fetch() ): 
?>
<pre>
 <h2><a href="view_more.php?id=<?php echo $memo['id'] ?>"><?php echo $memo['memo']; ?></a></h2>
 <time><strong><?php echo '登録日 : '. $memo['created_at']; ?></strong></time>
</pre>
<hr>
<?php endwhile ?>