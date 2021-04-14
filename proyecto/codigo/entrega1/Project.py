# Leer los archivos de la carpeta ganado enfermo

from os import listdir
from os.path import isfile, join

ruta = r'C:\Users\Day\Desktop\Estructuras de datos y algoritmos\archivosCSV\ganado enfermo CSVs'

def listar_directorio(ruta):
    archivos = [a for a in listdir(ruta) if isfile(join(ruta, a))]
    return archivos

listado_archivos = listar_directorio(ruta)
print(listado_archivos)

# Leer los archivos de la carpeta ganado sano

from os import listdir
from os.path import isfile, join

ruta = r'C:\Users\Day\Desktop\Estructuras de datos y algoritmos\archivosCSV\ganado sano CSVs'

def listar_directorio(ruta):
    archivos = [a for a in listdir(ruta) if isfile(join(ruta, a))]
    return archivos

listado_archivos = listar_directorio(ruta)
print(listado_archivos)

# Leer un archivo cvs en una lista python

import csv
with open('0.csv') as csvfile:
    reader = csv.reader(csvfile)
    fsa = []

    for row in reader:
        print(row)
