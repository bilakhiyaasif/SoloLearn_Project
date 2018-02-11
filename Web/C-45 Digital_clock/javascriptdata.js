alert("updated");
alert('digital clock\nplease like comment upvote');
function time()
{
document.getElementById('p1').innerHTML = "";
var data=100; 
var x=8;
var id=setInterval(frame,1000);


function frame() 
{
if(data==5)
{ClearInterval();}

else{
 var d = new Date(),
 h = (d.getHours()<10?'0':'') + d.getHours(),
 m = (d.getMinutes()<10?'0':'') + d.getMinutes();
 s=(d.getSeconds()<10?'0':'')+d.getSeconds();
 day1=d.getMonth();
var dist;
if(h<=11)
{
   dist='AM';
  
}
else
{
   dist='PM'; 
   h=h-12;
}
var hour=document.getElementById('h1');
var minut1=document.getElementById('m1');
var second=document.getElementById('s1');
hour.innerHTML =h+" : ";
minut1.innerHTML =m+" : ";
second.innerHTML =s+" "+dist;
if(x==8)
{
document.getElementById("ok").innerHTML="Thank You!! Please Like ,Comment!!"
x=9;
}
else
{
  document.getElementById("ok").innerHTML="";
  x=8;  
}

}
}
}
