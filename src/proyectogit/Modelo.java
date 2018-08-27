/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava2;

import Entidades.LlamadaEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            sql = "INSERT INTO (IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Local',?,)";
        }
        else if(p.getTipoLlamada().equals("Internacional"))
        {
            sql = "INSERT INTO (IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Internacional',?,)";  
        }
        else if(p.getTipoLlamada().equals("Celular"))
        {
            sql = "INSERT INTO (IDPersonaSalida, IDPersonaLlegada, inicioLlamada,finLlamada,tipoLlamada,costoTotal)\n"
                    + "VALUES (?,?,?,?,'Celular',?,)";
        }
        
                con = conexion.getInstance().getConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setInt(1, p.getIDPersonaSalida());
                pstm.setInt(2, p.getIDPersonaLlegada());
                pstm.setString(3, p.getInicioLlamada().toString());
                pstm.setString(4, p.getFinLlamada().toString());
                pstm.setDouble(5, p.getCostoTotal());
                pstm.executeUpdate();
                pstm.close();

                con.commit();
                con.close();
                
    } catch (SQLException ex) {
        Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}
}
