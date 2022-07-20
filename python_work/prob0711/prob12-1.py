# page 217
# 1
dc={'새우깡':700, '콘치즈':850, '꼬깔콘':750}
dc['홈런볼']=900
print(dc)

#2
for i in dc:
    dc[i]+=100
print(dc)

#dc['새우깡']+=100
#dc['콘치즈']+=100
#dc['꼬깔콘']+=100
#dc['홈런볼']+=100
#print(dc)

#3
del dc['콘치즈']
print(dc)
dc['치즈콘']=950
print(dc)