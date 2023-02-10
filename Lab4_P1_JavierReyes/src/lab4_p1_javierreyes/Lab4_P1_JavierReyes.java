/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class Lab4_P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        // TODO code application logic here
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("Bienvenido al menu de laboratio 4");
            System.out.println("seleccione una opcion a continuacion: ");
            System.out.println("1. Substitute");
            System.out.println("2. Palindromas");
            System.out.println("3. Contenida o no");
            System.out.println("4. Salir");
            
            opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1:
                    System.out.println("Selecciono: Substitute");
                    String cadena1;
                    String cadena2;
                    
                    System.out.println("Ingrese una cadena (con el simbolo %d): ");
                    cadena1 = lea.nextLine();
                    System.out.println("Ingrese la cadena que hara la substitucion: ");
                    cadena2 = lea.nextLine();
                    
                    for (int i=0; i<cadena1.length(); i++){
                        if(cadena1.charAt(i)== 'd'){
                            
                    }
                    }
                    
                    break;
                    
                case 2:
                    System.out.println("Selecciono: Palindromas");
                    
                    String palabra;
                    char [] palindromo;
                    int izq, der;
                    System.out.println("Ingrese una palabra: ");
                    palabra = lea.nextLine();
                    palabra = palabra.toLowerCase();
                    palindromo = palabra.toCharArray();
                    izq = 0;
                    der = palindromo.length - 1;
                    
                    while (izq < der){
                        if (palindromo[izq] == palindromo [der]){
                            der--;
                            izq++;
                        
                        }else{
                            System.out.println(" no es palindroma");
                            break;
                        }
                    }
                    if (izq == der){
                        System.out.println(" es palindroma");
                    }
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Selecciono: Contenida o no ");
                    String palabra1;
                    String palabra2;
                    
                    System.out.println("Ingrese una cadena (larga):");
                    palabra1 = lea.nextLine();
                    System.out.println("Ingrese una cadena (corta):");
                    palabra2 = lea.nextLine();
                    
                  
                    
                    
                    
                    break;
                    
                case 4:
                    
                    salir = true;    
                    break;
                
                
               
            }
        }
    }    
}
