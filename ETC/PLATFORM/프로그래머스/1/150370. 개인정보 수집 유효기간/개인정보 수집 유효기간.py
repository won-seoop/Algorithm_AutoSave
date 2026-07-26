# 28
# 2019.01.01 + 5 = 2019.06.01 -> 2019.05.28일까지 보관 가능
# today = 2020.01.01

# 2020.01.01
# 2019.05.28

## ----------- 수도코드 ----

# 1. today 받기 v
# 1.1 배열로 변환 v

# 2. terms 받기
# 2.1 딕셔너리로 변환

# 3. privacies 받기
# 3.1 날짜와 알파벳으로 분리
# 3.2 날짜를 배열로 변환
# 3.3 날짜에 terms에 매핑되는 value값, 즉 월 수 더해서 days 계산
# 3.4 로직 1 진행

# 4. ans 출력


# cnt=1



def solution(today, terms, privacies):
    term = dict()
    cnt = 0
    ans=[]
    
    
    today=list(map(int,today.split(".")))
    
    for i in terms:
        a,b = i.split()
        term[a]=int(b)
    
    # 3. privacies 받기
    for i in privacies:
        cnt+=1
        # 3.1 날짜와 알파벳으로 분리
        pri=i.split()
        
        # 3.2 날짜를 배열로 변환
        day=list(map(int,pri[0].split(".")))
        
        # 3.3 날짜에 terms에 매핑되는 value값, 즉 월 수 더해서 days 계산
        day[1] +=term[pri[1]]
        day=get_day(day)
        
        
        
        # 3.4 로직 1 진행
        if today >= day:
            ans.append(cnt)
        
            
        
        
        ## 로직 1
        # 2023.05.19 - 현재 today
        # 2022. 7. 1 - 만료 예정일 day
        # 현재가 만료예정일을 안지났으면, 현재 > 만료예정일 -> cnt 넣기
        # for i = 0~3 : 
        #   if today[i] > days[i] :
        #       ans.append(cnt)
        #       break
        # cnt+=1
        

    
    return ans


def get_day(r):
    
    if r[1]%12==0:
        r[0] += ((r[1] // 12) -1)
        r[1]=12
    else :
        r[0]+=r[1]//12
        r[1]%=12
        
        
    
    
    
    return r


# 트러블 슈팅

# 1. 개월 수가 최대 12가 아님
# 
