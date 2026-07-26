import sys
from collections import deque

test_case_cnt = int(sys.stdin.readline())


dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


for _ in range(test_case_cnt):
    M, N, node_cnt = map(int, sys.stdin.readline().split())
    mat = [[0] * M for _ in range(N)]
    vst = [[False] * M for _ in range(N)]

    worm_cnt = 0

    for _ in range(node_cnt):
        y, x = map(int, sys.stdin.readline().split())
        mat[x][y] = 1

    def BFS(x, y):
        global worm_cnt # 이걸 함으로써 편집 가능
        que = deque([])
        que.append((x, y))
        vst[x][y] = True

        while que:
            now_x, now_y = que.popleft()
            for i in range(4):
                next_x, next_y = now_x + dx[i], now_y + dy[i]
                if next_x >= 0 and next_y >= 0 and next_x < N and next_y < M:
                    if mat[next_x][next_y] == 1 and vst[next_x][next_y] == False:
                        que.append((next_x, next_y))
                        vst[next_x][next_y] = True
        worm_cnt += 1

    for i in range(N):
        for j in range(M):
            if mat[i][j]==1 and vst[i][j]==False:
                BFS(i, j)
    
    print(worm_cnt)
