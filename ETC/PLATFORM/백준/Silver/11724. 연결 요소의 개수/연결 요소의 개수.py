import sys
from collections import deque
N, M = map(int, sys.stdin.readline().split())

graph = [[False] * (N + 1) for _ in range(N + 1)]
vst = [False] * (N + 1)
cnt=0

for _ in range(M):
    a,b=map(int, sys.stdin.readline().split())
    graph[a][b]=True
    graph[b][a]=True


def bfs(node):
    global cnt
    que=deque([])
    que.append(node)
    vst[node]=True

    while que:
        node = que.popleft()
        for i in range(1,N+1):
            if graph[node][i]==True and vst[i]==False:
                que.append(i)
                vst[i]=True

    cnt += 1

for i in range(1,N+1):
    if vst[i]==False:
        bfs(i)


print(cnt)