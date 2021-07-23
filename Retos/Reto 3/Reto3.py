from math import ceil 
from collections import defaultdict 
import os 
OLD_ANTENNAS = 18400
antennas ={
    "a":35600,
    "b":6800,
    "c":59300,
    "d":24200,
    "e":7400,
}
def departament_land():
    number = True
    while number == True:
        departament,land = input().split(" ")
        departament = int(departament)
        land = int(land)
        if departament >= 1:
            number = False        
        
    return departament, land
def data_obtaining(lands):
    data_collection = defaultdict(list)
    for zone in range(1, lands+1):
        antennas_installed_veificaction = True
        while antennas_installed_veificaction == True:
            numb_of_departament,installation_area,antennas_installed,type_of_new_antenna= input().split(" ")
            numb_of_departament = int(numb_of_departament)
            installation_area = int(installation_area)
            antennas_installed = int(antennas_installed)
            if antennas_installed >= 0:
                antennas_installed_veificaction = False 
        data_collection[zone].append(numb_of_departament)
        data_collection[zone].append(installation_area)
        data_collection[zone].append(antennas_installed)
        data_collection[zone].append(type_of_new_antenna)
    antenna_verification(data_collection,lands) 
def antenna_verification(data_collection,lands):
    for zone, values in data_collection.items(): 
        for element in range(0,len(values)-3): 
            if values[element] < 1 or values[element] > lands:
                data_collection[zone].append(0) 
    
    for zone, values in data_collection.items():
        if len(values) == 5:
            pass
        else:
            for element in range(3,len(values)):           
                if values[element] not in antennas.keys():
                    data_collection[zone].append(0) 
    antenna_count(data_collection)
def antenna_count(data_collection):
    for zone,values in data_collection.items():
        if len(values) == 5:
            pass
        else:    
            for element in range(0,len(values)):
                for element in range(3,len(values)):
                        antennas_to_install = (ceil((values[1] - (values[2]* OLD_ANTENNAS)) /(antennas.get(values[3]))))
                        if antennas_to_install < 0:
                            data_collection[zone].append(0)
                        else:
                            data_collection[zone].append(antennas_to_install)
    
                break
    total_antennas(data_collection)
def total_antennas(data_collection):
    clean_data = defaultdict(list)
    for zone,values in data_collection.items(): 
            for element_1 in range(len(values)):
                if element_1 == 0:
                    for element_2 in range(len(values)):
                        if element_2 == 3:
                            for element_3 in range(len(values)):
                                if element_3 == 4:
                                    clean_data[values[element_1]].append([values[element_2],values[element_3]])
    verificacion_of_values(clean_data)     
    
def verificacion_of_values(clean_data):
    full_data = defaultdict(list)
    antennas_to_install = {} 
    total_A_values = {}
    organization_of_values = defaultdict(list)
    for departament,values in clean_data.items():
        contador_1 = 0
        for element in values:
            for antenna in element:
                if type(antenna) == int:
                    contador_1 += antenna
                    antennas_to_install[departament] = contador_1
    for departament,values in clean_data.items():
        contador_2 = 0
        for element in values:
            if "a" in element:
                for value_A in element:
                    if type(value_A) == int:
                        contador_2 += value_A
                        total_A_values[departament] = contador_2
    
    for departament,values in antennas_to_install.items():
        full_data[departament].append(values)
    
    for departament,values in total_A_values.items():
        organization_of_values[departament].append(values*100 / (antennas_to_install.get(departament)))
    
    for departament,values in organization_of_values.items():
        full_data[departament].append(values[0])
    
    for departament,values in full_data.items():
        if len(values) != 2:
            full_data[departament].append(0)
    min_value = min(full_data.keys(), key= lambda k: full_data[k])
    max_value = max(full_data.keys(), key= lambda k: full_data[k])
    complete_information(full_data,min_value,max_value)
def complete_information(full_data,min_value,max_value):    
    
    full_data = sorted(full_data.items())
    full_data = dict(full_data)
    for departament,values in full_data.items():
        if departament == min_value:
            for element in range(len(values)):            
                if element == 0:
                    print(departament,values[element])
    for departament,values in full_data.items():
        if departament == max_value:
            for element in range(len(values)):            
                if element == 0:
                    print(departament,values[element])
    for keys,values in full_data.items():
            if values == 0.0: 
                print(f'{keys} 0.00%')
            else: #Si no 
                print("{} {:.2f}%".format(keys,values[1]))
            
            
def run():
    os.system("cls")
    number_of_zones = departament_land()
    departament = number_of_zones[0]
    lands = number_of_zones[1]
    data_obtaining(lands)
        
    
if __name__ == '__main__':
    run()