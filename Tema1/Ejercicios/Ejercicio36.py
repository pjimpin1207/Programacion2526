import math

print("=== CALCULADORA BÁSICA ===")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Raíz cuadrada")
print("6. Potencia")

# Escoger opción de la calculadora
opcion = input("Elige una opción (1-6): ")

# Pedir números
if opcion == "5":
    num = float(input("Introduce un número: "))
elif opcion in ["1", "2", "3", "4", "6"]:
    num1 = float(input("Introduce el primer número: "))
    num2 = float(input("Introduce el segundo número: "))
else:
    print("Opción no válida.")

# Evaluar la opción seleccionada
if opcion == "1":
    resultado = num1 + num2
    print("La suma es:", resultado)
elif opcion == "2":
    resultado = num1 - num2
    print("La resta es:", resultado)
elif opcion == "3":
    resultado = num1 * num2
    print("La multiplicación es:", resultado)
elif opcion == "4":
    if num2 != 0:
        resultado = num1 / num2
        print("La división es:", resultado)
    else:
        print("Error: No se puede dividir entre 0.")
elif opcion == "5":
    if num < 0:
        print("Error: no se puede calcular la raíz cuadrada de un número negativo.")
    else:
        resultado = math.sqrt(num)
        print("La raíz cuadrada de", num, "es:", resultado)
elif opcion == "6":
    resultado = num1 ** num2
    print(num1, "elevado a", num2, "es:", resultado)
