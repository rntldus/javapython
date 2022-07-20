#연습문제 06-2
#page 115

#1
from pyrsistent import plist


str="The Espresso Spirit"
print(str.upper())
print(str.lower())
print(str)

#2
def birth_only(p1):
    plist=p1.split("-")
    return p1.split("-")[0]

p1="070609-2044xxx"
p1=birth_only(p1)
print(p1)