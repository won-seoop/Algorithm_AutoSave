
cnt=0



def dfs(dep, idx, sum, numbers, target):
    global cnt
    
    if dep ==len(numbers) :
        if sum == target: 
            cnt+=1
        return
    
    dfs(dep+1, idx+1, sum+numbers[idx], numbers, target)
    dfs(dep+1, idx+1, sum-numbers[idx], numbers, target)
        
    

def solution(numbers, target):
    dfs(0,0,0, numbers, target)
    return cnt 