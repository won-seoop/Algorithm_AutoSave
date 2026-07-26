import sys
from collections import deque

# sys.setrecursionlimit(10**6)

N, K = map(int, sys.stdin.readline().split())

# time = [0] * (2 * K)

# min = 1000000


# def dfs(x, K, cnt):
#     global min
#     if x == K:
#         min = cnt
#         return 0

#     next_value = x + 1
#     if next_value >= 0 and cnt < min:
#         dfs(next_value, K, cnt + 1)
#     next_value = x - 1
#     if next_value >= 0 and cnt < min:
#         dfs(next_value, K, cnt + 1)
#     next_value = 2 * x
#     if next_value >= 0 and cnt < min:
#         dfs(next_value, K, cnt + 1)


# dfs(N, K, 0)
# print(min)
MAX=100005
vst=[False]*MAX
time=[0]*MAX

def bfs(N, K):
    que = deque([])
    que.append(N)
    time[N]=0

    while 1:
        X = que.popleft()
        if X == K:
            break
        next_x=X-1
        if next_x>=0 and next_x<MAX:
            if vst[next_x]==False:
                que.append(next_x)  
                time[next_x]=time[X]+1
                vst[next_x]=True
        next_x=X+1
        if next_x>=0 and next_x<MAX:
            if vst[next_x]==False:
                que.append(next_x)
                time[next_x]=time[X]+1
                vst[next_x]=True
        next_x=2*X
        if next_x>=0 and next_x<MAX:
            if vst[next_x]==False:
                que.append(next_x) 
                time[next_x]=time[X]+1
                vst[next_x]=True
            

bfs(N,K)
print(time[K])

