/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.modelo.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jonh
 */
@Controller
public class ControladorSesion {
    
    @Autowired
    private UsuarioDAO usuario_bd;
    
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request,Principal principal){
       
        if(request.isUserInRole("ROLE_Usuario")){
            return "redirect:/sesion/inicioU";
            
        }
        if(request.isUserInRole("ROLE_Admin")){
            return "redirect:/admin/inicioA";
        }
        if(request.isUserInRole("ROLE_Root")){
            return "redirect:/root/inicioR";
        }
        return "index";
    }
    
    @RequestMapping(value="/sesion/inicioU")
    public ModelAndView inicioU(HttpServletRequest request,ModelMap model ,Principal principal){
        
        Usuario u = usuario_bd.getUsuario(principal.getName());
        model.addAttribute("usuario", u);
        return new ModelAndView("perfil",model);
    }


    @RequestMapping(value="/admin/inicioA")
    public ModelAndView inicioA(HttpServletRequest request,ModelMap model ,Principal principal){
        
        Usuario u = usuario_bd.getUsuario(principal.getName());
        model.addAttribute("usuario", u);
        return new ModelAndView("perfilAdmin",model);
    }
    
    @RequestMapping(value="/root/inicioR")
    public ModelAndView inicioR(HttpServletRequest request,ModelMap model ,Principal principal){
        
        Usuario u = usuario_bd.getUsuario(principal.getName());
        model.addAttribute("usuario", u);
        
        return new ModelAndView("perfil",model);
    }
    
    
}