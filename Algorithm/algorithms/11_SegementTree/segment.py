a = [1,1,1,1,1,1,1] # size = 7


seg=[0]*16

def update(pos, v):
    seg[pos] = v
    pos//=2
    while pos !=0 :
        seg[pos] = seg[pos*2] + seg[pos*2+1]
        pos//=2
        
for i in range(0,7): # 7~13
    update(i+7, a[i])
    
print(seg)