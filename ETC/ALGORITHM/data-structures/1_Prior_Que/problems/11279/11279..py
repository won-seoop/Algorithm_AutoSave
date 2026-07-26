import sys
import os
from queue import PriorityQueue

# input=sys.stdin=open(os.getcwd()+"//6_Prior_Que//11279//input.txt")
input=sys.stdin

N=int(input.readline())

que=PriorityQueue()

for _ in range(N):
    num=int(input.readline())
    
    if num==0:
        if que.empty():
            print(0)
        else:
            print(-1*que.get())
    
    else:
        que.put(num*-1)