#CH07-6

def main():
    num=int(input('input number'))
    if num%2==0 and num%3==0:
        print('2의 배수이면서 3의 배수입니다.')
    else:
        print(num, '은 num입니다.')

main()