texto = "El Python es un lenguaje de programación muy popular. Python se usa en ciencia de datos y desarrollo web."

#Convertir a minusculas
textoEnMinuscula = texto.lower()
#Dividir texto en palabras
palabrasTexto = textoEnMinuscula.split()

#Contar el numero que aparece python dentro del texto
contador = 0
for python in palabrasTexto:
    if python == "python":
        contador += 1
print("Python aparece:", contador, "veces")


# Convertir a mayúsculas
textoEnMayuscula = texto.upper()
#Dividir texto en palabras
listaDePalabras = textoEnMayuscula.split()
#Invertir la lista
listaAlreves = []

for i in range(len(listaDePalabras) - 1, -1, -1):
    listaAlreves.append(listaDePalabras[i])

#Pasar de invertido a cadena
textoInvertido = " ".join(listaAlreves)
print("Texto invertido:", textoInvertido)