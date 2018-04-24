"""
challenge     -Perfact Number
link          -https://www.sololearn.com/learn/4646/

Thank you ,please like ,Comment


Input:6 or any number
Output:True

Example:
6 is Perfect Number:

divisors of 6 is : =1,2,3
            sum  : =1+2+3
                   =6

©Asif Bilakhiya
"""
def check(i):
    sum=0
    for k in range(1,i):
        if i%k==0:
            sum=sum+k;
    if sum==i:
        return True
    else: False 
      
#check single Num for Perfect or not

n=int(input())
s=0
for i in range(1,n):
    if n%i==0:
       s=s+i;
if s==n:
    print(n,"-->(True)\tPerfect Number")
else:
    print(n,"-->(False)\tNot Perfect Number")  
   
   
   
   
#check perfect Num in Range 

j=0
print("\nPerfect Num from Range 1 to ",n,"") 
print("-----------------------------------") 
for i in range(1,n+1):
    t1=check(i)
    if t1:
        if i<=9:
            print(str("0")+str(i)+" ",end='\t')
        else:
            print(str(i)+" ",end='\t')
        



        
