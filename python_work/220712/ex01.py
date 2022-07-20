# CH14-2 예외처리

def main():
    while True:
        try:
            print('나이를 입력하시오')
            age=int(input())
            print('입력하신 나이는', age)
            break
        except ValueError:
            print('나이는 숫자로 입력하시오')
    print('???')

main()
print("큰일났군..")