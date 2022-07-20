# page 181

#1

for i in range(9,0,-1):
    print(i*7, end=" ")

print()

#2

a=[i for i in range(1,101)]
a=tuple(a)
b=[i for i in range(99,0,-1)]
b=tuple(b)
c=a+b
print(c)

#2번과 같은방법(1)
#a=[]
#for i in range(1,101):
#    a.append(i)
#a=tuple(a)
#b=[i for i in range(99,0,-1)]
#b=tuple(b)
#c=a+b
#print(c)
#2번과 같은방법(2)
#import numpy as np
#a=np.arange(1,10)
#print(list[a])
#a=[i for i in range(1,101)]
#print(a)