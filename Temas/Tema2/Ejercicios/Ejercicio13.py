# Ejercicio 13
# Crear una lista con los 10 primeros números
# Extraer los números primos de la lista y añadirlos a una nueva

# Crear array 
numeros = [1,2,3,4,5,6,7,8,9,10]
print("Primer array:", numeros)

# array para los primos
primos = []

# Reccorrer  array original
for n in numeros[:]:
    divisor = 0
    for i in range(1, n+1):
        if n % i == 0:
            divisor = divisor + 1
    if divisor == 2:
        primos.append(n)
        numeros.remove(n)

# Mostrar resultados
print("Array original:", numeros)
print("Array de primos:", primos)

