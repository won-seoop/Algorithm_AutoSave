import sys

arr = [1,1, 1,2]
left = 0

sum = 0 
count =0
target = 3


for right in range(len(arr)):
    sum+=arr[right]
    
    while sum > target:
        sum -= arr[left]
        left+=1
    
    if sum == target:
        print(f"{left} - {right}")
        count+=1
        
print(count)
