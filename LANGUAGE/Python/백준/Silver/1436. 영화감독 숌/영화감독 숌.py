n=int(input())
result=[10000]
cnt=0
num=666
while(True):

    if(cnt==n):
        print(result.pop(-1))
        break
    a=[]
    for i in str(num):
        a.append(int(i))
    for i in range(len(a)-1,1,-1):
        if a[i]==6 and a[i-1]==6 and a[i-2]==6:
            result.append(int(''.join(map(str,a))))
            cnt=cnt+1
            break
    num=num+1

            





