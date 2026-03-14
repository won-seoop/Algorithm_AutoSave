import sys
import math





def login(n,c):
    return int(math.factorial(n)/(math.factorial(n-c)*math.factorial(c)))


a,b=map(int,sys.stdin.readline().split())
print(login(a,b))
