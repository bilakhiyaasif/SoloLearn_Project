
/*

*
##
***
####
*****
######
.....
 
*/
#include <stdio.h>
int main() {

int i=0,k=0;
int n=0;
scanf("%d",&n);
    for(i=0;i<=n;i++)
        {
            for(k=0;k<i;k++)
            {
            if(i%2==0)
            {
                printf("#");
            }
            else
            {
                printf("*");
            }
            }
            printf("\n");
        }

    return 0;
}
