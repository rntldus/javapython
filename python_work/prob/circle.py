from point import Point

class Circle:
    # p=Point()
    def __init__(self,x,y,r):
        print("일로온다.",x,y,r)
        # pass 내용없을때 적음
        self.p=Point(x,y)
        self.r=r

    def showInfo(self):
        self.p.showInfo()
        print(f"반지름={self.r}")

c=Circle(2,2,4)
c.showInfo()