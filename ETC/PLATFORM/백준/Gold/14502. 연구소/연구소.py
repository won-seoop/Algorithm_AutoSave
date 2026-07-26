import sys
from collections import deque
import copy

sys.setrecursionlimit(10**5)

# 가로 : N, 세로 : M
N, M = map(int, sys.stdin.readline().split())
mat = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]




res = 0

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]



def bfs():
    que = deque([])
    tmp_mat=copy.deepcopy(mat)
    
    for i in range(N):
        for j in range(M):
            if mat[i][j] == 2:
                que.append((i, j))
        
    cnt=0
    while que:
        x, y = que.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if nx>=0 and ny>=0 and nx<N and ny<M:
                if tmp_mat[nx][ny] == 0:
                    que.append((nx,ny))
                    tmp_mat[nx][ny]=2
    
    
    for i in tmp_mat:
        for j in i:
            if j==0:
                cnt+=1
    return cnt               


def dfs(cnt):
    global res
    if cnt==3:
        safe_zone_cnt = bfs()
        if safe_zone_cnt>res:
            res=safe_zone_cnt
        return

    for i in range(N):
        for j in range(M):
            if mat[i][j]==0:
                mat[i][j]=1
                dfs(cnt+1)
                mat[i][j]=0
    

dfs(0)
print(res)