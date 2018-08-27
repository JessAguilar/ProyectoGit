/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class LlamadaEntidad {
      private int IDPersonaSalida;
    private int IDPersonaLlegada;
    private Date inicioLlamada=new Date();
    private Date finLlamada=new Date();
    private String tipoLlamada;
    private Double costoTotal;
    
    public LlamadaEntidad(int IDPersonaSalida,int IDPersonaLlegada,Date inicioLlamada,Date finLlamada,String tipoLlamada,Double costoTotal){
    this.IDPersonaSalida=IDPersonaSalida;
    this.IDPersonaLlegada=IDPersonaLlegada;
    this.inicioLlamada=inicioLlamada;
    this.finLlamada=finLlamada;
    this.tipoLlamada=tipoLlamada;
    this.costoTotal=costoTotal;    
    }

    public LlamadaEntidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the IDPersonaSalida
     */
    public int getIDPersonaSalida() {
        return IDPersonaSalida;
    }

    /**
     * @param IDPersonaSalida the IDPersonaSalida to set
     */
    public void setIDPersonaSalida(int IDPersonaSalida) {
        this.IDPersonaSalida = IDPersonaSalida;
    }

    /**
     * @return the IDPersonaLlegada
     */
    public int getIDPersonaLlegada() {
        return IDPersonaLlegada;
    }

    /**
     * @param IDPersonaLlegada the IDPersonaLlegada to set
     */
    public void setIDPersonaLlegada(int IDPersonaLlegada) {
        this.IDPersonaLlegada = IDPersonaLlegada;
    }

    /**
     * @return the inicioLlamada
     */
    public long getInicioLlamada() {
        return inicioLlamada.getTime();
    }

    /**
     * @param inicioLlamada the inicioLlamada to set
     */
    public void setInicioLlamada(Date inicioLlamada) {
        this.inicioLlamada = inicioLlamada;
    }

    /**
     * @return the finLlamada
     */
    public long getFinLlamada() {
        return finLlamada.getTime();
    }

    /**
     * @param finLlamada the finLlamada to set
     */
    public void setFinLlamada(Date finLlamada) {
        this.finLlamada = finLlamada;
    }

    /**
     * @return the tipoLlamada
     */
    public String getTipoLlamada() {
        return tipoLlamada;
    }

    /**
     * @param tipoLlamada the tipoLlamada to set
     */
    public void setTipoLlamada(String tipoLlamada) {
        this.tipoLlamada = tipoLlamada;
    }

    /**
     * @return the costoTotal
     */
    public Double getCostoTotal() {
        return costoTotal;
    }

    /**
     * @param costoTotal the costoTotal to set
     */
    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    
}
