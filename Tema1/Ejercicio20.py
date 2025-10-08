numero = int(input("Introduce un número entero positivo: "))

if numero > 0:
    #Contar desde 1 hasta el número que se introduzca
    for i in range(1, numero + 1):
        print(i, end=", " if i < numero else "\n")
else:
    print("Introduce un número positivo.")
