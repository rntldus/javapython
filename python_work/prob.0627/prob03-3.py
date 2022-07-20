#01
sum=0
for i in [1,3,5,7,9]:
    sum=sum+i+2
print(sum)

#선생님풀이
sum=0
for i in [1,3,5,7,9]: #[1,3,5,7,9]=range(1,10,2)
    print ("i=",i)
    sum +=i 

print("sum=", sum)


#02
sum=1
for i in [1,2,3,4,5,6,7,8,9,10]:
    sum=sum*i
print(sum)

#선생님풀이
sum=1
for i in range(1,11):
    sum=sum*i
print(sum)


#03
for i in [1,2,3,4,5,6,7,8,9]:
    print(7*i)

#선생님풀이
for i in range(1,10):
    print(7,'*',i,'=',7*i)


#04
for i in [9,8,7,6,5,4,3,2,1]:
    print(7*i)

#선생님풀이
for i in range(9,0,-1):
    print(7,'*',i,'=',7*i)