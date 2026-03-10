import sys

input = sys.stdin.readline


N,K = map(int, input().split())

a=[]

for i in range(N):
    a.append(int(input()))
    

# 이분탐색

max_num = max(a)

left = 1
right = max_num
ans = 0

while left <= right:
    mid = (left + right) //2
    cnt = 0
    
    for i in a:
        cnt += i//mid
    
    
    if cnt >= K :
        left = mid + 1
        ans = mid
        
    else:
        right = mid - 1

print(ans)

            
    