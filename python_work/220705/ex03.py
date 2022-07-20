#CH07-4

def main():
    print('main 시작')
    a=input('숫자를 입력하세요.') #숫자가아님-->String형
    # print(type(a))
    num=int(a)
    # print(type(num))
    if num>0:
        print("num은 0보다 큽니다.")
    else :
        print("num은 0보다 작습니다.")
    print('main 끝')

main()