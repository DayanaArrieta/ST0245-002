# Authors: Dayana Arrieta & Juan José Quintana
# Date: 2021 Version: 1
# This python algorithm is about using a csv file 
# and compressing it in an image format with the scaling method

import pandas as pd
df = pd.read_csv('vaca 1.csv')
#print(df)

import numpy as np
np_array = df.to_numpy()
#print(np_array)

import numpy as np
import cv2

cv2.imwrite("newimg.png", np_array)

#Resize-Scaling
img = cv2.imread('newimg.png', 1)
cv2.imshow('Original', img)

img_scale_up = cv2.resize(img, (0, 0), fx=0.5, fy=0.5, interpolation=cv2.INTER_NEAREST)

cv2.imwrite("vaquita.png", img_scale_up)


cv2.waitKey(0)
cv2.destroyAllWindows()
