/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;
import Entidades.PersonaEntidad;
import java.util.Date;
/**
 *
 * @author Administrador
 */
public class ProyectoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Modelo m = new Modelo();
        PersonaEntidad p = new PersonaEntidad(0, "hola@bola.com");
        PersonaEntidad p2 = new PersonaEntidad(1, "pepe@bola.com");
        Date d = new Date();
        System.out.println(d.getTime());
    }
    
}
