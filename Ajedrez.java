

import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Ajedrez here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ajedrez
{
    
    public static void inicio(){
      
     
      int fi = lectura("fila inicial:");
      int ci = lectura("columna inicial:");
      int ff = lectura("fila final:");
      int cf = lectura("columna final:");
      //int coordenadas[] ={fi,ci,ff,cf};  //primer forma de inicializar coordenadas
        /*int coordenadas[] = new int[4];
        coordenadas[0] =fi;
        coordenadas[1] =ci;
        coordenadas[2] =ff;
        coordenadas[3] =cf;
        */
    
      int movimientos = evaluar(fi,ci,ff,cf); 
        System.out.println("se requieren: "+movimientos+" movimientos");
    }
    
    public static int lectura(String texto){
       Scanner scanner = new Scanner(System.in);
        int respuesta = 0; 
        System.out.println(texto);
       respuesta = scanner.nextInt();
       return respuesta;
    }
    
    public static int evaluar(int fi, int ci,int ff,int cf){
    int movimientos=0;
   
    List<int[]> listaEntrada = new ArrayList();
    List<int[]> listaSalida = new ArrayList();
    boolean cumplido=false;
    int FC[]= {fi,ci}; //pasa la fila inicial del vector coordenadas a la mariz de entrada
    listaEntrada.add(FC);
    
    while(cumplido == false && movimientos<=20){
    
    
    for(int[] i: listaEntrada){
        if((i[0]== ff) && (i[1]== cf)){
            cumplido=true;
        }
    }
    if(cumplido == true){
    return movimientos;
    }else{
    
        for(int[] i: listaEntrada){
        int fila;
        int columna;
            
        fila = i[0]-2;
        columna = i[1]+1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-2;
        columna = i[1]-1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-1;
        columna = i[1]+2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+1;
        columna = i[1]+2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+2;
        columna = i[1]+1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+2;
        columna = i[1]-1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-1;
        columna = i[1]-2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            
            fila = i[0]+1;
        columna = i[1]-2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
        
        
        }
    
        listaEntrada.clear();
        
        
        for(int[] i: listaSalida){
        listaEntrada.add(i);
        }
        
        listaSalida.clear();
        movimientos = movimientos +1;
        
    }
}
    return movimientos;
    }
    
    
}
