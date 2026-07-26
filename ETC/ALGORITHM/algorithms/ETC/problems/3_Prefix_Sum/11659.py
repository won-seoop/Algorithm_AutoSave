import sys

N,M=map(int, sys.stdin.readline().split())  



P=[0]*N

def set_P(arr):
    P[0]=arr[0]
    for i in range(1,len(arr)):
        P[i]=arr[i]+P[i-1]

arr=list(map(int,sys.stdin.readline().split()))
set_P(arr)

def Get_Pre_Sum(P,i,j):
    if i==0:
        return P[j]
    else:
        return P[j]-P[i-1]

for _ in range(M):
    i,j=map(int,sys.stdin.readline().split())
    i-=1
    j-=1
    print(Get_Pre_Sum(P,i,j))