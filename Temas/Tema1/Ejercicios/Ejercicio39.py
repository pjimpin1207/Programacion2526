# Comprobar si un número es primo

numero = int(input("Introduce un número: "))

if numero <= 1:
    print("No es un número primo.")
else:
    es_primo = True
    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            es_primo = False
            break

    if es_primo:
        print("Es un número primo.")
    else:
        print("No es un número primo.")
