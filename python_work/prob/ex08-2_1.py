def main():
    i=45
    while True:
        if (i%6==0) and (i%45==0):
            print("6과 45의 최소공배수=", +i)
        if i>100:
            break
        i=i+1


main()