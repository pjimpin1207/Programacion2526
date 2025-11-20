import re
#Ejemplo 1: Buscar números de 4 dígitos (Año)

texto = "Nació en 1985 y el libro es de 2023."
patron = r'\d{4}' # Busca exactamente 4 dígitos
print(re.findall(patron, texto))
# Salida: ['1985', '2023']

#Ejemplo 2: Buscar una palabra que empieza por 'a' y acaba por 'o'

texto = "animal, árbol, amigo, oso."
patron = r'a\w*o' # 'a' + 0 o más letras/números + 'o'
print(re.findall(patron, texto))
# Salida: ['animalo', 'amigo'] -> ¡Ojo, incluye 'animalo'! (Discusión sobre límites)
