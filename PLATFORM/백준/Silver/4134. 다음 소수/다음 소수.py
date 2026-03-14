import sys, math

# N의 제곱근 +1 까지만 is prime에서 체크를 해주자

def isPrime(N):
    if N==0:
        return False
    elif N==1:
        return False
    
    for i in range(2, int(math.sqrt(N))+1):
        if N%i==0:
            return False
    return True

cnt=int(sys.stdin.readline())

for _ in range(cnt):
    num=int(sys.stdin.readline())
    
    while(1):
        if(isPrime(num)):
            print(num)
            break
        num+=1       
        