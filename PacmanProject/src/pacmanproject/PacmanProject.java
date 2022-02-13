/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacmanproject;

/**
 *
 * @author rjrsi
 */
            import java.util.Scanner;
            import java.util.Random;
      
public class PacmanProject {
    
    
    String nombre;
    String edad;
    int puntaje;
    int movimientos;
    
    int game;
    String historial[][] = new String[21][5]; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PacmanProject jugador = new PacmanProject();
        int juego = 2;
        
        while (juego == 2){ 
        
        // Tablero
            Scanner scanner = new Scanner(System.in); 
            
        System.out.println("**********************");
        System.out.println("* 1. Jugar           *");
        System.out.println("* 2. Historial       *");
        System.out.println("* 3. Salir           *");
        System.out.println("**********************");
        
        
        
        
        
        int opcion1 = scanner.nextInt();
        
        
        while (opcion1 > 3 || opcion1 <1){
        
           System.out.println("**********************");
        System.out.println("* 1. Jugar           *");
        System.out.println("* 2. Historial       *");
        System.out.println("* 3. Salir           *");
        System.out.println("**********************"); 
            System.out.println("Valor Invalido, intente de nuevo");
            opcion1 = scanner.nextInt();
        }
       
   //while(opcion1 <0 && opcion1 >4);
   
        
       switch (opcion1){
               
           // Código para el juego
           
           
               case 1:
                   jugador.game = jugador.game;
                   System.out.println("Ingrese su nombre");
                   Scanner nombre1 = new Scanner(System.in); 
                   jugador.nombre = nombre1.nextLine();
                   System.out.println("Ingrese su edad");
                   Scanner edad1 = new Scanner(System.in); 
                   jugador.edad = edad1.nextLine();
                   Scanner scanalto = new Scanner(System.in); 
                   System.out.println("Ingrese las filas del tablero");
                   int filas = scanalto.nextInt();
                   Scanner scanancho = new Scanner(System.in);
                   System.out.println("Ingrese las columnas del tablero");
                   int columnas = scanancho.nextInt();
                   
                   System.out.println("el alto es: " + filas +" y el ancho es: " + columnas);
                   
                   
                   while (columnas < 8 || filas < 8){
                       System.out.println("Las medidas deben ser de minimo 8*8");  
                       
                   System.out.println("Ingrese el alto del tablero");
                    filas = scanalto.nextInt();
                   
                   System.out.println("Ingrese el ancho del tablero");
                    columnas = scanancho.nextInt();
                   }
                   
                   filas = filas + 2;
                   columnas = columnas +2;
                   
                   Random MiAleatorio1 = new Random();
                   Random MiAleatorio2 = new Random();
                   Random MiAleatorio3 = new Random();
                   Random MiAleatorio4 = new Random();
                   Random MiAleatorio5 = new Random();
                   Random MiAleatorio6 = new Random();
                   Random MiAleatorio7 = new Random();
                   Random MiAleatorio8 = new Random();
                   
                   int posicionx = 1 + MiAleatorio1.nextInt(columnas-2);
                   int posiciony = 1 + MiAleatorio2.nextInt(filas-2);
                   int posicions1x = 1 + MiAleatorio3.nextInt(columnas-2);
                   int posicions1y = 1 + MiAleatorio4.nextInt(filas-2);
                   int posicions2x = 1 + MiAleatorio5.nextInt(columnas-2);
                   int posicions2y = 1 + MiAleatorio6.nextInt(filas-2);
                   int posicions3x = 1 + MiAleatorio7.nextInt(columnas-2);
                   int posicions3y = 1 + MiAleatorio8.nextInt(filas-2);
                   
                   
                   
                   String tablero[][] = new String[filas][columnas]; 
                   
                   
                   
                   // Llenando variables
                   for (int i = 0; i < filas; i++) { //numero de filas
                       for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                           
                               if (i == 0 || i == filas-1) {
                               
                                   tablero[i][j] = "*";
                                   
                                   
                           }
                               else if (j == 0 || j == columnas-1) {
                               tablero[i][j] = "*";
                           }
                               else{
                                   tablero[i][j] = " ";
                                   
                    Random random = new Random();
                    String paredesi = "*   *"+"    "+"    "+"   ";
                    int randomInt = random.nextInt(paredesi.length());
                    char randomChar = paredesi.charAt(randomInt);
                    tablero[i][j] = ""+randomChar;
                                   
                                       tablero[posiciony][posicionx] = "V";
                                   tablero[posicions1y][posicions1x] = "#";
                                   tablero[posicions2y][posicions2x] = "$";
                                   tablero[posicions3y][posicions3x] = "@";
                                   
                                   
                                   
                                   
                                   
                                   
                          }
                               
                       }
                    }
                   
                   
                  
                   
                   //Creando un vacio a la mitad
                   tablero[filas/2][0] = " ";
                   tablero[filas/2][columnas-1] = " ";
                   
                   System.out.println("Nombre: "+ jugador.nombre + " Edad:"+ jugador.edad);
                   System.out.println("Puntaje: 10");
                   
                   //Creando tablero
                  for (int i = 0; i < filas; i++) { //numero de filas
                       for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                           System.out.print(tablero[i][j]);
                              
                       }
                       System.out.println(" ");
                    }
                   System.out.println(" ");
                   
                   
                   System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                   
                   Scanner movimiento = new Scanner(System.in);
                   String movimiento1 = movimiento.nextLine();
                   
                   
                    jugador.puntaje = 10;
                   jugador.movimientos = 0;
                   juego = 1;
                   
                   while (juego == 1){
                   
                   while (!"m".equals(movimiento1) & (jugador.puntaje >0 & jugador.puntaje <=100)){
                       
                       
                       
                       if("a".equals(movimiento1) ||"w".equals(movimiento1) || "s".equals(movimiento1) ||"d".equals(movimiento1)) {
                           jugador.movimientos = jugador.movimientos +1;
                       }
                       //movimiento a
                       if ("a".equals(movimiento1)) {
  //incio de if para evaluar bordes
   
                       
                          if (!"*".equals(tablero[posiciony][posicionx-1])) { 
                           
                              //tablero[filas/2][0] = " ";
                              //tablero[filas/2][columnas-1] = " ";
                        // Inicio de If evaluando bordes vacios
                              
                                
                                
                            if (tablero[posiciony][posicionx].equals(tablero[filas/2][1]) ){  
                              
                                
                                
                                
                                
                                tablero[posiciony][posicionx] = " ";
                                posicionx =  columnas-1;
                                tablero[posiciony][posicionx] = "V";
                                for (int i = 0; i < filas; i++) { //numero de filas
                                for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                System.out.print(tablero[i][j]);
                              
                                 }
                                System.out.println(" ");
                                 
                                 }
                                System.out.println(" ");
                           
                                movimiento1 = movimiento.nextLine();
                   
                            }
                            
                            else{ 
                                
                                if ("$".equals(tablero[posiciony][posicionx-1])) {
                                  
                                    jugador.puntaje = jugador.puntaje + 15;
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions2y  = 1 + dolar.nextInt(filas-2);
                            posicions2x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions2y][posicions2x] = "$";
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                              }
                                else if ("#".equals(tablero[posiciony][posicionx-1])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions1y  = 1 + dolar.nextInt(filas-2);
                            posicions1x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions1y][posicions1x] = "#";
                                    jugador.puntaje = jugador.puntaje - 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                                else if ("@".equals(tablero[posiciony][posicionx-1])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions3y  = 1 + dolar.nextInt(filas-2);
                            posicions3x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions3y][posicions3x] = "@";
                                    jugador.puntaje = jugador.puntaje + 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                            
                                else {     
                            posicionx = posicionx -1;
                            tablero[posiciony][posicionx] = "V";
                            tablero[posiciony][posicionx+1] = " ";   
                            
                            
                            for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                            }
                            }
                       }
      //Fin de If para evaluar bordes                    
                          else {
                              System.out.println("Movimiento invalido");
                              for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                       }
                          System.out.println(" ");
                    }
                   System.out.println(" ");
                   
                              
                              System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                              movimiento1 = movimiento.nextLine();
                              
                          }
                       }
                       
                      
                       
                       
                       else if ("d".equals(movimiento1)) {
  
                           if (!"*".equals(tablero[posiciony][posicionx+1]))  {
                               
                               
                                if ("V".equals(tablero[filas/2][columnas - 2])){
                                    
                                    tablero[posiciony][posicionx] = " ";
                                posicionx =  1;
                                tablero[posiciony][posicionx] = "V";
                                for (int i = 0; i < filas; i++) { //numero de filas
                                for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                System.out.print(tablero[i][j]);
                              
                                 }
                                System.out.println(" ");
                                 
                                 }
                                System.out.println(" ");
                           
                                movimiento1 = movimiento.nextLine();
                                    
                                }
                                    
                                   
                                
                                else{
                                    
                                    if ("$".equals(tablero[posiciony][posicionx+1])) {
                                  
                                    jugador.puntaje = jugador.puntaje + 15;
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions2y  = 1 + dolar.nextInt(filas-2);
                            posicions2x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions2y][posicions2x] = "$";
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                              }
                                else if ("#".equals(tablero[posiciony][posicionx+1])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions1y  = 1 + dolar.nextInt(filas-2);
                            posicions1x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions1y][posicions1x] = "#";
                                    jugador.puntaje = jugador.puntaje - 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                                else if ("@".equals(tablero[posiciony][posicionx+1])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions3y  = 1 + dolar.nextInt(filas-2);
                            posicions3x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posicionx = posicionx +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions3y][posicions3x] = "@";
                                    jugador.puntaje = jugador.puntaje + 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                                else{ 
                                   posicionx = posicionx +1;
                                   tablero[posiciony][posicionx] = "V";
                                   tablero[posiciony][posicionx-1] = " ";
                                   
                                   
                                   for (int i = 0; i < filas; i++) { //numero de filas
                                       for (int j = 0; j < columnas; j++) { // numero de columnas
                                           
                                           System.out.print(tablero[i][j]);
                                           
                                       }
                                       System.out.println(" ");
                                   }
                                   System.out.println(" ");
                                   
                                   
                                   System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                                   movimiento1 = movimiento.nextLine();
                                }
                               }
                           }
      //Fin de If para evaluar bordes                    
                          else {
                               System.out.println("Movimiento invalido");
                               for (int i = 0; i < filas; i++) { //numero de filas
                                   for (int j = 0; j < columnas; j++) { // numero de columnas
                                       
                                       System.out.print(tablero[i][j]);
                                       
                                   }
                                   System.out.println(" ");
                               }
                               System.out.println(" ");
                               
                               
                               System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                               movimiento1 = movimiento.nextLine();
                               
                           }
                       }
                    else if ("s".equals(movimiento1)) {
  
                          if (!"*".equals(tablero[posiciony+1][posicionx])) { 
                              if ("$".equals(tablero[posiciony+1][posicionx])) {
                                  
                                    jugador.puntaje = jugador.puntaje + 15;
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions2y  = 1 + dolar.nextInt(filas-2);
                            posicions2x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions2y][posicions2x] = "$";
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                              }
                                else if ("#".equals(tablero[posiciony+1][posicionx])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions1y  = 1 + dolar.nextInt(filas-2);
                            posicions1x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions1y][posicions1x] = "#";
                                    jugador.puntaje = jugador.puntaje - 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                                else if ("@".equals(tablero[posiciony+1][posicionx])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions3y  = 1 + dolar.nextInt(filas-2);
                            posicions3x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony +1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions3y][posicions3x] = "@";
                                    jugador.puntaje = jugador.puntaje + 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                              else{
                           posiciony = posiciony +1;
                           tablero[posiciony][posicionx] = "V";
                            tablero[posiciony-1][posicionx] = " ";   
                            
                            
                            for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                       }
                          System.out.println(" ");
                    }
                   System.out.println(" ");
                   
                   
                   System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                   movimiento1 = movimiento.nextLine();
                   
                   
                   
                          }  
                          }  
                          else {
                              System.out.println("Movimiento invalido");
                              for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                       }
                          System.out.println(" ");
                    }
                   System.out.println(" ");
                              
                              System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                              movimiento1 = movimiento.nextLine();
                              
                          }
                       }  
                       
                    else if ("w".equals(movimiento1)) {
  
                          if (!"*".equals(tablero[posiciony-1][posicionx])) { 
                          
                              if ("$".equals(tablero[posiciony-1][posicionx])) {
                                  
                                    jugador.puntaje = jugador.puntaje + 15;
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions2y  = 1 + dolar.nextInt(filas-2);
                            posicions2x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions2y][posicions2x] = "$";
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                              }
                                else if ("#".equals(tablero[posiciony-1][posicionx])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions1y  = 1 + dolar.nextInt(filas-2);
                            posicions1x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions1y][posicions1x] = "#";
                                    jugador.puntaje = jugador.puntaje - 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                              else if ("@".equals(tablero[posiciony-1][posicionx])){
                                    
                                    Random dolar = new Random();
                                    Random dolar1 = new Random();
                            posicions3y  = 1 + dolar.nextInt(filas-2);
                            posicions3x  = 1 + dolar1.nextInt(columnas-2);
                            tablero[posiciony][posicionx] = " ";
                            posiciony = posiciony -1;
                                    tablero[posiciony][posicionx] = "V";
                                    tablero[posicions3y][posicions3x] = "@";
                                    jugador.puntaje = jugador.puntaje + 10;
                                    
                                    for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                             }
                           System.out.println(" ");
                             }
                           System.out.println(" ");
                   
                   
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                           movimiento1 = movimiento.nextLine();
                                    
                                    
                                }
                              else{
                           posiciony = posiciony -1;
                           tablero[posiciony][posicionx] = "V";
                            tablero[posiciony+1][posicionx] = " ";   
                            
                            
                            for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                       }
                          System.out.println(" ");
                    }
                   System.out.println(" ");
                   
                   
                   System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                   movimiento1 = movimiento.nextLine();
                   
                   
                   
                          } 
                          }  
                          else {
                              
                               System.out.println("Movimiento invalido");
                              for (int i = 0; i < filas; i++) { //numero de filas
                                 for (int j = 0; j < columnas; j++) { // numero de columnas
                           
                                     System.out.print(tablero[i][j]);
                              
                       }
                          System.out.println(" ");
                    }
                   System.out.println(" ");
                   
                   
                             
                              System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                              movimiento1 = movimiento.nextLine();
                              
                          }
                       }
                       
                       System.out.println("Su puntaje es: " + jugador.puntaje);
                       System.out.println("Nombre: " + jugador.nombre);
                       System.out.println("Edad: " + jugador.edad);
                       System.out.println("movimientos: " + jugador.movimientos);
                       
                       if (!"a".equals(movimiento1) && !"w".equals(movimiento1) && !"s".equals(movimiento1) && !"d".equals(movimiento1) && !"m".equals(movimiento1) ){
                           System.out.println("Ingrese el movimiento que desea hacer (awsd)");
                              movimiento1 = movimiento.nextLine();
                       }
                   }
                   
                   
                   if ("m".equals(movimiento1)){
                   System.out.println("Desea regresar al tablero(1) o ir al inicio(2)");
                   Scanner Scanjuego = new Scanner(System.in);
                   juego = Scanjuego.nextInt();
                   movimiento1 = " ";
                   }
                   else{
                       if(jugador.puntaje >=100){
                           System.out.println("Ha ganado");
                           juego =2;
                       }
                       else{
                           System.out.println("Ha perdido");
                           juego=2;
                       }
                       
                   }
                   
                   
                   
               }
                   
                   jugador.game = jugador.game +1;
                   
                   break;
                   
                   // codigo para el historial
               case 2:
                  
                    
                   
                   
                   
                   
                   
                    System.out.println("              Jugadores               " );
                    jugador.historial[0][0] = "No.      ";
                    jugador.historial[0][1] = "Nombre    ";
                    jugador.historial[0][2] = "Edad      ";
                    jugador.historial[0][3] = "Puntaje    ";
                    jugador.historial[0][4] = "Movimiento    ";
                    
                    /*System.out.print(jugador.historial[0][0]);
                    System.out.print(jugador.historial[0][1]);
                    System.out.print(jugador.historial[0][2]);
                    System.out.print(jugador.historial[0][3]);
                    System.out.println(jugador.historial[0][4]);*/
                    
                    jugador.historial[jugador.game][0] = jugador.game+ "        ";
                    jugador.historial[jugador.game][1] = jugador.nombre+ "     ";
                    jugador.historial[jugador.game][2] = jugador.edad+ "       ";
                    jugador.historial[jugador.game][3] = jugador.puntaje +"         ";
                    jugador.historial[jugador.game][4] = jugador.movimientos + "";
                        
                   /* System.out.print(jugador.historial[jugador.game][0]);
                    System.out.print(jugador.historial[jugador.game][1]);
                    System.out.print(jugador.historial[jugador.game][2]);
                    System.out.print(jugador.historial[jugador.game][3]);
                    System.out.println(jugador.historial[jugador.game][4]);*/
                   
                    
                    for (int i = 0; i <= jugador.game; i++) {
                       for (int j = 0; j < 5; j++) {
                           System.out.print(jugador.historial[i][j]);
                       }
                       System.out.println(" ");
                   }
                    System.out.println("");
                  
                   break;
                   
                   
                   //codigo para salir
               case 3:
                   System.out.println("Gracias por jugar");
                   System.exit(0);
                   break;
            
           }
        
        } 
    }       
}
