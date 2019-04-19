
t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().strip().split()))
    d=int(input())
    
    for i in a[d:]:
        print(i,end=" ")
    for i in a[0:d]:
        print(i,end=" ")
    print() 
    #linechange
