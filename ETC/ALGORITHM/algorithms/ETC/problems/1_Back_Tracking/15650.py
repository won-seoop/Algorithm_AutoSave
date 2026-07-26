import sys

N,M=map(int,sys.stdin.readline().split())

v=[0]*(N+1)
ans=[]


def dfs(n, arr,max):
    if(n==M):
        ans.append(arr)
        return
    for j in range(1,N+1):
        if(v[j]==0 and j>max):
            v[j]=1
            tmp=max
            max=j
            dfs(n+1,arr+[j], max)
            v[j]=0
            max=tmp

dfs(0,[],0)
for i in ans:
    print(*i)