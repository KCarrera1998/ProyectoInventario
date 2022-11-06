/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyectoinventario;

/**
 *
 * @author alumno
 */

import java.sql.*;

public class ConectarMYSQL {
    
    public ConectarMYSQL(){
        
    }
    
    public String EjecutarComando (String textoSQL)
    {
    try
    {
        DriverManager.registerDriver (new com.mysql.jdbc.Driver ());
        Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/alumno/","root","Umg$2019");
        Statement s = conexion.createStatement ();
        
        s.executeUpdate(textoSQL);
    }
    catch(Exception e)
    {
        e.printStackTrace();
        return "Operacion No Exitosa";
    }
    return "Operacion Exitosa";
    }
    public void mostrar(){
        
        }
    public void cerrar(){
        
    }
    
}
