#include <stdio.h>
void developer_asif(){
printf("\n__________________________________________");
printf("\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\n|\t| ->Developer:Asif Bilakhiya\t\t\t\t\t\t\t\t\t|\n|\t| ->https://www.sololearn.com/Profile/928735/?ref=app\t\t\t\t\t|\n|\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| if(u_satisfy(true))\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| like(please);\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n|\t| }\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
printf("------------------------------------------");
}
int main() {
int n=0;
scanf("%d",&n);
int i,j;

//pattern-1  
printf("---------------------\n");
//printf("\n");
//printf("\n"); 
  
for( i=1;i<=n;i++) 
        {
            for( j=1;j<=i;j++)
            {
                printf("%d",i);
            }
            printf("\n");
        }
//pattern-2 
printf("---------------------\n");
//printf("\n");
//printf("\n"); 
     
for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                printf("%d",j);
            } 
              printf("\n");
        }
//pattern-3
printf("---------------------\n");
//printf("\n");
//printf("\n"); 

for( i=1;i<=n*2;i+=2)
{
  for(j=1;j<=i;j+=2)
  {
    printf("%d",j);
  }
  printf("\n");
}   
//pattern-4
printf("---------------------\n");
//printf("\n");
//printf("\n");

 for( i=0;i<=n;i++)
  {
    for(j=0;j<i;j++)
    {
      if(j%2==0) 
            {
            printf("0");
            }
    else
    {
      printf("1");
    }
    }
    printf("\n");
  }   
    printf("---------------------\n");
developer_asif();
    return 0;
}
