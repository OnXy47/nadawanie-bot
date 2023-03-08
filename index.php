<?php
error_reporting(E_ERROR | E_PARSE);
$apikey = $_GET['key'];
$key = "klucz";

  
$typ = $_GET['typ'];
$nick = $_GET['nick'];
$id = $_GET['id'];
$time = $_GET['time'];
  
 

                                       
                                       
if ($apikey != $key) {
    echo "Nie można uzyskać dostępu do API!";
} elseif ($apikey == $key || $nick != null || $reason != null || $time != null) {
    echo "Pomyślnie nadano skrzydla dla <b>". $nick ."</b> o id <b>". $id ."</b> na czas <b>". $time ."</b> !";
    $txt = "$typ;$nick;$id;$time\r";
    $f = file_put_contents('users.file', $txt.PHP_EOL , FILE_APPEND | LOCK_EX);
    fwrite($f, $txt);
    fclose($f);
    exit;

}



?>