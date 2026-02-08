import sys

input = sys.stdin.readline

N,M = map(int, input().split())


a = [0] + list(map(int, input().split()))
p = [0] * (N+1)
p_3 = [0] * (N+1)

cnt=[0]*M # 0,1,2


for i in range(1,N+1):
    p_3[i] = (p_3[i-1]+a[i]) % M

for i in p_3:
    cnt[i]+=1

ans = 0 

for i in cnt:
    if (i>=2):
        ans+=i*(i-1)//2
        

print(ans)

