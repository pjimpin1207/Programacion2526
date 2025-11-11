# Solicitar al usuario cuántos números desea introducir,
# guardarlos en una lista y mostrarlos en orden inverso.

# Pedir cantidad de números
cantidad = int(input("¿Cuántos números enteros deseas introducir?: "))

# Crear array vacío
numeros = []

# Rellenar la lista con los valores introducidos por teclado
for i in range(cantidad):
    numero = int(input("Introduce el número entero " + str(i + 1) + ": "))
    numeros.append(numero)

# Mostrar los números en orden inverso
print("\nLos números en orden inverso son:")

# Recorremos la lista al revés
for n in reversed(numeros):
    print(n)

# Sin reversed

print("\nLos números en orden inverso son:")
for i in range(len(numeros) - 1, -1, -1):
    print(numeros[i])
    
# Con while

print("\nLos números en orden inverso son:")
i = len(numeros) - 1
while i >= 0:
    print(numeros[i])
    i = i - 1 