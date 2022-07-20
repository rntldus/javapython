from car import Car

def main():
    c1=Car()
    print('main')
    while True:
        print('1. 속도 입력')
        print('2. 속도 출력')
        select=int(input())
        if select==1:
            speed=input("속도 입력")
            c1.speed=speed
        else:
            print("속도=", c1.speed)

main()