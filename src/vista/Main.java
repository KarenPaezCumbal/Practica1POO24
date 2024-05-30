/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //declarar la lista
        Usuario[] listaUsuarios=new Usuario[10];
        
        int n=0;
        
        Scanner es=new Scanner(System.in);
        Usuario objeto0=new Usuario();
        
        Usuario objeto1=new Usuario("Karen", "Cumbal", 'K', "Ibarra", "K@gmail.com");
        Usuario objeto2=new Usuario("Andrea", "Paez", 'A', "Ibarra", "A@gmail.com");
        Usuario objeto3=new Usuario("Sebastian", "Cadena", 'S', "Quito", "S@gmail.com");
        Usuario objeto4=new Usuario("Jonathan", "Rosero", 'J', "Guayaquil", "J@gmail.com");
        Usuario objeto5=new Usuario("David", "Pabon", 'D', "Quito", "d@gmail.com");
        
        
        
        for (int i = 0; i < listaUsuarios.length; i++) {
            Usuario objeto=new Usuario(es.next(), es.next(),es.next().charAt(0) , es.next(), es.next());
            listaUsuarios[i] = objeto0;
            System.out.println(objeto.imprimir());
            String resultado=objeto.imprimir();
            System.out.println("------Resultado-------"+resultado);
            
        }
        
        }
            
        
    }

