/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.modelo.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author jonh
 */
@Controller 
public class ControladorUsuario {
    
    //Instancia para operaciones con la base relacionadas con el cliente
    @Autowired
    private UsuarioDAO usuario_bd;

    
    @RequestMapping(value="/guardaUsuario", method = RequestMethod.GET)
    public ModelAndView guardaUsuario(HttpServletRequest request,ModelMap model){
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        
        Usuario nuevo = new Usuario(nombre,correo,contrasenia);
        usuario_bd.guardar(nuevo);
        model.addAttribute("parametro","ME Guarde: "+nombre);
        return new ModelAndView("index",model);
    
    }
    
}