import sys

input = sys.stdin.readline

N = int(input())

a = sorted(list(map(int, input().split())))


M = int(input())


n_arr = list(map(int, input().split()))

def bs(n):
    left = 0
    right = N-1
    
    
    while left <= right:
        mid = (left + right) // 2
        
        if n == a[mid]:
            return mid

        elif n <= a[mid]:
            right = mid -1
        
        else:
            left = mid + 1
    return -1


def find_left_right(idx, n):
    origin_idx = idx
    cnt = 1
    start_idx = 0
    end_idx = N-1
    
    # 왼쪽 찾기
    while idx > 0 :
        idx -=1
        if a[idx] == n:
            cnt+=1
        else:
            break
        
    idx = origin_idx
    # 왼쪽 찾기
    while idx < end_idx :
        idx +=1
        if a[idx] == n:
            cnt+=1
        else:
            break
    
    return cnt       

    
    # 오른쪽 찾기
        
ans = []
for n in n_arr:
    cnt=0
    idx = bs(n)
    
    if idx == -1:
        cnt = 0
    else:
        cnt = find_left_right(idx, n)
    
    ans.append(cnt)
        
for i in ans:
    print(i, end=" ")