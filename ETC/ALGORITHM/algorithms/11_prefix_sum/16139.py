import sys

# ord('a')-97) = 0

input=sys.stdin.readline

str_ = input()

print(str_[0])

Q=int(input())

d=[[] for i in range(26)]

print(d)

sum=0

for i in str_:
    if i == 'a':
        sum+=1
    d.append(sum)
    

for i in range(4):
    key, l,r = map(str, input().split())
    l=int(l)
    r=int(r)
    