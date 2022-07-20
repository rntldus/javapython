#CH11

# import around 명령어너무많을때 w1처럼 바꿔씀
import around as w1

import pandas as pd
import numpy as np

result=np.random.rand(10)
print(f"랜덤값나옵니다. {result}")

num=float(input("반지름 입력"))
result=w1.areaaround(num)
print(f"넓이는={result}")
result=w1.caround(num)
print(f"둘레는={result}")