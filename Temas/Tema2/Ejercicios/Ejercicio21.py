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
matrizmultiplos =  []

for i in range(len(m)):
    nuevaFila = []
    j = 0
    while j < len(m[i]):
        if m[i][j] % 2 == 0:
            nuevaFila.append(m[i][j])
            m[i].pop(j)
        else:
            nuevaFila.append("")
            j += 1
    matrizmultiplos.append(nuevaFila)


# mostrar resultados
print("matriz original SIN los múltiplos de 2:")
for fila in m:
    print(fila)

print("\nmatriz con los múltiplos de 2:")
for fila in matrizmultiplos:
    print(fila)