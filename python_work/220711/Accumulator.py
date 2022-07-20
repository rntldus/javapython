sum=0

class Accumulator:
    def __init__(self):
        self.sum=0
    @staticmethod
    def add(self, i):
        # global sum
        sum=sum+i
    @staticmethod
    def showResult(self):
        print(f"sum={self.sum}")
