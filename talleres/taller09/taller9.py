# Punto 1
print('Punto 1:')
class HashTable():
    """
archivo = open("usda-dc-directory.csv",'r') 
texto_en_string = archivo.read()
archivo.close()
separado_por_lineas = texto_en_string.split("\n") 
tabla_de_hash = dict()
for linea in separado_por_lineas:
    columnas = linea.split(",")
    apellido = columnas[0]
    nombre = columnas[1]
    telefono = columnas[3]
    tabla_de_hash[nombre+" "+apellido] = telefono
for nombre_y_apellido in tabla_de_hash:
    print(nombre_y_apellido + ": " + tabla_de_hash[nombre_y_apellido])
"""
# Punto 2
# agregamos el diccionario empresas y lo llenamos de los elementos
#y sus respectivos valores
print('Punto 2:')
empresas = {'Google': 'Estados Unidos',
            'La Locura': 'Colombia',
            'Nokia': 'Finlandia',
            'Sony': 'Japon'}

for k, v in empresas.items():
    
    print(k, v) 

# Punto 3
# En este punto nos piden buscar los elementos del diccionario para luego imprimir su valor, además de 
# agregar un nuevo elemento al diccionario(Motorola)
empresas['Motorola'] = 'china'
print('Punto 3:')
print(empresas.get('Google'))
print(empresas.get('Motorola'))

# Punto 4
# en las siguientes lineas de codigo nos piden verificar si hay unos elementos en el diccionario
# y decir si e verdadero o falso
print('Punto 4:')
paises = empresas.values()
print('India' in paises)
print('Estados Unidos' in paises)