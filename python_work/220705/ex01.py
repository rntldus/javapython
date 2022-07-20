#CH06-4,5,6

st="FUXXING TOMBOY"

cnt=0
for i in st:
    cnt+=1
    if i=='T':
        print(i)
        print(cnt)
    cnt+=1
print(st.find('T'))

myst="한글입니다.\n잘되네요."
print(myst)
myst="한글입니다.\t잘되네요."
print(myst)
myst="한글입니다.\"잘되네요."
print(myst)
myst="한글입니다.\'잘되네요."
print(myst)

mylist=[2,9,1,8]
del mylist[2:]
print(mylist)

del mylist[:]
print(mylist)