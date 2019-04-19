t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int, input().strip().split()))
    b = []
    for i in range(n-1):
        if(a[i]<=a[i+1]):
            b.append(-1)
        else:
            b.append(a[i+1])
    b.append(-1)
    print(*b, sep=' ')        
        
