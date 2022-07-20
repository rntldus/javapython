#연습문제 06-1
#page 108

#1
st=[]
st.append(1)
print(st)
st.append(2)
print(st)
st.append(3)
print(st)
st.remove(1)
print(st)
st.remove(2)
print(st)
st.remove(3)
print(st)

#2
st=[]
st.append(1)
print(st)
st.append(2)
print(st)
st.append(3)
print(st)
st.remove(3)
print(st)
st.remove(2)
print(st)
st.remove(1)
print(st)

#3
st=[1,2,3,4]
#st.clear()
st[:]=[]
print(st)

#4
st=[]
for i in range(1, 11):
    st.append(i)
print(st)
for i in range(1, 11):
    st.remove(i)
print(st)

#5
st=[]
for i in range(1,11):
    st.append(i)
print(st)
for i in range(1,11):
    st.remove(max(i))
print(st)

#6
st=[1,2]
nt=[3,4,5]
print(st+nt)