/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christianespino.pruebarecord;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author chris
 */
public class Main {
    
    public static void main(String[] args) {
       
        //Imagina una respuesta de la consulta de 
        //Select * from persona where id = 1
        PersonaEntity personaRegistrada = new PersonaEntity();
        
        personaRegistrada.setId(1);
        personaRegistrada.setNombre("Carlos");   
        personaRegistrada.setApellidoPaterno("Mora");
        personaRegistrada.setApellidoMaterno("Guitierrez");        
        personaRegistrada.setEdad(17);
        personaRegistrada.setEstadoCivil("Soltero");
        personaRegistrada.setGenero("Masculino");
        personaRegistrada.setFechaNacimiento(LocalDate.of(1993, Month.MARCH, 28));
        
        enviarInformacion(personaRegistrada);
        
    }
    
    //Creando el metodo que representa el envío de la información
    public static void enviarInformacion(PersonaEntity persona){ 
        
        PersonaDTO datos = new PersonaDTO(
                persona.getId(),
                persona.getNombre(),
                persona.getApellidoPaterno(),
                persona.getApellidoMaterno(),
                persona.getEdad(),
                persona.getGenero(),
                persona.getFechaNacimiento().toString());
        
        System.out.println("toString "+datos.toString());
        System.out.println("Nombre "+datos.nombre());
        System.out.println("Numero de Persona "+datos.generarNumeroPersona());
        
        PersonaDTO datos2 = new PersonaDTO(2, "Christian");
        System.out.println("toString datos2 "+datos2.toString());
        System.out.println("Metodo hashCode "+datos.hashCode());
        
    }
    
    
    
}
