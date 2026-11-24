/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class Estudiante extends PersonaPrivate{
    private int idEstudiante;
    private String carrera;
    private int nivel;
    private String numeroMatricula;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String carrera, int nivel, String numeroMatricula) {
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.nivel = nivel;
        this.numeroMatricula = numeroMatricula;
    }

    // INICIALICE MIS ATRIBUTOS PROPIOS MAS LOS ATRIBUTOS DE MI PAPÁ (PALABRA SUPER)
    // CONSTRUCTO NUEVO INICIALICE ATRIBUTOS PADRE SUPERCLASE + MIS ATRIBUTOS PROPIOS
    public Estudiante(int idEstudiante, String carrera, int nivel, String numeroMatricula, int idPersona, String nombres, String apellidos, String cedula, String direccion, String telefono, String correoElectronico, String fechaNacimiento, String genero) {
        super(idPersona, nombres, apellidos, cedula, direccion, telefono, correoElectronico, fechaNacimiento, genero);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.nivel = nivel;
        this.numeroMatricula = numeroMatricula;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", carrera=" + carrera + ", nivel=" + nivel + ", numeroMatricula=" + numeroMatricula + '}';
    }
    
    // METODO DE LOGICA DE NEGOCIO
    
    
    
    
}
