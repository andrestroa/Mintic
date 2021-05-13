from math import ceil 
import os

OLD_ANTENNAS = 18400 
antennas ={  
    "a":35600,
    "b":6800,
    "c":59300,
    "d":24200,
    "e":7400,
}


def verificacion_de_zona(): #Verifica que la zona sea un número >= a 0 
    zona = -1
    while zona < 0:
        zona = int(input('Ingrese el número de zonas '))
    return zona


def zonas_y_areas(numero_de_zonas): #Crea un diccionario con las zonas y sus valores en m2
    areas_de_zonas = {}
    for zona in range(1, numero_de_zonas + 1):
        area = int(input('Ingrese el area del terreono en m2 '))
        areas_de_zonas[zona] = area
    return areas_de_zonas

def verificacion_de_antenas():
    antenna = -1
    while antenna < 0:
        antenna = int(input('Ingrese el número de antenas que tiene '))
    return antenna

def nuevas_antennas():
    conjunto_de_antenas = ["a","b","c","d","e"]
    tipo_de_antena = input("""Ingrese el tipo de la nueva antes que desea: 
        
        
        a: 35600
        b: 6800
        c: 59300
        d: 24200
        e: 7400 
        
        """)

    for antenas in conjunto_de_antenas :
        if tipo_de_antena == antenas:
            break
        else:
            return 0
    return tipo_de_antena
        




##
##def verification(area,nubs_of_antennas,types_of_atennas): #La función recibe 3 parametros
##    if nubs_of_antennas < 0: #Verifica si la variable es menor a 0
##        print("Error en los datos ") #Imprime mensaje
##    else: #Si la variable no es igual a 0 se ejecuta los siguiente
##        if types_of_atennas not in antennas.keys(): #Verifica si la variable no se encuentra dentro de las llaves de antennas
##            print("Error en los datos ") #Si no se encuentra imprime el mensaje
##        else: #Si la variable se encuentra se continua con el código
##            for antena,valores in antennas.items(): #Ciclo for que recorre la llave y el valor del diccionario
##                if types_of_atennas == antena: #Si la variable types_of_atennas esta en alguna llave del diccionario
##                    new_atennas =(area-(nubs_of_antennas*OLD_ANTENNAS))/valores
##                    if new_atennas > 0:
##                        print(ceil(new_atennas))
##                    else:
##                        print(0)
##
##
##                    
    

def run():
    os.system("cls")
    
    try: #Try
        numero_de_zonas = verificacion_de_zona()
        area_de_antenas = zonas_y_areas(numero_de_zonas)  
        nubs_of_antennas = verificacion_de_antenas() 
        types_of_atennas = nuevas_antennas()

        print(types_of_atennas)

        
        
        
    
    except:
        print('Error en los datos')  
         
        
if __name__ == '__main__':
    run()