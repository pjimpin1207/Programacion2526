import math

print("=== CALCULADORA BÁSICA ===")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Raíz cuadrada")

# Pedir al usuario que elija una opción
opcion = input("Elige una opción (1-5): ")

# If por si la opción es la raiz cuaddrada solo pedir un número
if opcion == "5":
    num = float(input("Introduce un número: "))
    if num >= 0:
        resultado = math.sqrt(num)
        print("La raíz cuadrada de", num, "es:", resultado)

    else:
        print("Error: No se puede calcular la raíz cuadrada de un número negativo.")
else:
    # Para las demás operaciones, pedimos dos números
    num1 = float(input("Introduce el primer número: "))
    num2 = float(input("Introduce el segundo número: "))

    # IF para realizar la opción seleccionada.
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
    else:
        print("Opción no válida.")
