# 굉장히 어렵다
# N과 M입력받기 v
# 2차원 배열 입력받기 v
# vst 2차원 배열 생성 v
# 갈 수 있는지 확인하는 함수 작성 v
# 큐에 현재 위치를 넣고 이 넣은 값에서 다음 움직일 수 있는 모든 좌표를 큐에 넣는다.
# 큐에서 꺼내고 만약 꺼낸 위치가 (N-1,M-1)이면 cnt를 출력하고 종료한다.


import sys
from collections import deque

N,M = map(int,sys.stdin.readline().split())
mat = [list(map(int, sys.stdin.readline().strip())) for _ in range(N)]
graph=[[0]*M for _ in range(N)]

que = deque([])


# 갈 수 있는지 확인하는 함수


def CanGo(x,y):
    if x<=(N-1) and y<=(M-1) and x>=0 and y >=0:
        if not graph[x][y] and mat[x][y] == 1:
            return True
    return False

# 빼고
# value를 vst에 넣어서 처리하자

graph[0][0]=1


dx=[-1,1,0,0]
dy=[0,0,-1,1]

def BFS(x,y):
    que.append((x,y))
    
    while que:
        x,y=que.popleft()
        for i in range(4):
            nx,ny=x+dx[i],y+dy[i]   # nx = now_x
            if CanGo(nx,ny):
                que.append((nx,ny))
                graph[nx][ny]=graph[x][y]+1

BFS(0,0)
print(graph[N-1][M-1])