def compararListas(a, b, c):
    # primero comprobar si las tres listas tienen la misma longitud
    if len(a) != len(b) or len(b) != len(c):
        return False

    # segundo comparar letra por letra ignorando mayúsculas
    for i in range(len(a)):
        if a[i].lower() != b[i].lower() or a[i].lower() != c[i].lower():
            return False

    # Paspor ultimo si no se encontró ninguna diferencia devolver true
    return True

# true porque es igual
a = ['h', 'o', 'l', 'a']
b = ['H', 'o', 'L', 'A']
c = ['H', 'O', 'L', 'A']
print("Caso 1:", compararListas(a, b, c))

# Falso por la longitud
a = ['h', 'o', 'l']
b = ['H', 'o', 'L', 'A']
c = ['H', 'O', 'L', 'A']
print("Caso 2:", compararListas(a, b, c))

# false por que los valores no son iguales
a = ['h', 'o', 'l', 'a']
b = ['H', 'o', 'L', 'A']
c = ['B', 'R', 'R', 'A']
print("Caso 3:", compararListas(a, b, c))