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

            
    
# 결론
# 1. 더 긴 선의 길이로 얻고자하는 선의 개수만큼 얻을 수 있다면
#   mid보다 큰 값 = left = mid + 1로 탐색을 진행하면 되고

# 2. 얻고자하는 선의 개수를 만족하지 않아, 선을 더 작게 가져가야 한다면
#   mid보다 작은 값 = right = mid - 1로 탐색을 진행해야 한다.


