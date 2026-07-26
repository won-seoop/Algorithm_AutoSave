import sys
from collections import deque


# 큐에 넣은 순간 방문처리!!

N = int(sys.stdin.readline())

mat = [list(map(int, sys.stdin.readline().strip())) for _ in range(N)]
vst = [[False] * N for _ in range(N)]


dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

result = []


def BFS(x, y):
    que = deque([])
    vst_cnt = 0
    que.append((x, y))
    vst[x][y] = True

    while que:
        now_x, now_y = que.popleft()
        vst_cnt += 1

        for i in range(4):
            next_x, next_y = now_x + dx[i], now_y + dy[i]
            if next_x >= 0 and next_y >= 0 and next_x < N and next_y < N:
                if vst[next_x][next_y] == False and mat[next_x][next_y] == 1:
                    que.append((next_x, next_y))
                    vst[next_x][next_y] = True

    result.append(vst_cnt)


for i in range(N):
    for j in range(N):
        if mat[i][j] == 1 and vst[i][j] == False:
            BFS(i, j)


print(len(result))
result.sort()
for i in result:
    print(i)
