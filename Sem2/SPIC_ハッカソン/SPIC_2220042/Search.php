<?php
    include_once "header.php";

    if(isset($_GET['SearchText'])){
        $title = '%'.$_GET['SearchText'].'%';
        
        $SearchCode = "SELECT * FROM {$Table} WHERE name Like '{$title}' ";
        $exe = mysqli_query($dbConnection, $SearchCode);
        
        if ( mysqli_num_rows($exe) > 0){
            $roop = 0;
            while($pl = mysqli_fetch_assoc($exe)){
                print 
                '<table class="Show_Product">
                    <tr>
                        <td>
                            <img src="image/Product/'.$pl['Brand'].'/'.$pl['image'].'01'.$pl['photoT'].'" heigh="200px" width="200px">
                        </td>
        
                        <td class="Product_info_name">
                            <p>'.$pl['name'].'<br>￥'.$pl['price'].'<br>'.
                                '<a href="/SPIC_2220042/Order.php?Lens_id='.$pl[ 'Lens_id' ].'" class="buyBtn">予定商品</a><br>
                            </p>
                        </td>
                    </tr>
                </table>';
                $roop++;
            }
        }
    }
?>