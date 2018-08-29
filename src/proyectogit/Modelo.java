/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import Entidades.LlamadaEntidad;
import Entidades.PersonaEntidad;
import Entidades.TelefonoEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Modelo {
    private static conexion conexion;
    private Connection con;
    
    public Modelo()
    {}
     
    
    public void insertarLlamada(LlamadaEntidad p)
{
    String sql="";
    try {
        if(p.getTipoLlamada().equals("Local"))
        {
            sql = "INSERT INTO llamada(IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Local',?)";
        }
        else if(p.getTipoLlamada().equals("Internacional"))
        {
            sql = "INSERT INTO llamada(IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Internacional',?)";  
        }
        else if(p.getTipoLlamada().equals("Celular"))
        {
            sql = "INSERT INTO llamada(IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Celular',?)";
        }
        
                con = conexion.getInstance().getConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setInt(1, p.getIDPersonaSalida());
                pstm.setInt(2, p.getIDPersonaLlegada());
                pstm.setLong(3, p.getInicioLlamada());
                pstm.setLong(4, p.getFinLlamada());
                pstm.setDouble(5, p.getCostoTotal());
                pstm.executeUpdate();
                pstm.close();

                con.commit();
                con.close();
                
    } catch (SQLException ex) {
        Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}
    
    public void insertarPersona(String email,String telefono,String esCelular)
    {
       
        try {
                String sql = "INSERT INTO persona(persona.IDPersona,persona.email)\n" +
                      "VALUES (NULL,'"+email+"')";
                con = conexion.getInstance().getConnection();
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                sql = "SELECT persona.IDPersona\n" +
                      "FROM persona\n" +
                      "WHERE persona.email=\""+email+"\"";
                ResultSet rs = st.executeQuery(sql);
                int IDPersona=0;
                while(rs.next())
                {   
                        IDPersona = rs.getInt(1);
                }
                sql = "INSERT INTO telefono(telefono.IDPersona,telefono.numeroDeTelefono,telefono.esCelular)\n" +
                      "VALUES ("+IDPersona+","+telefono+",\""+esCelular+"\")";
                st.executeUpdate(sql);
                con.commit();
                con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultTableModel selectPersonasYNumeros()
    {
        ResultSet variablex = null;
        DefaultTableModel modelo = new DefaultTableModel();
        String letras = "ID\tNOMBRE\tEDAD\tTELEFONO\n";
        try {
                    String sql = "SELECT persona.IDPersona,persona.email,telefono.numeroDeTelefono,telefono.esCelular\n" +
                        "FROM persona,telefono\n" +
                        "WHERE persona.IDPersona = telefono.IDPersona";
                   
                    con = conexion.getInstance().getConnection();
                    Statement st = con.createStatement();
                    variablex = st.executeQuery(sql);
                   
                    modelo.setColumnIdentifiers(new Object[]{"ID Persona","Email","Numero de Telefono","Es Celular?"});
                    try{
                        while(variablex.next()){
                            modelo.addRow(new Object[]{variablex.getString(1),variablex.getString(2),variablex.getString(3),variablex.getString(4)});
                        }   
                    } catch(Exception e){

                    }
                    
    
                    /*while(variablex.next())
                    {   
                        id = variablex.getInt(1);
                        nombre = variablex.getString(2);
                        edad = variablex.getInt(3);
                        telefono = variablex.getInt(4);
                        letras += id+"\t"+nombre+"\t"+edad+"\t"+telefono+"\n";
                    }*/
                    con.commit();
                    con.close();
                    
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
       return modelo;
    }
}
