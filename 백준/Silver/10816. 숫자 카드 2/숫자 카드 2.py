import sys

input = sys.stdin.readline

dic = dict()

N = int(input())

arr = sorted(list(map(int, input().split())))

M = int(input())

nums = list(map(int, input().split()))


for num in arr:
    if num in dic:
        dic[num]+=1
    else:
        dic[num]=1
        
for i in nums:
    if i in dic:
        print(dic[i], end=" ")
    else:
        print(0, end=" ")