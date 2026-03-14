# 제목 : N과 M (3)
# 

import sys

N,M=map(int,sys.stdin.readline().split())

ans=[]


def dfs(n, arr,max):
    if(n==M):
        ans.append(arr)
        return
    for j in range(1,N+1):
        
            tmp=max
            max=j
            dfs(n+1,arr+[j], max)
            max=tmp

dfs(0,[],0)
for i in ans:
    print(*i)