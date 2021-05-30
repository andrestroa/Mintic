from math import ceil #Importa libreria para redondear
from collections import defaultdict #Importar libreria para modificar diccionarios
import os #Importa libreria para limpiar consola

OLD_ANTENNAS = 18400 #Cobertura de antena

antennas ={   #Diccionario de antenas nuevas
    "a":35600,
    "b":6800,
    "c":59300,
    "d":24200,
    "e":7400,
}

def user_zones(): #Función que pide zonas al usuario
    zones = int(input('Ingrese el número de zonas que tiene ')) 
    if zones == 0: #Verifica si las zonas ingresadas son igual a 0
        return False
    else:
        return zones #Si no es 0 regresa las zonas

def data_obtaining(number_of_zones): #Pide al usuario los datos para validar

    data_collection = defaultdict(list)
    for zone in range(1, number_of_zones+1): #Bucle que pide los valores al usuario y los agrega al diccionario
        installation_area = float(input('Ingrese el area del terreno en m2 ')) 
        antennas_installed = int(input('Ingrese el número de antenas previamente instaladas '))
        type_of_new_antenna = input('Ingrese el tipo de antena que desea ')
        data_collection[zone].append(installation_area) 
        data_collection[zone].append(antennas_installed) 
        data_collection[zone].append(type_of_new_antenna)

    antenna_verification(data_collection) #Envia el diccionario a la función para verificar el tipo de nueva antena

def antenna_verification(data_collection):

    data_collection_copy = defaultdict(list)

    for zone, values in data_collection.items(): #Crea un bucle para verificar los datos del diccionario
        for element in range(2,len(values)): #Recorre unicamente el elemento 2 de la lista
            if values[element] in antennas.keys(): #Verificar si el elemento se encuentra en el diccionario de antenas
                data_collection_copy[zone] = values #Si se encuentra lo agrega al nuevo diccionario con sus valores
    
    for zone, values in data_collection_copy.items(): #Crea un bucle para verificar los datos del diccionario
        for element in range(1,len(values)-1): #Recorre unicamente el elemento 1 de la lista
            if values[element] < 0:
                data_collection_copy[zone].append(0)
    
    antenna_count(data_collection_copy) #Envia el diccionario a la función para realizar la operación de antenas de cada zona

def antenna_count(data_collection_copy):

    try:
        
        full_data = defaultdict(list)
        full_data = data_collection_copy    
    
        for zone,values in data_collection_copy.items(): #Crea un bucle para verificar los datos del diccionario
            for element in range(0,len(values)): #Recorre una lista
                antenna_formula = ceil((values[0] - (values[1]* OLD_ANTENNAS)) /(antennas.get(values[2]))) #Realiza operación            
                if len(values) == 4: #Si la lista tiene 4 valores singifica que tiene un 0 que es el valor de las antenas a instalar
                    pass       
                else: #Si no lo tiene se verifica lo siguienten
                    if antenna_formula < 0: #Si el resultado de la operación es negativo se agrega a la llave un 0 en su valor
                        full_data[zone].append(0)
                    else:
                        full_data[zone].append(antenna_formula) #Si no es negativo se agrega el valor 
        
        total_antennas(full_data) #Se envia los resultados para sacar los valores finales 
    except ZeroDivisionError:
        antenna_formula = 0
        total_antennas(full_data)     
    

def total_antennas(full_data):

    try:
    
        total = 0 #Número de antenas totales a instalar
        clean_data = defaultdict(list) #Diccionario organizado
    
        for zone,values in full_data.items(): #Crea un bucle para verificar los datos del diccionario
            for element in range(3,len(values)):  #Recorre unicamente el elemento 3 de la lista
                total += values[element] #Va sumando los elementos a la variable
        
        for zone,values in full_data.items(): #Crea un bucle para verificar los datos del diccionario
            for element in range(3,len(values)): #Recorre unicamente el elemento 3 de la lista
                antenna_percentage = ((values[element] * 100)/ total) #Realiza la operación 
                full_data[zone].append(antenna_percentage) #Agrega al diccionario el resultado 
    
        for zone,values in full_data.items(): #Crea un bucle para verificar los datos del diccionario
            for element_1 in range(len(values)): #Recorre los elementos de la lista 
                if element_1 == 2: #Verifica si el elemento tiene la posición 2
                    for element_2 in range(len(values)): #Crea un bucle para verificar los datos del diccionario
                        if element_2 == 4: #Verifica si el elemento tiene la posición 4              
                            clean_data[values[element_1]].append(values[element_2]) #Agrega las variable si cumplen la condición al diccionario
        
        for antenna,values in clean_data.items(): #Crea un bucle para verificar los datos del diccionario
            sub_value = 0 #Variable que contendra los valores sumados y luego se reiniciara
            for element in values: #Verifica los elementos de la lista            
                sub_value += element #Suma los elementos
                clean_data[antenna] = sub_value #Agrega al diccionario el valor de la variable 
        
        
        for keys in antennas.keys(): #Crea un bucle para verificar los datos del diccionario
            if keys not in clean_data.keys(): #Si la llave no se encuentra en el diccionario la agrega 
                clean_data[keys] = 0.00
        
        clean_data = sorted(clean_data.items()) #Organiza el diccionario convirtiendolo en lista
        clean_data = dict(clean_data) #Cambia la lista a diccionario
    
        
        print(total) #Imprime el total
        for keys,values in clean_data.items(): #Crea un bucle para verificar los datos del diccionario     
            if values == 0.0: #Si el valor es 0.00, 
                print(f'{keys} 0.00%')
            else: #Si no 
                print("{} {:.2f}%".format(keys,values))

    except ZeroDivisionError:         
        print(0)
        for antenna_keys in antennas.keys():            
            print(f'{antenna_keys} 0.00%')     
        

def run():
    os.system("cls")
    number_of_zones = user_zones() #Pide las zonas al usuario y regresa un valor el número o un False
    if number_of_zones == False: #Si el valor regresado es False se imprime el siguiente código
        print(0)
        for antenna_keys in antennas.keys():            
            print(f'{antenna_keys} 0.00%')
    else: #Si es un número se continua con el código
        data_obtaining(number_of_zones) #Pide los demás datos al usuario y recibe como parametro el número de zonas       
    

if __name__ == '__main__':
    run()