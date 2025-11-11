# Ejercicio15

# Crear un metodo que reciba un numero y un array y devuelva la posicion donde
# a encontrado el numero o -1 si no lo ha encontrado.

# Crea un array con 5 numeros aleatorios y busca dentro de el un numero introducido
# por el usuario, invocando el metodo anterior.

import random

# Función para busca un número en el array
def busquedaSecuencial(numero, array):
    for i in range(len(array)):
        if array[i] == numero:
            return i
    return -1

Comentado para poder utilizar la funcion en el ejericio 18
# Crear un array con 5 números aleatorios que esten entre el 1 y 50
numeros = []
for i in range(5):
    numeros.append(random.randint(1, 50))

# Mostrar el array
print("Array generado de numeros aleatorios:", numeros)

# Pedir al usuario un número para buscar
numeroUsuario = int(input("Introduce un número a buscar: "))

# Buscar el número con la función
# posicionNumero = buscarNumero(numeroUsuario, numeros)
# 
# # Mostrar resultado
# print("Resultado devuelto por la función:", posicionNumero)
