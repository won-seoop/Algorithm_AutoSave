import sys, os

# https://halo.oopy.io/1bbacfa8-9c47-80d9-83ab-d66f19f5ccd2
SIZE= 9
input=sys.stdin.readline
sudoku=[list(map(int,input().split())) for _ in range(SIZE)]

# mat=sys.stdin=open("Back_Tracking/ETC/input.txt","r")
# sudoku=[list(map(int,mat.readline().split())) for _ in range(SIZE)]


blank=[[i,j]for i in range(SIZE) for j in range(SIZE) if sudoku[i][j]==0]



def row_check(row, value):
    for col in range(SIZE):
        if sudoku[row][col] == value:
            return False
    return True

def col_check(col, value):
    for row in range(SIZE):
        if sudoku[row][col] == value:
            return False
    return True

def box_check(y,x,value):
    for i in range(3):
        for j in range(3):
            if sudoku[y//3*3+i][x//3*3+j] == value:
                return False
    return True

def dfs(n):
    if (n==len(blank)):
        for row in sudoku:
            for value in row:
                print(value,end=" ")
            print()
        sys.exit()
        
    for value in range(1,10):   # value : 1~9
        y=blank[n][0]
        x=blank[n][1]
        if  box_check(y,x,value) and row_check(y,value) and col_check(x, value):
            sudoku[y][x]=value
            dfs(n+1)
            sudoku[y][x]=0


dfs(0)