import sys

def dfs(row):
    global result
    if(row==N):
        result+=1
        return
    
    for col in range(0,N):
        if (v1[col]==0 and v2[col+row]==0 and v3[row-col]==0):
            v1[col]=v2[col+row]=v3[row-col]=1
            dfs(row+1)
            v1[col]=v2[col+row]=v3[row-col]=0

N=int(sys.stdin.readline())

v1=[0]* N
v2=[0]*(2*N)
v3=[0]*len(v2)

result=0
dfs(0)
print(result)
