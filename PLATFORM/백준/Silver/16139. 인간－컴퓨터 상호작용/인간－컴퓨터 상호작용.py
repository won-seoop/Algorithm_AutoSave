import sys

input=sys.stdin.readline

d=[]
total = [0] * 26

str_=input().rstrip()
q=int(input())

for c in str_:
    total[ord(c)-97]+=1
    d.append(total.copy())
    
for i in range(q):
    alpa, l, r = map(str, input().split())
    l=int(l)
    r=int(r)
    
    if(l==0):
        print(d[r][ord(alpa)-97])
    else:
        print(d[r][ord(alpa)-97] - d[l-1][ord(alpa)-97])
        
