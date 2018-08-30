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
public class TelefonoEntidad {
    private int IDPersona;
    private int numeroDeTelefono;
    private String esCelular;
    
    public TelefonoEntidad(int IDPersona,int numeroDeTelefono,String esCelular){
        this.IDPersona=IDPersona;
        this.numeroDeTelefono=numeroDeTelefono;
        this.esCelular=esCelular;
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
     * @return the numeroDeTelefono
     */
    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    /**
     * @param numeroDeTelefono the numeroDeTelefono to set
     */
    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    /**
     * @return the esCelular
     */
    public String getEsCelular() {
        return esCelular;
    }

    /**
     * @param esCelular the esCelular to set
     */
    public void setEsCelular(String esCelular) {
        this.esCelular = esCelular;
    }
}
