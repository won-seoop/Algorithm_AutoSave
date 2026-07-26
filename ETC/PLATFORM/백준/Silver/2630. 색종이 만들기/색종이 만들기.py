# 플랫폼 : 백준
# 문제번호 : 2630
# 수준 : 실버2
# 알고리즘 : 분할정복

import sys
import os


# input = sys.stdin = open(os.getcwd() + "//input.txt", "r")
input=sys.stdin
N = int(input.readline())
mat = [list(map(int, input.readline().split())) for _ in range(N)]


# 0 : 하얀색
# 1 : 파란색

result = []


def dc(x, y, N, mat):
    color = mat[x][y]

    for i in range(x, x + N):
        for j in range(y, y + N):
            if color != mat[i][j]:
                dc(x, y, N // 2, mat)
                dc(x, y + N // 2, N // 2, mat)
                dc(x + N // 2, y, N // 2, mat)
                dc(x + N // 2, y + N // 2, N // 2, mat)
                return

    if color == 1:
        result.append(1)
    else:
        result.append(0)


def solution(N, mat):

    dc(0, 0, N, mat)
    print(result.count(0))
    print(result.count(1))


if __name__ == "__main__":
    solution(N, mat)
