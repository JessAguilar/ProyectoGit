/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Administrador
 */
public class PersonaEntidad {
    private int IDPersona;
    private String email;
    
    public PersonaEntidad(int IDPersona,String email){
        this.IDPersona=IDPersona;
        this.email=email;
    }

    /**
     * @return the IDPersona
     */
    public int getIDPersona() {
        return IDPersona;
    }

    /**
     * @param IDPersona the IDPersona to set
     */
    public void setIDPersona(int IDPersona) {
        this.IDPersona = IDPersona;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
