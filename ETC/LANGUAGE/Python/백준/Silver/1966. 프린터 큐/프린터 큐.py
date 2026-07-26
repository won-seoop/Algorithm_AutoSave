# 프린터
# 순서대로
# 큐
# 새로운 프린터기
# 1. 큐앞의 문서의 중요도 확인
from collections import deque
def solution(priorities, location):
    cnt=0
    priorities=deque([(index, value) for index, value in enumerate(priorities)])


    while(True):
        pick=priorities.popleft() #pick = (index, value)
        check=True
        for index, value in (priorities):
            # 뽑은 거랑 큐에 있던거랑 비교했는데 단 하나라도 큐에있던게 큰게 나왔다.
            if(pick[1] < value):
                check=False #삐빅 젤 큰게 안에 더 있음.
                break
            else:
                pass
        # 아니다 뽑은게 제일 크다
        if check:
            cnt+=1 #실행은 check가 True 즉, 뽑은게 제일 첫번째 우선순위일 때 실행된다. 따라서 check==True일때 cnt=+1
            if pick[0]==location:
                break

        else:

            priorities.append(pick)


    return cnt

num=int(input())

for _ in range(num):
    _, location=map(int,input().split())
    priorities=list(map(int,input().split()))
    print(solution(priorities,location))