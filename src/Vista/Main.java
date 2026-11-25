/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.PersonaPrivate;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        // CREAR OBJETOS
        Persona p1 = new Persona(001, "Marlon Alexis", "Anrrango Cuaspud", "1005444698", "Ibarra", "0978861713", "marlon@gmail.com", "06/08/2003", "Masculino");

        //p1.imprimir();
        //p1.validarCedula();
        System.out.println("------------\n" + p1.toString());

        // OBJETO PERSONAPRIVATE
        //PersonaPrivate pp = new PersonaPrivate();
        //pp.setNombrePersona("Marlon");
        //pp.imprimir();
        //Estudiante e=new Estudiante();
        //e.setApellidosPersona("Anrrango");
        //e.imprimir();
        // TAREA 5 OBJETOS DE LA CLASE ESTUDIANTE Y 5 OBJETOS DE LA CLASE DOCENTE
        // ESTUDIANTE
        Estudiante e1 = new Estudiante(002, "Desarrollo Software", 2, "DSW001", 002, "Mateo Sebastian", "Garcia Rodriguez", "1005444691", "Ibarra", "0978861711", "sebas@gmail.com", "01/05/2002", "Masculino");
        Estudiante e2 = new Estudiante(003, "Procesamiento Alimentos", 1, "PA001", 003, "Sofia Valentina", "Martinez Lopez", "1005444692", "Urcuqui", "0978861712", "sofia@gmail.com", "24/11/200", "Femenino");
        Estudiante e3 = new Estudiante(004, "Mecanica Industrial", 4, "MI001", 004, "Santiago Alejandro", "Gonzalez Perez", "1005444693", "Atuntaqui", "0978861713", "santi@gmail.com", "16/06/2004", "Masculino");
        Estudiante e4 = new Estudiante(005, "Quimica", 3, "Q001", 005, "Camila Vleria", "Sanches Ramirez", "1005444694", "Ibarra", "0978861714", "cami@gmail.com", "22/03/2004", "Femenino");
        Estudiante e5 = new Estudiante(006, "Desarrollo Software", 4, "DSW002", 006, "Nicolas Gabriel", "Torres Flores", "1005444695", "Otavalo", "0978861715", "gab@gmail.com", "06/09/1999", "Masculino");

        // DOCENTE
        Docente d1 = new Docente(7, "Tutor", "Matutina", 7, "Luciana Martina", "Rivera Gomez", "1005444696", "Ibarra", "0978861716", "luci@gmail.com", "26/07/1980", "Femenino");
        Docente d2 = new Docente(8, "Coordinador de Carrera", "Vespertina", 8, "Diego Daniel", "Diaz Cruz", "1005444697", "Urcucqui", "0978861717", "diego@gmail.com", "04/09/1982", "Masculino");
        Docente d3 = new Docente(9, "Docente", "Nocturna", 9, "Mariana Isabella", "Morales Reyes", "1005444699", "Ibarra", "0978861755", "mariana@gmail.com", "06/12/1985", "Femenino");
        Docente d4 = new Docente(10, "Secretaria", "Vespertina", 10, "Andres Samuel", "Gutierrez Ortiz", "100544685", "Urcuqui", "0987645349", "andres@gmail.com", "06/06/1979", "Masculino");
        Docente d5= new Docente(11, "Rector", "Matutina", 11, "Gabriela Elena", "Chavez Mendoza", "1005446894", "Ibarra", "0943156752", "gabriela@gmail.com", "15/01/1995", "Femenino");
    }
    


            
}
