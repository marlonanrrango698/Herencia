/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class Docente extends PersonaPrivate{
    private int idDocente;
    private String rol;
    private String jornada;
    
    // CONSTRUCTORES
    
    public Docente (){
    }
    
    public Docente(int idDocente, String rol, String jornada) {
        this.idDocente = idDocente;
        this.rol = rol;
        this.jornada = jornada;
    }

    public Docente(int idDocente, String rol, String jornada, int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero) {
        super(idPersona, nombres, apellidos, cedula, direccion, telefono, correoElectronico, fechaNacimiento, genero);
        this.idDocente = idDocente;
        this.rol = rol;
        this.jornada = jornada;
    }
    
    public void setIdDocente(int idDocente){
        this.idDocente=idDocente;
    }
    
    public int getIdDocente(){
        return idDocente;
    }
    
    public void setRolDocente(String rol){
        this.rol=rol;
    }
    
    public String getRolDocente(){
        return rol;
    }
    
    public void setJornadaDocente(String jornada){
        this.jornada=jornada;
    }
    
    public String getJornadaDocente(){
        return jornada;
    }
}
