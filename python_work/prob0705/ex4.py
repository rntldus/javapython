def main():
    num=int(input("num에 저장된 값은 2의 배수이지만 3의 배수는 아니다. 맞는가? : "))
    if num%2==0:
        if num%3==0:
            print("False")
        else:
            print("True")

main()
