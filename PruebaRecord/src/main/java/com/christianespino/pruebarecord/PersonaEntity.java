
package com.christianespino.pruebarecord;

import java.time.LocalDate;

/**
 *
 * @author chris
 */
public class PersonaEntity {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String genero;
    private String estadoCivil;
    private LocalDate fechaNacimiento;

    public PersonaEntity() {
    }

    public PersonaEntity(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String genero, String estadoCivil, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }   

    @Override
    public String toString() {
        return "PersonaEntity{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    

    
    
    
    
}
