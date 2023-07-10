/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Matt
 */
public class Conexion {
    Connection conex;
    /* Creamos el método para conectarnos a la base de datos. Este método
    devolverá un objeto de tipo Connection.*/
    
    public Connection ConexionBD() {
        /*Declaramos una variable para almacenar la cadena de conexión.
        Primero la iniciamos en null.*/
        

        //Controlamos la excepciones que puedan surgir al conectarnos a la BBDD
        try {
            //Registrar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos una conexión a la Base de Datos
            conex = DriverManager.getConnection("jdbc:mysql://localhost/sistema_facturacion", "root", "");
            
            
            // Si hay errores informamos al usuario. 
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos.\n"
                    + e.getMessage());
        }
        // Devolvemos la conexión.
        return conex;
    }
    
}
