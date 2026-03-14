import sys

N,K=map(int, sys.stdin.readline().split())

a=[i for i in range(1,N+1)]
res=[]
idx=0
while(len(a) != 0):
    idx+=K-1
    if(idx>=len(a)):
        idx%=len(a)
    res.append(str(a.pop(idx)))

print("<",", ".join(res),">",sep="")