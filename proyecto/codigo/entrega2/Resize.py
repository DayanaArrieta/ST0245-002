import pandas as pd
import numpy as np
import glob
import csv
import cv2

# Authors: Dayana Arrieta & Juan José Quintana
# Date: 2021 Version: 1
# This python algorithm is about using csv files 
# and compressing them in an image format with the scaling method

files=glob.glob('*.csv')

def DataframeToResizedImage():
    for num, element in enumerate(files, start=1):
        dataframe = pd.read_csv(element)
        numpy_array = dataframe.to_numpy()
        image_name = ("newimage" + str(num) + ".png")
        cv2.imwrite(image_name, numpy_array)
        #Resize, scaling with nearest neighbour interpolation
        image = cv2.imread(image_name, 1)
        img_scale_up = cv2.resize(image, (0, 0), fx=0.5, fy=0.5, interpolation=cv2.INTER_NEAREST)
        resized_image = ("newSmallImage" + str(num) + ".png")
        cv2.imwrite(resized_image, img_scale_up)
        cv2.waitKey(0)
        cv2.destroyAllWindows()

DataframeToResizedImage()







