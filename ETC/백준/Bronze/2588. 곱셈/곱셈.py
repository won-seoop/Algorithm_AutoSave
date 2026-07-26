import sys

input = sys.stdin.readline

a=int(input())
b=int(input())

# 1. 문자열로 바꾸기
b=str(b)

# 2. 각 자리수 접근
print(a*int(b[2]))
print(a*int(b[1]))
print(a*int(b[0]))


# 3. 숫자로 바꾸기
print(((int)(b))*a)



# b=int(input())

