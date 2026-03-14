import sys

N=int(sys.stdin.readline())
stack=[]
top=-1

def isEmpty():
    if(top==-1):
        return 1
    else:
        return 0
    
for _ in range(N):
    a=list(map(int,sys.stdin.readline().split()))
    if(len(a)==1):
        if(a[0]==2):
            if(isEmpty()==0):
                print(stack.pop(-1))
                top=top-1
            else:
                print(-1)
        elif(a[0]==3):
            print(top+1)
        elif(a[0]==4):
            print(isEmpty())
        else:
            if(isEmpty()==0):
                print(stack[top])
            else:
                print(-1)
    else:
        stack.append(a[1])
        top=top+1
