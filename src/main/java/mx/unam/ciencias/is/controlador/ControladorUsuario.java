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
public class ControladorUsuario {
    
    //Instancia para operaciones con la base relacionadas con el cliente
    @Autowired
    private UsuarioDAO usuario_bd;
    @Autowired
    private UsuarioDAO use_bd;

    
    @RequestMapping(value="/guardaUsuario", method = RequestMethod.POST)
    public ModelAndView guardaUsuario(HttpServletRequest request,ModelMap model){
        String usuario = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hash_password = passwordEncoder.encode(contrasenia) ;
        
        Usuario nuevo = new Usuario(usuario,correo,hash_password,rol);
        usuario_bd.guardar(nuevo);
        model.addAttribute("parametro","ME Guarde: "+usuario);
        return new ModelAndView("guardarPerf",model);
    
    }
    
    @RequestMapping(value="/admin/verDenunciados", method = RequestMethod.GET)
    public ModelAndView verDenunciados(HttpServletRequest request,ModelMap model ){
        
     //public ModelAndView puestoLista(ModelMap model,HttpServletRequest request) {
      List<Usuario> ps = use_bd.obtenerListaUsuario();

      model.addAttribute("ps",ps);
        return new ModelAndView("admin_denunciados",model);
    }
    
   
     
    
    
}
