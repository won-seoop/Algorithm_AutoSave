import sys
from collections import deque

N = int(sys.stdin.readline())


mat = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

max_num=0

for i in mat:
    for j in i:
        if max_num<j:
            max_num=j
            

dx = [-1, 1, 0, 0]
dy = [0, 0, - 1, 1]

result=[]

def bfs(x, y,vst, h):
    que = deque([])
    que.append((x, y))
    vst[x][y] = True

    while que:
        x, y = que.popleft()
        for i in range(4):
            next_x, next_y = x + dx[i], y + dy[i]
            if next_x >= 0 and next_y >= 0 and next_x < N and next_y < N:
                if mat[next_x][next_y] > h and vst[next_x][next_y] == False:
                    que.append((next_x, next_y))
                    vst[next_x][next_y] = True

    
result=0

for k in range(0,max_num+1):
    vst = [[False] * N for _ in range(N)]
    cnt = 0
    
    for i in range(N):
        for j in range(N):
            if vst[i][j] == False and mat[i][j] > k:
                bfs(i, j, vst, k)
                cnt+=1
                
    if result<cnt:
        result=cnt

print(result)
