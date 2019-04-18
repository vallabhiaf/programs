def printSpiralArr(arr,m,n):
    l=0
    r=n-1
    t=0
    b=m-1
    dir=0
    while(l<=r and t<=b):
        if(dir==0):
            for i in range(l,r+1):
                print(arr[t][i],end=" ")
            t+=1
        elif(dir==1):
            for i in range(t,b+1):
                print(arr[i][r],end=" ")
            r-=1
        elif(dir==2):
            for i in range(r,l-1,-1):
                print(arr[b][i],end=" ")
            b-=1
        else:
            for i in range(b,t-1,-1):
                print(arr[i][l],end=" ")
            l+=1
        dir=(dir+1)%4
            
t=int(input())
for tt in range(t):
    m,n=map(int,input().split())
    val=input().split()
    k=0
    arr=[[0 for i in range(n)] for j in range(m)]
    for i in range(m):
        for j in range(n):
            arr[i][j] = val[k]
            k+=1
    # print(arr)
    printSpiralArr(arr,m,n)
    print()
