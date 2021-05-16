from math import ceil, perm
from collections import defaultdict
from functools import reduce


OLD_ANTENNAS = 18400

antennas ={  
    "a":35600,
    "b":6800,
    "c":59300,
    "d":24200,
    "e":7400,
}


def zonas_de_usuario():
    zonas = int(input('Ingrese el número de zonas que tiene '))
    if zonas == 0:
        return False
    else:
        return zonas


def obtencion_de_datos(numero_de_zonas):
    areas_totales = []
    antenas_previas = []
    new_antenas = []
    antenas_totales = 0
    porcentaje_de_antenas = defaultdict(list)
    verificacion_de_valores = defaultdict(list)
    no_esta = []


    for zona in range(1, numero_de_zonas+1):
        area_de_instalacion = float(input('Ingrese el area del terreno en m2 '))
        antenas_instaladas = int(input('Ingrese el número de antenas previamente instaladas '))
        tipo_de_nueva_antena = input('Ingrese el tipo de antena que desea ') #Agregar información de diccionario antennas
        areas_totales.append(area_de_instalacion)
        antenas_previas.append(antenas_instaladas)
        new_antenas.append(tipo_de_nueva_antena)

    for news in new_antenas:
        if news not in antennas.keys():
            no_esta.append(False)
    
    if False in no_esta:
        print(0)
        for llaves in antennas.keys():
            print(f'{llaves} 0.00%')
            
    else:
        for antena in antennas.keys():
            verificacion_de_valores[antena]

        for i in antenas_previas:
            if i < 0:
                x = antenas_previas.index(i)
                y = new_antenas[x]
                verificacion_de_valores[y].append(0)
            else:
                x = antenas_previas.index(i)
                y = new_antenas[x]
                z = ceil((areas_totales[x] - (i* OLD_ANTENNAS)) /(antennas.get(y)))
                if z < 0:
                    verificacion_de_valores[y].append(0)
                else:
                    verificacion_de_valores[y].append(z)

        for keys,values in verificacion_de_valores.items():
            for sumas in values:
                antenas_totales += sumas

        for keys,values in verificacion_de_valores.items():
            x = 0
            for sumas in values:
                x += sumas
                porcentaje_de_antenas[keys] = round(((x*100)/antenas_totales),2)

        
        for key in antennas.keys():
            if key not in porcentaje_de_antenas:
                porcentaje_de_antenas[key] = 0.00
        
        
        porcentaje_de_antenas = sorted(porcentaje_de_antenas.items())
        porcentaje_de_antenas = dict(porcentaje_de_antenas)


        for keys, values in porcentaje_de_antenas.items():
            if values == 0.0:
                porcentaje_de_antenas[keys] = "0.00"
        

        print(antenas_totales)
        for key, values in porcentaje_de_antenas.items():
            print(f'{key} {values}%')   




def run():
    numero_de_zonas = zonas_de_usuario()
    if numero_de_zonas == False:
        for llaves in antennas.keys():
            print(f'{llaves} 0.00%')
    else:
        datos_de_zonas = obtencion_de_datos(numero_de_zonas)     
    

if __name__ == '__main__':
    run()