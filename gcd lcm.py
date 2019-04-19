def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)

N=int(input())
for i in range(N):
    a=list(map(int,input().split()))
    if a[0]>a[1]:
        gc=gcd(a[0],a[1])
    else:
        gc=gcd(a[1],a[0])
    print(a[0]*a[1]//gc,gc)        
