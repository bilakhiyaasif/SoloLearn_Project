alert('Traffic Light Signal');
alert('Please do like,comment & upvote if you feel good');
function main_fn()
{
var d1=new Date();
   // alert(d1);
    data=0;
    var l1=document.getElementById('l1');
 //   l1.innerHTML="STOP";
    var stoptext=document.getElementById('stop');
    var id=setInterval(frame,450);
    var r=document.getElementById('div-1');
    var y=document.getElementById('div-2');
    var g=document.getElementById('div-3');
    function frame()
    {
    
    if(data<=10)
    {
    if(data==10)
    {
        r.style.backgroundColor="#000000";
    }
    else if(data%2==0)
    {
        l1.style.color ="red";
        l1.innerHTML="STOP";
        r.style.backgroundColor="#ff0000";
        data=data+1;
    }

    else
    {
        red();
    }
    }
    
    //yellow
    if(data>=10&&data<=20)
    {
    if(data==20)
    {
        y.style.backgroundColor="black";
    }
    else if(data%2==0)
    {
    l1.style.color ="yellow";
        l1.innerHTML="Ready";
        y.style.backgroundColor="yellow";
        data=data+1;
    }

    else
    {
        yellow();
    }
    }
    
    if(data>=20&&data<=30)
    {
    if(data==30)
    {
        g.style.backgroundColor="black";
        data=0;
    }
    else if(data%2==0)
    {
    l1.style.color ="green";
        l1.innerHTML="Go";
        g.style.backgroundColor="green";
        data=data+1;
    }

    else
    {
        green();
    }
    }
    
      
    }
    
    function red()
    {
        r.style.backgroundColor="black";
        data=data+1;
        
    }
     function yellow()
    {
        y.style.backgroundColor="black";
        data=data+1;
        
    }
     function green()
    {
        g.style.backgroundColor="black";
        data=data+1;
        
    }
}
