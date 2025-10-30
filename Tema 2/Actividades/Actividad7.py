# Diseñar una función que devuelva el valor máximo de una lista de enteros

def maximo(t):
    maximo_valor = t[0]
    for elemento in t[1:]:
        if elemento > maximo_valor:
            maximo_valor = elemento
    return maximo_valor


# Pedir al usuario cuántos números desea introducir
cantidad = int(input("¿Cuántos números enteros deseas introducir?: "))

# Crear el array vacio
numeros = []

# Pedir los números y los guardar en la lista
for i in range(cantidad):
    numero = int(input("Introduce el número entero " + str(i + 1) + ": "))
    numeros.append(numero)

# Llamamos a la función y mostramos el resultado
print("\nEl valor máximo de la lista es:", maximo(numeros))
