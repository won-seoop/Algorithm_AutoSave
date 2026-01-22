N = int(input())
if N == 1:
    print(0)
    exit()

dasom = int(input())
a = [int(input()) for _ in range(N-1)]

cnt = 0
while True:
    max_vote = max(a)
    if dasom > max_vote:
        break
    idx = a.index(max_vote)
    a[idx] -= 1
    dasom += 1
    cnt += 1

print(cnt)
