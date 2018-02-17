#Fibonacci series
#Recursive Approach
#enter n any number
#like comment

def recu(x1,x2,n):
    if n!=0:  
       z=x1+x2
       print(z,end="\n")
       x1=x2
       x2=z
       return recu(x1,x2,n-1)

n=int(input())
x1=0
x2=1
print(x1,end="\n")
print(x2, end="\n")
recu(x1,x2,n-2)
