import math

# Constantes
PI = 3.1416

# Función para sumar dos números
def sumar(a, b):
    return a + b

# Menu calculadora

print("=== CALCULADORA BÁSICA ===")
print("1. Suma")
print("2. Resta")
print("3. Multiplicación")
print("4. División")
print("5. Raíz cuadrada")
print("6. Potencia")
print("7. Redondeo")
print("8. Módulo")
print("9. Área del círculo")

opcion = input("Elige una opción (1-9): ")

if opcion == "5" or opcion == "7":
    num = float(input("Introduce un número: "))
    
elif opcion in ["1", "2", "3", "4", "6", "8"]:
    num1 = float(input("Introduce el primer número: "))
    num2 = float(input("Introduce el segundo número: "))

elif opcion == "9":
    radio = float(input("Introduce el radio del círculo: "))

else:
    print("Opción no válida.")
    exit()

# If para cada calculo

#Suma
if opcion == "1":
    resultado = sumar(num1, num2)  # Llamada a la función sumar
    print("La suma es:", resultado)

# Resta
elif opcion == "2":
    resultado = num1 - num2
    print("La resta es:", resultado)

# Multiplicación
elif opcion == "3":
    resultado = num1 * num2
    print("La multiplicación es:", resultado)

#División
elif opcion == "4":
    if num2 != 0:
        resultado = num1 / num2
        print("La división es:", resultado)
    else:
        print("Error: No se puede dividir entre 0.")

#Raíz cuadrada
elif opcion == "5":
    if num < 0:
        print("Error: no se puede calcular la raíz cuadrada de un número negativo.")
    else:
        resultado = math.sqrt(num)
        print("La raíz cuadrada de", num, "es:", resultado)

#Potencia
elif opcion == "6":
    resultado = num1 ** num2
    print(num1, "elevado a", num2, "es:", resultado)
  
#Redondeo
elif opcion == "7":
    resultado = round(num)
    print("El número", num, "redondeado es:", resultado)
    
## Modulo
elif opcion == "8":
    if num2 != 0:
        resultado = num1 % num2
        print("El módulo de", num1, "dividido entre", num2, "es:", resultado)
    else:
        print("Error: No se puede calcular módulo con divisor 0.")

# Área del círculo
elif opcion == "9":
    if radio < 0:
        print("Error: el radio no puede ser negativo.")
    else:
        area = PI * radio ** 2  # **Multipicar el valor por si mismo (Elevarlo a 2)
        print("El área del círculo con radio", radio, "es:", area)
