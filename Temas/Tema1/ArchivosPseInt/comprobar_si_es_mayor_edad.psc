Algoritmo comprobar_si_es_mayor_edad
	Definir anioNacimiento, anioActual, edad Como Entero
	
	Escribir "Introduce el año de nacimiento"
	leer anioNacimiento
	
	Escribir "introduce el año actual:"
	Leer anioActual
	
    edad = anioActual - anioNacimiento
	
	Si edad >= 18 Entonces
        Escribir "Eres mayor de edad. Tienes ", edad, " años."
    Sino
        Escribir "Eres menor de edad. Tienes ", edad, " años."
    FinSi
	
FinAlgoritmo
