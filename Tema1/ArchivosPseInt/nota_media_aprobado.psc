Algoritmo nota_media_aprobado
    Definir nota1, nota2, nota3, suma, media Como Real
    
    Escribir "Introduce la primera nota"
    leer nota1
    Escribir "Introduce la segunda nota"
    leer nota2
    Escribir "Introduce la tercera nota"
    leer nota3
    
    suma = nota1 + nota2 + nota3
    media = suma / 3
    Escribir "La nota media es: ", media
	
    Si media >= 5 Entonces
        Escribir "¡El alumno ha aprobado!"
    Sino
        Escribir "El alumno no ha aprobado."
    FinSi
	
FinAlgoritmo
