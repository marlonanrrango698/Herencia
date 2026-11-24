/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.PersonaPrivate;

/**
 *
 * @author User
 */
public class Main {
    public static void  main(String[] args){
        // CREAR OBJETOS
        Persona p1=new Persona(001, "Marlon Alexis", "Anrrango Cuaspud", "1005444698", "Ibarra", "0978861713", "marlon@gmail.com", "06/08/2003", "Masculino");
    
    p1.imprimir();
    p1.validarCedula();
    System.out.println("------------\n"+p1.toString());
    
        // OBJETO PERSONAPRIVATE
    PersonaPrivate pp = new PersonaPrivate();
    pp.setNombrePersona("Marlon");
    pp.imprimir();
    Estudiante e=new Estudiante();
    e.setApellidosPersona("Anrrango");
    e.imprimir();
    
    }
    


            
}
