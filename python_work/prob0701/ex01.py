#page87
#1
st=[1,2,3,4]
print(st[0], st[1], st[2], st[3])

#2
st=[1,2,3,4]
print(st[-4], st[-3], st[-2], st[-1])

#3
st=[1,2,3,4]
print(st[0]+1, st[1]+1, st[2]+1, st[3]+1)

#4
st=[1,2,3,4,5,6,7,8,9,10]
for i in st:
    print(i+1)

#5
st=[1,2,3,4,5,6]
st[0], st[-1]=st[-1], st[0]
print(st)