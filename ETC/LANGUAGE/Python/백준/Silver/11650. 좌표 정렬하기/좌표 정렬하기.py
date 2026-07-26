num=int(input())

coordinate_set=[]
for _ in range(num):
    x,y=map(int,input().split())
    coordinate_set.append([x,y])
    
#print(coordinate_set)

coordinate_set.sort(key=lambda x : (x[0], x[1]))
for i in coordinate_set:
    x,y=i[0],i[1]
    print(f"{x} {y}")
