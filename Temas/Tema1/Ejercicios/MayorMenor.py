# Programa: Mayor o menor

# Pedimos dos números al usuario
num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

# Comparamos los números
if num1 > num2:
    print(f"El mayor es {num1}")
elif num2 > num1:
    print(f"El mayor es {num2}")
else:
    print("Ambos números son iguales")
