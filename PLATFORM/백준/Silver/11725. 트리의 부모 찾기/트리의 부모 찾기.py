import sys

sys.setrecursionlimit(10**6)
N=int(sys.stdin.readline())

vst=[False]*(N+1)
graph=[[]for _ in range(N+1)]

parent_info=[0]*(N+1)

for _ in range(N-1):
    n1,n2=map(int,sys.stdin.readline().split())
    graph[n1].append(n2)
    graph[n2].append(n1)
    
def dfs(n):
    vst[n]=True
    
    for i in graph[n]:
        if vst[i]==False:
            parent_info[i]=n
            dfs(i)
    
dfs(1)

for i in range(2,N+1):
    print(parent_info[i])