
/*
Armstrong Number

Example
---------------------
n=153
=(1**3)+(5**3)+(3**3)
=153
153-Armstrong Number 

Armstrong from 0 to n:
--show in output--

----------------------
Like, Comment, Upvote
----------------------
©Asif Bilakhiya
----------------------
*/





#include <stdio.h>
void developer_asif_bilakhiya()
{
    printf("\n__________________________________________");
printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
 printf("------------------------------------------");

}
int cube(int rem)
{
return (rem*rem*rem);
}
int is_fn(int t1)
{
int t=t1;
int rem=0;
int sum=0;
while(t!=0)
{
    rem=t%10;
    sum=sum+cube(rem);
    t=t/10;    
}

if(sum==t1)
{
    return 1;  
}
else
{
   return 0;    
}
    return 0;
}
int main() {
int x=0;
scanf("%d",&x);
printf("\n----------------------\n");
printf("Number:%d",x);
printf("\n----------------------\n");
int t=x;
printf("\n----------------------\n");
if(is_fn(t)==1)
{
    printf("%d is Armstrong",x);
}
else
{
      printf("%d is Not Armstrong",x); 
}
printf("\n----------------------\n");

printf("\n----------------------\n");
printf("ArmStrong from 0-%d",x);
printf("\n----------------------\n");
t=0;
while(t!=x+1)
{
if(is_fn(t)==1)
{
    printf("%d\n",t);
}
//printf("%d",t);
   t=t+1; 
}
printf("----------------------\n");
developer_asif_bilakhiya();
    return 0;   
}
