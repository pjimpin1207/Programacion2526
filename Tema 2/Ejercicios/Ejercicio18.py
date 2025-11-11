
# Ejercicio 18 - Comparar búsqueda secuencial y binaria

# Importamos la función del ejercicio 16
import Ejercicio16
import Ejercicio15_2


# Crear un array desordenado
arrayDesordenado = [3, 15, 2, 21, 15, 66, 50, 43, 51]
print("Array original desordenado:", arrayDesordenado)

# Número a buscar
buscar = int(input("Introduce el número que deseas buscar: "))

# Buscar en el array desordenado
indiceSecuencial = Ejercicio15_2.busquedaSecuencial(arrayDesordenado, buscar)
indiceBinaria = Ejercicio16.busquedaBinaria(arrayDesordenado, buscar)

print("\nResultados en el array desordenados:")
print("búsqueda secuencial:", indiceSecuencial)
print("Búsqueda binaria:", indiceBinaria)

# Ordenar el array
arrayDesordenado.sort()
print("\nArray ordenados:", arrayDesordenado)

# volver a buscar en el array ordenado
indiceSecuencialOrdenado = Ejercicio15_2.busquedaSecuencial(arrayDesordenado, buscar)
indiceBinariaOrdenada = Ejercicio16.busquedaBinaria(arrayDesordenado, buscar)

print("\nResultados en el array ordenados:")
print("Busqueda secuencial ordenada:", indiceSecuencialOrdenado)
print("Busqueda binaria ordeanda:", indiceBinariaOrdenada)

