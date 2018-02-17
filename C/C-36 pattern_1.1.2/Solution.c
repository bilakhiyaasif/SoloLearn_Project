
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

    for(i=0;i<=25;i++)
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
