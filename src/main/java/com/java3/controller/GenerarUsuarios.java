
package com.java3.controller;

import com.java3.model.DAOUsuarioImpl;
import com.java3.model.Usuario;
import java.util.ArrayList;


public class GenerarUsuarios {
    public static String obtenerUsuario()throws Exception{
        DAOUsuarioImpl du=new DAOUsuarioImpl();
        
   
        return du.obtenerTodos() ;
        
    }
}
