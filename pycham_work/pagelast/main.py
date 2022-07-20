from a import Friend

myfriendlist=[Friend("이선준", "010-333-4444"), Friend("장지우", "010-555-6666"), Friend("윤지윤", "010-777-8888")]
myfriendlist.append(Friend("윤지민", "010-111-2222"))

for f in myfriendlist:
    if f.get_name()=='장지우':
        f.set_phone("010-999-99999")

for f in myfriendlist:
    print(f)
