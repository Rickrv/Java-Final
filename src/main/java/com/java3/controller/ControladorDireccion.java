/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java3.controller;

import com.java3.model.DAODireccionImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ControladorDireccion {
    
   @RequestMapping(value="/direccion", method=RequestMethod.GET, headers={"Accept=Applicaction/json"})
    public @ResponseBody String todos()throws Exception{
      DAODireccionImpl di=new DAODireccionImpl();
     
return di.obtenerTodos();
    }
    
}
