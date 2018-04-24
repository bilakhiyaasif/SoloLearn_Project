
function image_chnge()
{
alert('Platinum Code\n\nupdated 22_03_2018\n');
alert('Please Like,Comment\n\nWait just a Second.....');
//alert('');
    var imageid1=document.getElementById('imageset1');
    var nm1=document.getElementById('nm1');

    var imageid2=document.getElementById('imageset2');
    var nm2=document.getElementById('nm2');

    var imageid3=document.getElementById('imageset3');
    var nm3=document.getElementById('nm3');

    var imageid4=document.getElementById('imageset4');
    var nm4=document.getElementById('nm4');






    var img_array1=[

'https://api.sololearn.com/Uploads/Avatars/7322617.jpg'
    ,'https://api.sololearn.com/Uploads/Avatars/7169225.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/7637634.jpg'
        ,'https://www.sololearn.com/avatars/818696cc-3446-4070-9f38-173d5e923c6a.jpg'    
      ,'https://api.sololearn.com/Uploads/Avatars/7939418.jpg'
    ,'https://www.sololearn.com/Images/NoAvatar.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/4966011.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/1148141.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/5778481.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/6272751.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/579567.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/842115.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/4686069.jpg'
    ,'https://api.sololearn.com/Uploads/Avatars/6294557.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/6306716.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/4714357.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/7238954.jpg'
    ,'https://api.sololearn.com/Uploads/Avatars/5396323.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/1808907.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/1231853.jpg'
];
    var name_array1=[
'Alexandra',
'RAVI KARTHIK',
'Nelson Lobo',
'Ashish Pundir',
'optimist Programmer',
'Olena',
'Amene Zoormand',
'Hans Larry Mba Bekale',
'Yasser Linux',
'DT',
'John Wells',
'Abdur-Rahmaan',
'Prop de Puppy',
'Elizabeth',
'Jyoti',
'Shudarshan Rai',
'Sreelakshmy AJ',
'Richard Myatt',
'CHaran LEo25',
'Wongalethu Sidwell Jezile'
    ];




    var img_array2=[
'https://api.sololearn.com/Uploads/Avatars/1089258.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5770621.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
,'https://api.sololearn.com/Uploads/Avatars/3383012.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5857651.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6136027.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7363698.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5040440.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6305872.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7427209.jpg'
,'https://api.sololearn.com/Uploads/Avatars/3883571.jpg'
,'https://api.sololearn.com/Uploads/Avatars/4944198.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7960052.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5080046.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6585615.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6770483.jpg'
];
  var name_array2=[
    'niteOwLTwO'
    ,'Kim San I'
    ,'Infinity'
    ,'code learner'
    ,'rudolph flash'
    ,'Karu Hansda'
    ,'sachin'
    ,'jay'
    ,'Youssef Ouamou'
    ,'Learnsolo'
    ,'Daljit Singh'
    ,'Gaurav Agrawal'
    ,'sachin malode'
    ,'WebDev Sandeep Rawat'
    ,'Swapnil Srivastava'
    ,'Pringle'
    ,'Abhi Varshini'
    ,'Charlie Mitchell'
    ,'ZeUs'
  ];






    var img_array3=[
'https://api.sololearn.com/Uploads/Avatars/6990962.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6637349.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7598815.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7580916.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5369091.jpg'
,'https://api.sololearn.com/Uploads/Avatars/1515047.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7507912.jpg'
,'https://api.sololearn.com/Uploads/Avatars/4307609.jpg'
,'https://api.sololearn.com/Uploads/Avatars/5327650.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7376147.jpg'
,'https://api.sololearn.com/Uploads/Avatars/1049843.jpg'
,'https://api.sololearn.com/Uploads/Avatars/4687793.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6177022.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7195610.jpg'
,'https://api.sololearn.com/Uploads/Avatars/7185808.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
,'https://api.sololearn.com/Uploads/Avatars/6094307.jpg'
,'https://www.sololearn.com/Images/NoAvatar.jpg'
];

var name_array3=[
'Danijel Ivanovic'
,'Alfred Toengaho'
,'Kehinde Ogunrinola'
,'Anuska'
,'A Z M Mushfiqur Rahman'
,'Pravin Pandey'
,'KRISHNA VIJAY'
,'Arslan P'
,'LukArToDo'
,'Dilhara Abeysinghe'
,'Yulia  Svetoch'
,'Deepak Gautam'
,'Kavi'
,'Jovin Sanga'
,'capsloth'
,'Manoj kumar'
,'4rontender'
,'Torrance'
];

var name_array4=[
'Arushi Singhaniya'
,'Mark van Gennip'
,'pedro'
,'Jayden LeCorps'
,'Manish Kumar'
,'Jaydeep Khatri'
,'Michael Ngwerume'
,'salif Mehmed'
,'Koketso Dithipe'
,'Dinesh kewlani'
,'Kulanga Kaushani'
,'Scorpia Rising'
,'Ali Bzeih'
,'Dennish Peterson'
,'Mr Alternative'
,'TIM MILLAR'
,'Athena'
,'MARTA'
,'Pyu Pyu'
,'Barad Kaushik'
,'Andrey Vasiljevich'
,'Veress Odon'
,'Brains'
];








    var img_array4=[
      'https://www.sololearn.com/Images/NoAvatar.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/1637827.jpg'
      ,'https://www.sololearn.com/Images/NoAvatar.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7315954.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/4051435.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/487380.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/3745102.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7499537.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/324940.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7912183.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7064261.jpg'
      ,'https://www.sololearn.com/avatars/f2d73033-1502-44b4-aa9e-2d7fdcf5dedf.jpg'
      ,'https://www.sololearn.com/Images/NoAvatar.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/3618381.jpg'
      ,'https://www.sololearn.com/Images/NoAvatar.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7438830.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/7656432.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/6577002.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/8003781.jpg'
      ,'https://www.sololearn.com/Images/NoAvatar.jpg'
        ,'https://api.sololearn.com/Uploads/Avatars/6114349.jpg'
      ,'https://api.sololearn.com/Uploads/Avatars/64545.jpg'
      ,'https://www.sololearn.com/avatars/6a32511d-b40e-47c9-9787-bdf8b4ccbd41.jpg'
    ];



var nm_c1=0;
var img_c1=0;

var nm_c2=0;
var img_c2=0;

var nm_c3=0;
var img_c3=0;

var nm_c4=0;
var img_c4=0;
var t_i=1;
  var id=setInterval(frame,3000);

    function frame()
    {
    if(t_i==1){
    document.body.style.display="block";
    document.body.style.backgroundColor="#000066";
    t_i=0;
    }
//1
     if(img_c1==img_array1.length)
     {
       nm_c1=0;
       img_c1=0;
     }
  

     
//2
     if(img_c2==img_array2.length)
     {
       nm_c2=0;
       img_c2=0;
     }
   


//3
     if(img_c3==img_array3.length)
     {
       nm_c3=0;
       img_c3=0;
     }
    




    //4
         if(img_c4==img_array4.length)
         {
           nm_c4=0;
           img_c4=0;
         }
     



   imageid1.src=img_array1[img_c1];
    
   imageid2.src=img_array2[img_c2];
    
      imageid3.src=img_array3[img_c3];
   
         imageid4.src=img_array4[img_c4];
      
         
        nm1.innerHTML=name_array1[nm_c1];  
         nm2.innerHTML=name_array2[nm_c2]; 
           nm3.innerHTML=name_array3[nm_c3];
              nm4.innerHTML=name_array4[nm_c4];
              
              
     nm_c1+=1;
     img_c1+=1;
     nm_c2+=1;
     img_c2+=1;
     nm_c3+=1;
     img_c3+=1;
         nm_c4+=1;
         img_c4+=1;
        }
}
