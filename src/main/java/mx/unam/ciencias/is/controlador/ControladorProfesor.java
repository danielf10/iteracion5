/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.modelo.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Daniel
 */
@Controller 
public class ControladorProfesor {
    @Autowired
    private UsuarioDAO usuario_bd;
    @Autowired
    private UsuarioDAO use_bd;
    
    
     @RequestMapping(value="/prof/crearSes", method = RequestMethod.GET)
    public ModelAndView materias(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correoUs");
        model.addAttribute("correo",correo);
        
        return new ModelAndView("crear_asesoria",model);
    
    }
    
    
    
     @RequestMapping(value="/prof/crear", method = RequestMethod.GET)
    public ModelAndView crear(HttpServletRequest request,ModelMap model){
        String nivel=request.getParameter("nivel");
        String correo=request.getParameter("correoUs");
        String materia=request.getParameter("materia");
        String costo=request.getParameter("costo");
        
        
        return new ModelAndView("crear_asesoria",model);
    
    }
    
}
