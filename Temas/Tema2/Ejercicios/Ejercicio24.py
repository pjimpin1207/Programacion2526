matriz = [
    [10, 7, 3],
    [4, 11, 15],
    [17, 20, 23]
]

def esPrimo(n):
    if n <= 1:
        return False
    
    for i in range(2, n):
        if n % i == 0:
            return False
    
    return True


contadorPrimo = 0

for fila in matriz:
    for elemento in fila:
        if esPrimo(elemento):
            contadorPrimo += 1

print("Cantidad de números primos:", contadorPrimo)
