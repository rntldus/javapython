from sklearn.neighbors import KNeighborsRegressor
import numpy as np

x1=np.array([5,8,9,10, 11,12,13,14])
x1=x1.reshape(-1,2)
print(x1)

nr=KNeighborsRegressor(n_neighbors=3)
nr.fit(x1,[30,32,35,40])

prevalue=nr.predict([[7,8]])
print(prevalue)