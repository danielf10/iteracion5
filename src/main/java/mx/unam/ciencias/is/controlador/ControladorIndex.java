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
 * @author daniel
 */
@Controller 
public class ControladorIndex {
    
    @Autowired
    private UsuarioDAO usuario_bd;
    
     /**
      * Metodo que responde a la peticion raiz
      * @return el nombre del jsp de inicio
      */
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request,ModelMap model,Principal principal){
        if(principal!=null){
            Usuario u = usuario_bd.getUsuario(principal.getName());
            model.addAttribute("usuario", u);
            
        }
        if(request.getParameter("login_error")!=null)
            model.addAttribute("parametro","Error al hacer login");
        return new ModelAndView("index",model);
    
    }
    @RequestMapping(value="/peticion1", method = RequestMethod.GET)
    public void peticion1(HttpServletRequest request){
        String parametro = request.getParameter("parametro");
        System.out.println("La peticion1 es: =================>"+parametro);
    
    }
    
    @RequestMapping(value="/peticion2", method = RequestMethod.GET)
    public ModelAndView peticion2(HttpServletRequest request,ModelMap model){
        String parametro = request.getParameter("parametro");
        System.out.println("La peticion2 es: =================>"+parametro);
        model.addAttribute("parametro", parametro);
        return new ModelAndView("index",model);
    
    }
    
    @RequestMapping(value="/peticion3", method = RequestMethod.GET)
    public ModelAndView peticion3(HttpServletRequest request,ModelMap model){
        String parametro = request.getParameter("param");
        System.out.println("La peticion3 es: =================>"+parametro);
        model.addAttribute("parametro", parametro);
        return new ModelAndView("index",model);
    
    }
}
