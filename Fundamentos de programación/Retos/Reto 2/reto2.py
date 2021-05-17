from math import ceil, perm #Importa libreria para redondear
from collections import defaultdict #Importar libreria para modificar diccionarios
import os

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
    total_areas = [] #Lista con el tamaño de las zonas
    previous_antennas = [] #Las antenas previas instaladas
    new_antennas = [] #El tipo de nueva antena
    total_antennas = 0 #Suma de antenas a instalar
    percentage_of_antennas = defaultdict(list) #Diccionario con la suma de cada antena
    values_checking = defaultdict(list) #Diccionario con las anntenas a instalar
    antenna_type_check = [] #Verifica si la antena existe o no


    for zone in range(1, number_of_zones+1): #Bucle que pide los valores al usuario y los agrega a la lista
        installation_area = float(input('Ingrese el area del terreno en m2 ')) 
        antennas_installed = int(input('Ingrese el número de antenas previamente instaladas '))
        type_of_new_antenna = input('Ingrese el tipo de antena que desea ') 
        total_areas.append(installation_area) 
        previous_antennas.append(antennas_installed)
        new_antennas.append(type_of_new_antenna)

    for new in new_antennas: #Bucle que verifica si el tipo de antena existe
        if new not in antennas.keys(): #Si el tipo de antena no se encuentra en el diccionario de antennas
            antenna_type_check.append(False) #Agrega un False a la lista
    
    if False in antenna_type_check: #Verifica si la lista contiene un diccionarios, si lo contiene imprime el código
        print(0)
        for antenna_keys in antennas.keys():
            print(f'{antenna_keys} 0.00%')
            
    else:
        for antenna in antennas.keys(): #Agrega las llaves al diccionario 
            values_checking[antenna]

        for old_antenna in previous_antennas: #verifica si las antenas previas son negativas
            if old_antenna < 0:
                old_antenna_position = previous_antennas.index(old_antenna) #Regresa la posición de la antena negativa
                new_antenna_position = new_antennas[old_antenna_position] #Busca la posición de la nueva antena que le corresponde el valor negativo
                values_checking[new_antenna_position].append(0) #Se agrega la variable anterior como llave y como valor 0
            else:
                old_antenna_position = previous_antennas.index(old_antenna) #Regresa la posición de la antena 
                new_antenna_position = new_antennas[old_antenna_position] #Busca la posición de la nueva antena que le corresponde
                antenna_formula = ceil((total_areas[old_antenna_position] - (old_antenna* OLD_ANTENNAS)) /(antennas.get(new_antenna_position))) #Genera la operación
                if antenna_formula < 0: #Verifica si el resultado no es negativo
                    values_checking[new_antenna_position].append(0) #Si es negativo agrega al diccionario la antena que se esta verificando y el valor 0
                else:
                    values_checking[new_antenna_position].append(antenna_formula) #Agrega al diccionario la antena que se esta verificando y el resultado 

        for keys,values in values_checking.items(): #Recorre el diccionario con los valores previos
            for element in values: #verifica cada lista que se encuentra en los valores
                total_antennas += element #Suma los valores recorridos

        for keys,values in values_checking.items(): #Recorre el diccionario
            sum_of_antennas = 0 #Crea una variable para verificar la suma de cada tipo de antena y cada iteración la inicia en 0
            for element in values: #Recorreo los valores de cada lista 
                sum_of_antennas += element #Suma cada valor encontrado en la lista
                percentage_of_antennas[keys] = round(((sum_of_antennas*100)/total_antennas),2) #Agrega al diccionario la llave recorrida y el porcentaje de la operación

        
        for key in antennas.keys(): #Recorre el diccionario 
            if key not in percentage_of_antennas: #Verifica si antena hace falta al diccionario
                percentage_of_antennas[key] = 0.00 #Si no esta se agrega y se le asigna el valor 0.00
        
        
        percentage_of_antennas = sorted(percentage_of_antennas.items()) #Se convierte el diccionario en lista y se ordena
        percentage_of_antennas = dict(percentage_of_antennas) #Lueg se convierte en diccionario


        for keys, values in percentage_of_antennas.items(): #Se recorre el diccionario
            if values == 0.0: #Si el valor de la llave es 0.00
                percentage_of_antennas[keys] = "0.00" #Se cambia a 0.00
        

        print(total_antennas) #Se imprime el total de antenas
        for key, values in percentage_of_antennas.items(): #Se recorre el diccionario 
            print(f'{key} {values}%') #Imprime la llave y su valor con porcentaje   


def run():
    os.system("cls")
    number_of_zones = user_zones() #Pide las zonas al usuario y regresa un valor el número o un False
    if number_of_zones == False: #Si el valor regresado es False se imprime el siguiente código
        for antenna_keys in antennas.keys():
            print(0)
            print(f'{antenna_keys} 0.00%')
    else: #Si es un número se continua con el código
        data_obtaining(number_of_zones) #Pide lso demás datos al usuario y crecibe como parametro el número de zonas       
    

if __name__ == '__main__':
    run()