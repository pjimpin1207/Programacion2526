numero = int(input("Introduce un número para ver su tabla de multiplicar: "))

print("Tabla de multiplicar del", numero)

# Bucle para multiplicar del 1 al 10
for i in range(1, 11):
    print(numero, "x", i, "=", numero * i)
