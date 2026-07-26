import sys
from collections import deque

class Queue:
    def __init__(self):
        self.a=deque()
        self.size=0
        
    def push(self,n):
        self.size+=1
        return self.a.appendleft(n)
    
    def IsEmpty(self):
        if self.size==0:
            return True
        return False
        
    def pop(self):
        if self.IsEmpty()==False:
            self.size-=1
            print( self.a.pop())
        else:
            print(-1)
    
    def Size(self):
        print(self.size)
    
    def empty(self):
        if(self.IsEmpty()):
            print(1)
        else:
            print(0)
        
    def front(self):
        if(self.IsEmpty()==False):
            print(self.a[-1])
        else:
            print(-1)
    
    def back(self):
        if(self.IsEmpty()==False):
            print(self.a[0])
        else:
            print(-1)

N=int(sys.stdin.readline())
    
q=Queue()

func_map={
    "push": q.push,
    "pop":q.pop,
    "size":q.Size,
    "empty":q.empty,
    "front":q.front,
    "back":q.back
    
}

def act(tuple):
    if(len(tuple)==2):
        func_map[tuple[0]](int(tuple[1]))
    else:
        func_map[tuple[0]]()
        
for _ in range(N):
    tuple=sys.stdin.readline().split()
    act(tuple)