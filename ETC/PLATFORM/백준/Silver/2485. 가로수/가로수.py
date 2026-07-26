import sys

def GetGCD(a,b):
    if(b>a):
        tmp=a
        a=b
        b=tmp
    cc=1
    while(cc!=0):
        cc=a%b
        a=b
        b=cc
    return a
        
n=int(sys.stdin.readline())
a=[]
k=0
before=int(sys.stdin.readline())

for _ in range(n-1):
    k=int(sys.stdin.readline())
    a.append(k-before)
    before=k

gcd=a[0]
for i in range(1,n-1):
    gcd=GetGCD(gcd,a[i])

cnt=0

for i in a:
    cnt+=i//gcd-1        
print(cnt)