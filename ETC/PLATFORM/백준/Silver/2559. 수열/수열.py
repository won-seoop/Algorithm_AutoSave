import sys
input = sys.stdin.readline

N,K = map(int, input().split())

a=list(map(int, input().split()))

dp=[0]*(len(a)+1)

for i in range(1,N+1):
    dp[i]=dp[i-1]+a[i-1]

    

max=-100000000
ans=0


for i in range(0,N-K+1):
    ans=dp[i+K]-dp[i]
    
    if max<ans:
        max=ans

print(max)
