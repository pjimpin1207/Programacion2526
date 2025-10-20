Algoritmo Ejercicio37
    Definir a, b Como Entero
    Escribir "Introduzca dos números mayores que 0"
    Leer a, b

    Mientras b ≠ 0 Hacer
        Si a > b Entonces
            a ← a - b
        Sino
            b ← b - a
        FinSi
    FinMientras

    Escribir "El máximo común divisor es: ", a
FinAlgoritmo

