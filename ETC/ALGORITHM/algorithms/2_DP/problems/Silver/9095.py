import sys

'''
https://velog.io/@halo_3735/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-9095-123-%EB%8D%94%ED%95%98%EA%B8%B0
'''

T = int(sys.stdin.readline())

dp = [0] * (12)
dp[1] = 1
dp[2] = 2
dp[3] = 4

for i in range(4, 12):
    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
            
for _ in range(T):
    n = int(sys.stdin.readline())
    
    print(dp[n])