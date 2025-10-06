print("=== CALCULADORA BÁSICA ===")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")

# Pedir al usuario que elija una opción
opcion = input("Elige una opción (1-4): ")

# Pedir los dos números
num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

# Hacer la selección seleccionada
if opcion == "1":
    resultado = num1 + num2
    print(f"La suma es: {resultado}")
elif opcion == "2":
    resultado = num1 - num2
    print(f"La resta es: {resultado}")
elif opcion == "3":
    resultado = num1 * num2
    print(f"La multiplicación es: {resultado}")
elif opcion == "4":
    if num2 != 0:
        resultado = num1 / num2
        print(f"La división es: {resultado}")
    else:
        print("Error: No se puede dividir entre 0.")
else:
    print("Opción no válida.")
