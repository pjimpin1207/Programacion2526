matriz = [
    ["A", "B", "C"],
    ["D", "E", "F"],
    ["G", "H", "I"]
]

# con while
columna = 0
while columna < len(matriz[0]):
    fila = 0
    while fila < len(matriz):
        print(matriz[fila][columna], end=" ")
        fila += 1
    columna += 1

#con for each
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")