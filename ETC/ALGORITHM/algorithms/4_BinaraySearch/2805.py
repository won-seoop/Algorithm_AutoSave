import sys 

input = sys.stdin.readline

N,M = map(int, input().split())

a = list(map(int,input().split()))


# 2. RuntimeError 해결 구간
# left=1 -> 이 방식이면 답이 0인 경우를 무시하기 때문에 0부터 left를 시작해야한다.
left = 0


right = max(a)

while left <= right:
    mid = (left+right) // 2
    sum=0
    
    for i in a:
        if i-mid >= 0 :
            sum+=i-mid    
        # 1. 시간초과 해결 구간
        if sum >= M:
            break
    
    if sum >= M:
        ans = mid
        left = mid + 1
        
    else:
        right = mid -1
        
    # print(f"ans : {ans}, sum : {sum}")
    
        
print(ans)

# 이분탐색

# 포인트 1
# 자르려고 하는 나무의 길이가 자르는 길이보다 작으면, for문으로 자르는 연산에서 해당 나무를 제외해야한다.