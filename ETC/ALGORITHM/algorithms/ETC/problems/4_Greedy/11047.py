import sys

input=sys.stdin.readline

N,K = map(int, input().split())

a=[]
result=0

for _ in range(N):
    a.append(int(input()))

for i in range(len(a)-1,-1,-1):
    if K//a[i]>0:
        result+=K//a[i]
        K%=a[i]

print(result)