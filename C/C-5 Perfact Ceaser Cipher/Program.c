/*
input:
any string that you like 
  
  
*/
#include <stdio.h> 
#include <stdlib.h>
#include<string.h>
int main()   
{ 
char in[50];//={'M','E','S','S','A','G','E'};
gets(in);
 
puts("String:");
puts(in); 
char out[80];
int i,j,k,l=0,m,n;  
int key=3;
printf("\nKey:%d",key);
//printf("enter msg to encrypt:");

//scanf("%s",in);
//printf("key:");
//scanf("%d",&key);
char c;

for(i=0;i<strlen(in);i++)
{
c=in[i];
// printf("%c",c);

//
if(c>='a' && c<='z') 
{
c=c+key;
if(c>'z') 
{
c=c-'z'+'a'-1;
}
in[i]=c;
}


if(c>='A' && c<='Z')
{
c=c+key;
if(c>'Z')
{
c=c-'Z'+'A'-1;
}
in[i]=c;
}

/*
if(c>='0'&&c<='9')
{
   //printf("%c",c) ;
   c=c+key;
   in[i]=c;
}
*/
}
printf("\nEncrypted Msg:%s",in);
printf("\n");
char d;
int de_key=3;
printf("\nDecryption Key:%d",de_key);
//printf("\nenter decryption key:");
//scanf("%d",&de_key);
for(i=0;i<strlen(in);i++)
{
d=in[i];
if(d>='a' && d<='z')
{
d=d-de_key;
if(d<'a')
{
d=d+'z'-'a'+1;
}
in[i]=d;
}
if(d>='A' && d<='Z')
{
d=d-de_key;
if(d<'A')
{
d=d+'Z'-'A'+1;
}
in[i]=d;
}

/*
if(d>='0'&&d<='9')
{
   //printf("%c",c) ;
   d=d-de_key;
   in[i]=d;
}
*/
}
printf("\nDecrypted Msg:%s",in);
printf("\n");


   printf("\n__________________________________________");
printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
 printf("------------------------------------------");
return 0;
}
