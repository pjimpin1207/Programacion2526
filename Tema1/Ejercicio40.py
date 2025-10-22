# Calcular el promedio de varios números

numeros = []

print("Introduce números uno a uno. Pulsa 'espacio' y Enter para terminar.\n")

while True:
    entrada = input("Número: ").strip()
    if entrada == "":
        print("Si quieres salir, escribe un espacio y presiona Enter.")
        continue
    if entrada == " ":
        break
    try:
        numero = float(entrada)
        numeros.append(numero)
    except ValueError:
        print("Por favor, introduce un número válido o un espacio para terminar.")

if numeros:
    promedio = sum(numeros) / len(numeros)
    print(f"\nPromedio de los números introducidos: {promedio:.2f}")
else:
    print("\nNo se introdujeron números.")
