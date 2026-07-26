import sys

T = int(sys.stdin.readline())

dp0=[0]*41
dp1=[0]*41

dp0[0]=1
dp1[0]=0

dp0[1]=0
dp1[1]=1

dp0[2]=1
dp1[2]=1

for i in range(3,41):
    dp0[i] = dp0[i-1] + dp0[i-2]
    dp1[i] = dp1[i-1] + dp1[i-2]
    



for _ in range(T):
    n=int(sys.stdin.readline())
    print(f"{dp0[n]} {dp1[n]}")