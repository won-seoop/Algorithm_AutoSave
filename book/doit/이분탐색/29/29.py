# 20260506

# 1) goal.sort()
# 2) find for문
    # -> 이분탐색

import sys

input = sys.stdin.readline

N=int(input())

goal = list(map(int,input().split()))

goal.sort()


M=int(input())

find = list(map(int,input().split()))


def binary_search(arr, n):
    left,right = 0, len(arr)-1
    
    while left <=right:
        mid = (left+right)//2
        if arr[mid] == n:
            return True
        
        elif arr[mid] <n:
                left=mid+1
        else:
            right = mid -1
    return False

for i in find:
    if binary_search(goal,i):
        print(1)
    else:
        print(0)
