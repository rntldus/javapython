def main():
    i=1
    sum=0
    while sum<=63:
        sum=((3*i)%2)==0
        i=i+1
    print(i)

main()