import sys
import math
N=int(sys.sㄹtdin.readline())
dp=[0]*(N+1)

dp[1]=0

# dp[i] = 1 + min(dp[i//2], dp[i//3], dp[i-1])
for i in range(2,N+1):
    
    # v1 : dp/3, v2 : dp/2, v3 : dp[i-1]
    v1,v2,v3=math.inf,math.inf,dp[i-1]    
    
    if i%3==0:
        v1=dp[i//3]
    if i%2==0:
        v2=dp[i//2]
    
    dp[i]=1+min(v1,v2,v3)

print(dp[N])