/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java3.controller;


import com.java3.model.DAOUsuarioImpl;
import com.java3.model.Direccion;
import com.java3.model.ProbarUsuariosDirecciones;
import com.java3.model.Usuario;
import com.java3.controller.GenerarUsuarios;
import java.util.List;


import org.codehaus.jackson.map.ObjectMapper;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller

@RequestMapping("/")
public class ControladorHola {

    
    
    @RequestMapping(value="/gatito", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String hola()throws Exception{
    
        return GenerarUsuarios.obtenerUsuario();
    }
    
    
    
   
    
}
