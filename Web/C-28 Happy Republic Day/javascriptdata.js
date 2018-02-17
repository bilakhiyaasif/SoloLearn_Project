

alert("Happy Republic Day!!");
alert("Thanks to be here.\nPlease Like,Comment,Share.");
function move() {
     var x121=document.getElementById('b1-id');
    var body121=document.getElementById('main-div');
   // body.style.color='white';
   body121.style.backgroundColor ='black';
   body121.style.color='white';
 
  
 
  var elem = document.getElementById("myBar");   
   var elem1 = document.getElementById("myBar1");   
    var elem2 = document.getElementById("myBar2");   
    var flag = document.getElementById("flag");   
  var z=document.getElementById("h11");
  
  var x=document.getElementById("myProgress");
    var x1=document.getElementById("myProgress1");
      var x2=document.getElementById("myProgress2");
      
  var width = 10;
  var id = setInterval(frame, 100);
  function frame() {
    if (width >= 100) {
      clearInterval(id);
      alert('Its our 69th Republic Day!!');
      x.style.display='none';
      x1.style.display='none';
      x2.style.display='none';
      flag.style.display='none';
      z.style.display='block';
    
      
    } else {
      width++; 
      elem.style.width = width + '%'; 
      elem1.style.width = width + '%'; 
      elem2.style.width = width + '%';
       
       if(width>=1&&width<=4)
       {
          document.body.style.backgroundColor='black';
       }
       
       else if(width>=5&&width<=32)
       {
           document.body.style.backgroundColor='orange';
       
       }
       
      else if(width>=33&&width<=36)
       {
           document.body.style.backgroundColor='black';
       
       }
       
       else if(width>=37&&width<=64)
       {
       document.body.style.backgroundColor='lightskyblue';
       
      //     document.body.style.backgroundColor='blue';
        
       
       
       }
       
      else if(width>=65&&width<=68)
       {
           document.body.style.backgroundColor='black';
       
       }
       else if(width>=69&&width<=96)
       {
           document.body.style.backgroundColor='green';
       
       }
       
       else if(width>=97&&width<=100)
       {
           document.body.style.backgroundColor='black';
       
       }
       
       
      elem.innerHTML = width * 1  + '%';
      elem1.innerHTML = width * 1  + '%';
      elem2.innerHTML = width * 1  + '%';

  }
}
}

function b1click()
{
 //   alert('hello');
 var x=document.getElementById('b1-id');
    var body1=document.getElementById('main-div');
   
    var c2=document.getElementById('c2');
   
   
   
   if(body1.style.backgroundColor=='black')
   {
   body1.style.backgroundColor ='white';
 //   c2.style.backgroundColor ='white';
 //    c2.style.Color ='black';
   body1.style.color='black';
   x.innerHTML ='Night';
   }
   
 else
   {
   body1.style.backgroundColor ='black';
   body1.style.color='white';
//   c2.style.backgroundColor ='black';
//   c2.style.Color ='white';
   x.innerHTML ='Day';
   }


   
  //  alert(body1);
}



 





