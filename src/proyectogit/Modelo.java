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

/**
 *
 * @author Administrador
 */
public class Modelo {
    private static conexion conexion;
    private Connection con;
    
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
        String sql="";
        int IDPersona = 0;
        try {
                sql = "INSERT INTO persona(persona.IDPersona,persona.email)\n" +
                      "VALUES (NULL,\""+email+"\")";
                con = conexion.getInstance().getConnection();
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                sql = "SELECT persona.IDPersona\n" +
                      "FROM persona\n" +
                      "WHERE persona.email=\""+email+"\"";
                ResultSet rs = st.executeQuery(sql);
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
}
