/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.christianespino.pruebarecord;

/**
 *
 * @author chris
 */
public record PersonaDTO(
        int id,
        String nombre,
        String paterno,
        String materno,
        int edad,
        String sexo,
        String fechaNacimiento
        ) {
    
    //Variable
    static int numeroPersona;
    
    
    //Constructor compacto
    public PersonaDTO{
        System.out.println("Hola! "+nombre);
        
        if(id < 1){
            throw new IllegalArgumentException("El ID de la persona debe ser mayor a cero");
        }
        
        if(nombre.length() <= 3){
            throw new IllegalArgumentException("El nombre debe contener más de 3 caracteres");
        }
        
    }
    
    //Metodo
    public int generarNumeroPersona(){
        return ++numeroPersona;
    }
    
    //Constructor
    public PersonaDTO(int id, String nombre){
        this(id,nombre,null,null,0,null,null);
    }
    
    

}
