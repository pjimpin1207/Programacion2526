# Ejercicio 5
# Pedir al usuario que introduzca 5 números decimales y mostrarlos en el mismo orden

numeros = []  # Lista vacía para guardar los números

# Bucle para pedir los 5 números
for i in range(5):
    numero = float(input(f"Introduce el número decimal {i+1}: "))
    numeros.append(numero)

# Mostrar los números en el mismo orden
print("\nLos números introducidos son:")
for n in numeros:
    print(n)
