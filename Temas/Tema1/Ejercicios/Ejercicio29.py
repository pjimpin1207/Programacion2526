numero= int(input("Introduce un número para calcular el factorial:"))
factorial=1

for i in range(1, numero + 1):
    factorial *= i
print("El factorial de", numero, "es", factorial)
