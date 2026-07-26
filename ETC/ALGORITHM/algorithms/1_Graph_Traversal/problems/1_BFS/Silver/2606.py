import sys
from collections import deque

node_cnt = int(sys.stdin.readline())
edge_cnt = int(sys.stdin.readline())

graph = [[0] * (node_cnt + 1) for _ in range(node_cnt + 1)]
for _ in range(edge_cnt):
    x, y = map(int, sys.stdin.readline().split())
    graph[x][y] = 1
    graph[y][x] = 1
    

vst = [0] * (node_cnt + 1)

cnt=-1
que=deque([])
def BFS(num):
    global cnt
    que.append(num)
    vst[num]=1
    
    while que:
        now_node=que.popleft()    
        cnt+=1
        for i in range(1,node_cnt+1):
            if graph[now_node][i] == 1 and vst[i]==0:
                que.append(i)
                vst[i]=1
                
BFS(1)
print(cnt)
                

    
    