import re

data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Código de cliente: ABC123456
Teléfono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""

# A. Buscar todos los emails
patron = r"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}"
correos = re.findall(patron, data)
print("A.Correos encontrados:", correos)

# B. buscar las fechas con formato DD-MM-AAAA
patron = r"\d{2}-\d{2}-\d{4}"
fechas = re.findall(patron, data)
print("B.Fechas encontradas:", fechas)

# C. buscar codigo de cliente que siempre empieza por 3 mayusculas y le siguen 6 digitos
patron = r"[A-Z]{3}\d{6}"
codigo= re.findall(patron, data)
print("C. Codigo de cliente encontrado:", codigo)

#D. buscar todos los nombres de archivo que terminan en .py
patron = r"\w+\.py"
archivo = re.findall(patron, data)
print("D.Archivos .py encontrados:", archivo)