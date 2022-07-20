print()
num=1
while (num<100):
    num+=1
    if num%2!=0 and num%3!=0:
        continue
    print(num,end=' ')