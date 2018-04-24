<?php
echo "<body style='background-color:black;color:lime;'>";
/* "<script>alert('thank you to be here___for problem thread check my comment ');</script>
/
    /
        /
            /
                /
                    /";*/
echo "This program is created for understanding of what is  the value of x and y in given program with for loop and how its work internally for Detail check the comment part in program";
echo "<br/><a style='color:white'; href='https://www.sololearn.com/Discuss/1103234/?ref=app'>Problem:click here</a><br/>";

/*
url:https://www.sololearn.com/Discuss/1103234/what-will-be-the-values-of-x-and-y-after-execution-and-how-many-times-the-loop-will-execute-can

Problem statement:
What will be the values of x and y after execution and 
how many times the loop will execute? 
Can someone explain step by step?

What will be the values of x and y after execution and 
how many times the loop will execute? 
Can someone explain step by step?

$x=0; $y=0
for($x=1; $x<=5; ++$x)
$y= $x++;
--$y;
*/
echo "<div style='border-top:1px solid white;background:#000066;color:white;'>";
//echo "<div stye='background:blue;color:lime'>";
echo "<h3>Program:</h3>";
//echo "</div>";
echo '$';echo 'x=0;';echo '$';echo 'y=0;<br/>';

echo 'for('; echo '$'; echo 'x=1;'; 
                          echo '$'; echo 'x<=5;';  
                                       echo '++';echo '$'; echo 'x)<br/>';
echo '$';echo 'y=';echo '$';echo 'x++;<br/>';
echo '--';echo '$';echo 'y;<br/>';
echo "</div>";                                      


//echo "<div stye='background:blue;color:lime'>";
echo "<h3>output with every step value of x and y.:</h3>";
echo "<div style='background-color:#424242'>";
//echo "</div>";
$x=0;$y=0;
for($x=1;$x<=5;++$x)
{
    echo "<div style='color:white;background-color:black;font-weight:bold;'>";
echo "<span style='background-color:black;color:lime;'>loop value of x=$x</span>";
echo "<br/>before (y=x++) value of x is:";
echo $x;
echo "<br/>And before (y=x++) value of y is:";
echo $y;
$y=$x++;
echo "<br/>After (y=x++) value of x is:";
echo $x;
echo "<br/>And After (y=x++) value of y is:";
echo $y;
echo "</div>";
echo "<br/>";

}
echo "<div style='color:white;background-color:black;font-weight:bold;'>";
echo "before (--y) value of y is:";
echo $y;
--$y;
echo "<br/>after (--y) value of y is:";
echo $y;
echo "</div>";
echo "<br/>";

echo "<div style='color:white;background-color:black;font-weight:bold;'>";
echo "Value of x:=";
echo $x;
echo "<br/>Value of y:=";
echo $y;
echo "</div>";

echo "</div>";

echo "<br/><div style='border-top:1px solid white;color:white;background-color:black;font-weight:bold;'>";
echo "&copy;Asif Bilakhiya <a style='color:white'; href='https://www.sololearn.com/Profile/928735/?ref=app'>Follow</a><br/>";
echo "</div>";
echo "</body>";
?>
