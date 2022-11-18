/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elián
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Alumno alumno = new Alumno(); 
        Alumno alumno = new Alumno();
        Alumno[] alumnos = new Alumno[10];
    
        
        
        System.out.println("#################### File ####################");
        
        File archivo = new File("archivo.txt"); //apuntador a archivo.txt -> la ruta es relativa
        System.out.println(archivo.exists()); //aun no se crea el archivo -> false
        boolean seCreo; // badera si se crea el archivo
        try {
            seCreo = archivo.createNewFile(); // se crea el archivo
            System.out.println(seCreo); // True 
            System.out.println(archivo.exists()); // True
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#################### Onbtener desde el teclado ####################");
        
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //para meter el texto en un buffer desde el teclado 
            System.out.println("Escribe texto: ");
            String texto = br.readLine();
            System.out.println(texto);
        
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#################### FileWriter ####################");
        
        try {
            
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Esto es una impresion de texto en el archivo");  //cuando se compila de nuevo, b¡no se quedan los datos que se escribieron directamente en el archivo
            salida.println("Esto es la segunda linea");
            for (int i = 0; i < 10; i++) {
                salida.println("Linea escrita por el for" + i);   
            }
            salida.close();
         
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#################### FileReader ####################");
        
        try { 
            
            FileReader fr;
            fr = new FileReader("fw.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            br.close();
                
        }catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("#################### Alumno ####################");
        
        
        System.out.println("#################### FileWriter ####################");
        
        try {
            
            FileWriter fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Elian,Sanchez,Rodrifuez,317167245,22,9.7");  //cuando se compila de nuevo, b¡no se quedan los datos que se escribieron directamente en el archivo
     
            salida.close();
         
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#################### FileReader ####################");
        
        try { 
            
            FileReader fr;
            fr = new FileReader("listaAlumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            System.out.println(linea);
            
            System.out.println("####### StringTokenizer ########");
            StringTokenizer tokenizador = new StringTokenizer(linea, ","); 
            while(tokenizador.hasMoreTokens()){
                String token1 = tokenizador.nextToken();
                alumno.setNombre(token1);
                String token2 = tokenizador.nextToken();
                alumno.setApPaterno(token2);
                String token3 = tokenizador.nextToken();
                alumno.setApMaterno(token3);
                String token4 = tokenizador.nextToken(); 
                int Token4 = Integer.parseInt(token4);
                alumno.setNumCuenta(Token4);
                String token5 = tokenizador.nextToken();
                int Token5 = Integer.parseInt(token5);
                alumno.setEdad(Token5);
                String token6 = tokenizador.nextToken();
                float Token6 = Float.parseFloat(token6);
                alumno.setPromedio(Token6);  
            }

            System.out.println(alumno);
           
            br.close();
                
        }catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        
                
       
        
      
        
        
        
       
        
        
        
    }
    
}
