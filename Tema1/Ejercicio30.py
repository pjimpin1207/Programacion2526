def es_par_impar(numero):
    if numero % 2 == 0:
        return "El número es par"
    else:
        return "El número es impar"

num = int(input("Introduce un número: "))
resultado = es_par_impar(num)
print(resultado)

