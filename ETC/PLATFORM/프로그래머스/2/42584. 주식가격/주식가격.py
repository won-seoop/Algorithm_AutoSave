#초 단위로 주식가격이 기록 됨. prices
#가격이 떨어지지 않은 기간은 몇초
#prices=[1,2,3,2,3]
def solution(prices):
    answer = []
    for i in range(len(prices)):
        cnt=0
        for j in range(i+1,len(prices)):
            cnt+=1
            if(prices[i] > prices[j]):
                break
        answer.append(cnt)

    return answer

print(solution([1,2,3,2,3]))