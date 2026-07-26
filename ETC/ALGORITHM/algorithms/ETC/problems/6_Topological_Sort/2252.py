import sys
from collections import deque

N,M=map(int,sys.stdin.readline().split())

graph=[[] for _ in range(N+1)]
entryCnt=[0]*(N+1)

for _ in range(M):
    a,b = map(int,sys.stdin.readline().split())
    graph[a].append(b)
    entryCnt[b]+=1
    
result=[]
que=deque()

# 초기넣
for i in range(1,N+1):
    if entryCnt[i] == 0:
        que.append(i)
        
# 빼지넣
while que:
        
    # 빼고
    node = que.popleft()
    result.append(node)
    
    #지우고
    for i in graph[node]:
        entryCnt[i]-=1
        #넣고 -> graph 리스트를 통해 해당 노드와 연결된 노드들만 진입차수 0인지 확인 가능!
        if entryCnt[i]==0:
            que.append(i)

print(*result)
