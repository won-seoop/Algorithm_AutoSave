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
        
# 1 : 분자, 2:  분모
a1,a2=map(int,input().split())
b1,b2=map(int,input().split())

c2 = a2*b2
c1 = a1*b2 + a2*b1

k=GetGCD(c1,c2)

c1=c1/k
c2=c2/k

print(f"{int(c1)} {int(c2)}")
