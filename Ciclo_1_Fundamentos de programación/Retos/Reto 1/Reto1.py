from math import ceil #Importa función
import os
OLD_ANTENNAS = 18400 #Area que cumbre las antenas antiguas
antennas ={  #Dicionario que contiene como llaves el tipo de antena y como valor su cobertura
    "a":35600,
    "b":6800,
    "c":59300,
    "d":24200,
    "e":7400,
}   
def verification(area,nubs_of_antennas,types_of_atennas): #La función recibe 3 parametros
    if nubs_of_antennas < 0: #Verifica si la variable es menor a 0
        print("Error en los datos ") #Imprime mensaje
    else: #Si la variable no es igual a 0 se ejecuta los siguiente
        if types_of_atennas not in antennas.keys(): #Verifica si la variable no se encuentra dentro de las llaves de antennas
            print("Error en los datos ") #Si no se encuentra imprime el mensaje
        else: #Si la variable se encuentra se continua con el código
            for antena,valores in antennas.items(): #Ciclo for que recorre la llave y el valor del diccionario
                if types_of_atennas == antena: #Si la variable types_of_atennas esta en alguna llave del diccionario
                    new_atennas =(area-(nubs_of_antennas*OLD_ANTENNAS))/valores
                    if new_atennas > 0:
                        print(ceil(new_atennas))
                    else:
                        print(0)
                    
    
def run():
    os.system("cls")
    
    try: #Try       
        area = float(input('Ingrese el área de la zona de instalación m2: ')) #Solicita al usuario un número flotante
        nubs_of_antennas = int(input('Ingrese el número de antenas que tiene ')) #Solicita al usuario un entero    
        types_of_atennas = input("""Ingrese el tipo de la nueva antes que desea: 
        
        
        a: 35600
        b: 6800
        c: 59300
        d: 24200
        e: 7400 
        
        """)                                                                        #Solicita al usuario que ingrese una string según las opciones del enunciado     
        verification(area,nubs_of_antennas,types_of_atennas) #La función recibe los 3 parámetros anteriores
    
    except:#Imprime mensjae si aparece error
        print('Error en los datos')  
         
        
if __name__ == '__main__':
    run()
