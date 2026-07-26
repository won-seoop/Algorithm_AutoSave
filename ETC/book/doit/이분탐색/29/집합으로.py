

import sys

input = sys.stdin.readline
N=int(input())
a=set(map(int,input().split()))
M=int(input())

b=list(map(int,input().split()))


for i in b:
    if i in a:
        print(1)
    else:
        print(0)     
        
# python3 -u "/Users/wonhyeonseob/dev/study/Algorithm_AutoSave/book/doit/이분탐색/29/집합으로.py"