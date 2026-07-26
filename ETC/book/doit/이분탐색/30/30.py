# 블루레이 만들기 (고)백준 2343

import sys

input = sys.stdin.readline

N,M =map(int,input().split())
a=list(map(int,input().split()))

left = max(a)
right= sum(a)
ans=0


while left <= right:
    sum=0
    cnt=1
    mid = (left+right)//2
    for i in a:
        if sum+i <=mid:
            sum+=i
        else:
            cnt+=1
            sum=i
    
    if cnt <= M:
        right = mid -1
        ans=mid
    else:
        left =mid +1
    
        
    
        
print(ans)

    

