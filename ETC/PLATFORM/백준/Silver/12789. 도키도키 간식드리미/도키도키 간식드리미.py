# 틀린 이유 : num이랑 스택 peek랑 중간에 비교하지 않음.

import sys
class Stack:
    def __init__(self):
        self.stack=[]
        self.top=-1
    
    def IsEmpty(self):
        if self.top==-1:
            return True
        return False   
    
    def Push(self,n):
        self.stack.append(n)
        self.top+=1
    
    def Peek(self):
        if(self.IsEmpty()==False):
            return self.stack[-1]
    
    def Pop(self):
        if self.IsEmpty()==False:
            self.stack.pop(-1)
            self.top-=1
        return -1
            
    def Size(self):
        return self.top+1

N=int(sys.stdin.readline())
a=list(map(int,sys.stdin.readline().split()))

stack=Stack() 

def check(num):
    if(a[0]==num):
        a.pop(0)
        num+=1
    elif stack.Peek()==num:
        stack.Pop()
        num+=1
        
    else:
        stack.Push(a.pop(0))
    
    return num

num=1
while(len(a)):
    num=check(num)

while(1):
    if(stack.IsEmpty()):
        break
    if(stack.Peek()==num ):
        stack.Pop()
        num+=1
        
    else:
        break
    
if(stack.Size() == 0):
    print("Nice")
else:
    print("Sad")
    