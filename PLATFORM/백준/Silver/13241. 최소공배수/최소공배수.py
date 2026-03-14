def GetGCF(a,b):
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
        

a,b=map(int,input().split())
gcf=GetGCF(a,b)
gcm=a*b/gcf
print(int(gcm))