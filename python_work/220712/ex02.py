# CH14-4

try:
    age=int(input('나이적어'))
    a=age/0
except Exception as e:            # e= 모든 exception
    print('모든 예외는 일로 옴', e)

# except ValueError:
#    print('한글을 적으면 어떡함;')
# except ZeroDivisionError:
#    print('0으로 나눌 순 없는디')

print('빠꾸')