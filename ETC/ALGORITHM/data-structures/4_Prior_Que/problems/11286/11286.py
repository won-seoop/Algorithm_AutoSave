# 배열에 정수 x
# 절댓값이 가장 작은 값
    # 절댓값이 같은 경우 -> 더 작은 값 출력
    

import sys, os
import heapq

# input=sys.stdin=open(os.getcwd()+"//6_Prior_Que//11286//input.txt")
input=sys.stdin

que=[]

N=int(input.readline())

for _ in range(N):
    num=int(input.readline())
    if num != 0:
        if num<0:
            heapq.heappush(que,(-1*num,num))
        else:
            heapq.heappush(que,(num,num))
            
    else:
        if len(que)!=0:
            print(heapq.heappop(que)[1])
        else:
            print(0)