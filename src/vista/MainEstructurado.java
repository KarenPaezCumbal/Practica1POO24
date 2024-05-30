/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author LENOVO
 */
public class MainEstructurado {
    //metodo traductor o interprete
    
    public static void main(String[] args) {
        
        //declaracion de lista
        String[] listaDatos=new String[5];
        
        //Variables 
        System.out.println("Datos personales: ");
        String nombre="Karen";
        String apellido="Paez";
        char inicial='A';
        String direccion="Ibarra";
        String correoElectronico="karen@gmail.com";
        //poner el nombre de la lista para guardar cada dato tiene que ser del mismo objeto osea del mismo String
        listaDatos[0]=nombre;
        listaDatos[1]=apellido;
        listaDatos[2]=direccion;
        listaDatos[3]=correoElectronico;
        //para imprimir el primer usuario 
        System.out.println(""+nombre);
        
         System.out.println("Datos personales: ");
        String nombre1="Karen";
        String apellido1="Paez";
        char inicial1='A';
        String direccion1="Ibarra";
        String correoElectronico1="karen@gmail.com";
    }
}
