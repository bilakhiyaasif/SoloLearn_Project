
/* 
stack c version
-push()
-pop()
-peek()
-trace()
-isempy()
-array based implementation

-set any size

Like,share,comment
©_Asif Bilakhiya

*/




#include <stdio.h>

int stack_arr[10]; //size
int top=-1;
//void main_console();
int main() {
int i=1;


printf("stack is empty ?:\t");
isempty();

while(i<=12)
{
  push(i);
  i++;
}
i=0;
peek();
printf("stack is empty ?:\t");
isempty();
while(i<=12)
{
  pop();
  i++;
}



printf("stack is empty ?:\t");
isempty();
    return 0;
}

void push(int i)
{
//overflow
if(top==sizeof(stack_arr)/4)
{
  printf("stack flag:\toverflow\n");
}
else
{
    top=top+1;
    stack_arr[top]=i;  
    stack_data();
}

}
void pop()
{
//underflow
if(top==-1)
{
 printf("stack flag:\tunderflow\n");   
}
else
{
printf("stack pop:\t%d\n",stack_arr[top]);
top=top-1;
stack_data();
}
}
int peek()
{
if(top==-1)
{
    return -1;
}
printf("stack top:\t%d\n",stack_arr[top]);
}
void isempty()
{
   if(top==-1) 
   {
       printf("Yes\n");
   }
   else
   {
       printf("No\n");
   }
}

void stack_data()
{
int i=0;
printf("stack Trace:\t[");
    for(i=top;i>=0;i--)
    {
       printf("%d,",stack_arr[i]);
    }
printf("]\n");
}
