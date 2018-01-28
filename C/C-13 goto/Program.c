#include<stdio.h>
int main()
{ 
    int a,b=2; 
    printf("|--------------------------------|\n");
    printf("|Square table 1 to 20 using Goto:|\n");
    printf("|--------------------------------|\n");
  //  printf("|        |\n");
    a=0;
    start:a++;
    if(a<=20)
    {
        if(a>=1&&a<=3) 
        {
            printf("|\t\t %d^%d=%d\t\t\t\t| \n",a,b,(a*a));
             goto start;
        }
        else if(a>=4&&a<=9)
        {
             printf("|\t\t %d^%d=%d\t\t\t\t|\n",a,b,(a*a));
             goto start;
        }
        else 
        {
            printf("|\t\t%d^%d=%d\t\t\t|\n",a,b,(a*a));
            goto start;
        }
    }
            printf("|--------------------------------|\n");
            
             
       printf("\n__________________________________________");
printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
printf("------------------------------------------");
}
