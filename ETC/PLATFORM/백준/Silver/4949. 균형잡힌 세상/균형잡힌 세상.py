import sys
from collections import deque

def CheckLine(line):
    dq = deque()
    for w in line:
        if w == '[' or w == '(':
            dq.append(w)
        elif w == ']' or w == ')':
            if not dq:
                return False
            top = dq.pop()
            if (w == ']' and top != '[') or (w == ')' and top != '('):
                return False
    return len(dq) == 0

def endcheck(a):
    return len(a) == 1 and a[0] == '.'

while True:
    line = sys.stdin.readline().rstrip("\n")
    if endcheck(line):
        break
    if CheckLine(line):
        print("yes")
    else:
        print("no")
