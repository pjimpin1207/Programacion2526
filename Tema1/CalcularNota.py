# Programa: Calificación

# Pedir la nota
nota = float(input("Introduce tu nota (0-10): "))

# Evaluar la calificación
if 9 <= nota <= 10:
    print("Sobresaliente")
elif 7 <= nota < 9:
    print("Notable")
elif 6 <= nota < 7:
    print("Bien")
elif 5 <= nota < 6:
    print("Suficiente")
elif 0 <= nota < 5:
    print("Insuficiente")
else:
    print("Error: La nota debe estar entre 0 y 10")
