m = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

# mostrar la matriz completo
print("martriz completa:")
print(m)

# fila 1, columna 2
print("fila 1, columna 2:", m[1][2])

# elemento central
print("elemento central de la matriz:", m[1][1])

#recorrer solo segunda fila
print("Elementos  de la segunda fila:")
for elemento in m[1]:
    print(elemento)

# bucle anidado
print("bucle anidado:")
for fila in m:
    print()
    for elemento in fila:
        print(elemento, end=" ")

# recorrer y mostrar la matriz extrayendo los numeros multiplos de 2
matrizMultiplos =  []

for fila in m:
    nuevaFila = []
    for elemento in fila:
        if elemento % 2 == 0:
            nuevaFila.append(elemento)
        else:
            nuevaFila.append(0)
    matrizMultiplos.append(nuevaFila)

print()
print("Matriz de multiplos de dos")
for fila in matrizMultiplos:
    print(fila)