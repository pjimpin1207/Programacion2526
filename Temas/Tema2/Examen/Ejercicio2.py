M = [
    [10, 20, 30],
    [40, 50, 60],
    [70, 80, 90]
]
T = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]
for i in range(3):
    for j in range(3):
        if i == j:
            T[i][j] = M[i][j]
        else:
            T[i][j] = M[j][i]

print("Resultado final despues de la transposicion parcial:")
for fila in T:
    print(fila)
