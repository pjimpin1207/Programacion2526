#Escribe un programa que dado un número decimal negativo lo pase a positivo y lo redondee a un número entero.

# Introducir número por el usuario
num = float(input("Introduce un número decimal negativo: "))

# Convertimos a positivo
positivo = abs(num)

# Redondeamos al entero más cercano
redondeado = round(positivo)

# Mostramos el resultado
print("Número positivo redondeado:", redondeado)
