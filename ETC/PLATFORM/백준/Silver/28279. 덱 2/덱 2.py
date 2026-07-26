import sys
from collections import deque

class Dec:
    def __init__(self):
        self.dec = deque([])
    
    #1
    def PushFront(self, n):
        self.dec.appendleft(n)
    #2
    def PushBack(self, n):
        self.dec.append(n)
    #3
    def PopFront(self):
        if self.IsEmpty():
            return -1
        return self.dec.popleft()

    #4
    def PopBack(self):
        if self.IsEmpty():
            return -1
        return self.dec.pop()

    #5
    def Size(self):
        return len(self.dec)
    #6
    def IsEmpty(self):
        if len(self.dec) == 0:
            return 1
        return 0
    
    #7
    def PeekFront(self):
        if self.IsEmpty():
            return -1
        return self.dec[0]
    
    #8
    def PeekBack(self):
        if self.IsEmpty():
            return -1
        return self.dec[-1]
    
N=int(sys.stdin.readline())

d=Dec()
m={
    1:d.PushFront,
    2:d.PushBack,
    3:d.PopFront,
    4:d.PopBack,
    5:d.Size,
    6:d.IsEmpty,
    7:d.PeekFront,
    8:d.PeekBack
}

for _ in range(N):
    t=tuple(map(int, sys.stdin.readline().split()))
    if t[0]==1:
        m[1](t[1])
    elif t[0]==2:
        m[2](t[1])
    else:
        print(m[t[0]]())
        
