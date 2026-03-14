import sys
from collections import deque

day = 0

# M :가로, N : 세로
M, N = map(int, sys.stdin.readline().split())



mat = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

que = deque([])

for i in range(N):
    for j in range(M):
        if mat[i][j] == 1:
            que.append((i, j))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs():
    while que:
        x, y = que.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx>=0 and ny>=0 and nx<N and ny<M:
                if mat[nx][ny]==0:
                    mat[nx][ny]=mat[x][y]+1
                    que.append((nx,ny))

bfs()
res=0
for i in mat:
    for j in i:
        if j==0:
            print(-1)
            exit(0)
        else:
            res=max(int(res),j)

res-=1

print(res)
