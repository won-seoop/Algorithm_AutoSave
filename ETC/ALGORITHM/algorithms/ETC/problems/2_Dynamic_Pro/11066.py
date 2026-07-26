import sys

cnt=int(sys.stdin.readline())

"https://halo.oopy.io/1c3acfa8-9c47-8039-9142-cdda33b2952e"

def solve(list_):
    N=len(list_)
    dp=[[0]*N for _ in range(N)]

    def return_sum(i,j):
        sum=0
        for n in range(i,j+1):
            sum+=list_[n]
        return sum

    # 1. 누적합 삽입 , 누적합 = 초기 dp[i][j]
    for i in range(0,N-1):
        for j in range(i+1,N):
            dp[i][j] = return_sum(i,j)

    # 3. dp 매트릭스 채우기
    for k in range(0,N-1):
        for i in range(0,N-k-1):
            j=i+k+1
            dp[i][j]+=min([dp[i][m]+dp[m+1][j] for m in range(i,j)])
                

    return dp[0][N-1]

for _ in range(cnt):
    size=int(sys.stdin.readline())
    list_=list(map(int, sys.stdin.readline().split()))
    print(solve(list_))
