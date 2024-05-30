/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Usuario {
    //publicos = public: acceso libre
    //privados = private: solo para los miembros de la clase 
    //protegidos = protected: si es una sub clase puede acceder a los datos 
    //variables globales
     private   String nombre;
     private   String apellido;
     private   char inicial;
     private   String direccion;
     private   String correoElectronico;
     
     //llenar o inicializar los datos se llama constructores 
     //Metodo vacio o con argumentos 

    public Usuario() {
    }
     //variables locales solo sirve para utilizar solo en ese metodo 
    public Usuario(String nombre, String apellido, char inicial, String direccion, String correoElectronico) {
        //this es un pntero que copia el valor de la variable donde esta apuntando y sobrescribir lo que esta asiendoe el usuario
        //sobrecarga es una tecnica que premite dos o mas metedos con diferente implementacion
        this.nombre = nombre;
        this.apellido = apellido;
        this.inicial = inicial;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }
     
     
    
    
}
