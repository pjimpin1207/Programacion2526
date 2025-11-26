palabra = input("Introduce una palabra: ")
invertida = palabra[::-1]

print("Palabra invertida:", invertida)

if palabra == invertida:
    print("Es un palíndromo.")
else:
    print("No es un palíndromo.")


email = " juan.perez@dominio.com "

limpio = email.strip()
print("Sin espacios:", limpio)

mayus = limpio.upper()
print("En mayúsculas:", mayus)

partes = limpio.split("@")
print("Nombre:", partes[0])
print("Dominio:", partes[1])


clase = "titulo"
contenido = "Mi Encabezado"

html = f'<h1 class="{clase}">{contenido}</h1>'
print(html)