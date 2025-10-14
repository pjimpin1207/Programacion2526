#Crea una función que cuente cuántas vocales hay en una cadena dada y las reemplace por una ‘X’.

def cuentaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    return cuenta

    
def reemplazar_vocales(cadena):
    vocales = "aeiouAEIOU"
    contador = 0
    nueva_cadena = ""
    
    for letra in cadena:
        if letra in vocales:
            nueva_cadena += "X"
            contador += 1
        else:
            nueva_cadena += letra
    
    return contador, nueva_cadena

# Ejemplo de uso
texto = input("Introduce una cadena: ")
num_vocales, resultado = reemplazar_vocales(texto)
print("Número de vocales reemplazadas:", num_vocales)
print("Cadena resultante:", resultado)
print(cuentaA)
 
