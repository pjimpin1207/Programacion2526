# Solicitar al usuario cuántos números desea introducir,
# guardarlos en una lista y mostrarlos en orden inverso.

# 1. Pedir cantidad de números
cantidad = int(input("¿Cuántos números enteros deseas introducir?: "))

# 2. Crear lista vacía
numeros = []

# 3. Rellenar la lista con los valores introducidos por teclado
for i in range(cantidad):
    numero = int(input("Introduce el número entero " + str(i + 1) + ": "))
    numeros.append(numero)

# 4. Mostrar los números en orden inverso
print("\nLos números en orden inverso son:")

# Recorremos la lista al revés
for n in reversed(numeros):
    print(n)
