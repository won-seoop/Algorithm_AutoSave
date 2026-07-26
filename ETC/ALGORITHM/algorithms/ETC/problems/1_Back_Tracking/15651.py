# 제목 : N과 M (3)
# 출처 : 백준
# 작성자 : 원현섭
# 정리
'''
https://www.notion.so/wonseop/M-N-3-1a535effc17780c7ad22db5490b4a8e7
'''
import sys

# 1. N과 M 입력
N,M=map(int,sys.stdin.readline().split())

# 2. 수열을 저장해놓을 리스트 선언
ans=[]

# 3. 재귀적으로 M까지 뽑았을 때 ans에 수열 추가하는 dfs함수 생성
    # ano. n : 뽑은 횟수 ( = 수열에 뽑은 숫자를 넣은 횟수 )
def dfs(n, arr):
    
    # 3.1 종료조건 : 뽑은 횟수가 M과 일치
    if(n==M):
        ans.append(arr)
        return
    # 3.2 트리 형태로 만들었을 때, 한 층에 N개의 선이 생김, 1~N개 까지 반복
    for j in range(1,N+1):

            # 3.2.1 다음 dfs 현재 배열에서 추가한 원소 넣은 배열 전달
            dfs(n+1,arr+[j])

# 4. 실행

# 4.1 뽑은 횟수 0부터 
dfs(0,[])

# 4.2 출력
for i in ans:
    print(*i)