import sys
input = sys.stdin.readline

N, M = map(int, input().split())


a = list(map(int,input().split()))

p=[0]*N

p[0]=a[0]

for i in range(1,N):
    p[i]=p[i-1]+a[i]


for i in range(M):
    s,e = map(int, input().split())
    
    if s==1:
        print(p[e-1])
    else:
        print(p[e-1]-p[s-2])

