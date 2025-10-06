# Pedir al usuario que introduzca los tres lados
a = float(input("Introduce el lado a: "))
b = float(input("Introduce el lado b: "))
c = float(input("Introduce el lado c: "))

# Comprobar si forman un triángulo
if (a + b > c) and (a + c > b) and (b + c > a):
    # Determinar  que tipo de triángulo es
    if a == b == c:
        print("Es un triángulo equilatero")
    elif a == b or a == c or b == c:
        print("Es un triángulo isoceles")
    else:
        print("Es un triángulo escaleno")
else:
    print("No se puede formar un triángulo con esos lados")

