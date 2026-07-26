import sys
from collections import deque
import copy

N = int(sys.stdin.readline())

mat = [list(sys.stdin.readline().strip()) for _ in range(N)]
vst = [[False] * N for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

normal_cnt=0
anomal_cnt=0


def bfs(i, j,vst,mat,cnt,k):
    que = deque([])
    que.append((i, j))
    vst[i][j] = True

    while que:
        x, y = que.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx >= 0 and ny >= 0 and nx < N and ny < N:
                if mat[nx][ny] == mat[x][y] and vst[nx][ny] == False:
                    que.append((nx, ny))
                    vst[nx][ny] = True
                    
    if k=='x':
        cnt[0]+=1
    else:
        cnt[1]+=1
    

# 적록색약 X

cnt=[0,0]

for i in range(N):
    for j in range(N):
        if vst[i][j] == False:
            bfs(i, j,vst,mat, cnt,'x')

rg_mat=copy.deepcopy(mat)
for i in range(N):
    for j in range(N):
        if rg_mat[i][j]== 'G':
            rg_mat[i][j] = 'R'
            


# vst 초기화
for i in range(N):
    for j in range(N):
        vst[i][j] = False

        

# 적록색약 O
for i in range(N):
    for j in range(N):
        if vst[i][j] == False:
            bfs(i, j,vst,rg_mat, cnt,'o')

print(f"{cnt[0]} {cnt[1]}")