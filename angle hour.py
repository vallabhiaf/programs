t=int(input())
for _ in range(t):
    a,b=map(float,input().strip().split())
    if(a==12):
        a=0
    if(b==60):
        b=0
    Angle1=.5*(a*60+b)
    Angle2=(b)*6
    x=abs(Angle1-Angle2)
    y=360-x
    print(int(min(x,y)))
