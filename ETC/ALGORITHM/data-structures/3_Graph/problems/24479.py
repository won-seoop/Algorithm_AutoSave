""" https://www.acmicpc.net/problem/24479"""

import sys
sys.setrecursionlimit(150000)  # 이 줄을 꼭 추가하세요!


N,M,R=map(int,sys.stdin.readline().split())

vst=[False]*(N+1)

links=[[] for _ in range(N+1)]
result=[]
cnt=1
order=[0]*(N+1)

def dfs(R):
    global cnt
    
    vst[R]=True
    order[R]=cnt
    cnt+=1
    
    links[R].sort()
    for i in links[R]:
        if vst[i]==False:
            dfs(i)
                        
for _ in range(M):
    x,y=map(int,sys.stdin.readline().split())
    links[x].append(y)
    links[y].append(x)
    

dfs(R)
for i in range(1,N+1):
    print(order[i])