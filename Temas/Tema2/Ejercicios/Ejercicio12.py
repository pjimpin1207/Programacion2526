# Crear un array con los 10 primeros números
array_numeros = ["1", "2", "3","4","5","6","7","8","9","10"]

# Mostrar el array original
print("Array original:", array_numeros)

# Crear un nuevo array eliminando los números pares
array_resultado = []

for n in array_numeros:
    if n % 2 != 0:
        array_resultado.append(n)

# Mostrar el resultado
print("Array sin números pares:", array_resultado)
