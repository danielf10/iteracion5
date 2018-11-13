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
import mx.unam.ciencias.is.modelo.Alumno;
import mx.unam.ciencias.is.modelo.AlumnoDAO;
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
    //@Autowired
    //private AlumnoDAO alumno_bd;

    
    @RequestMapping(value="/guardaUsuario", method = RequestMethod.POST)
    public ModelAndView guardaUsuario(HttpServletRequest request,ModelMap model){
        String usuario = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String contrasenia2 = request.getParameter("contrasenia2");
        if(contrasenia.equals(contrasenia2)){
           
            
        
        
        String rol = request.getParameter("rol");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hash_password = passwordEncoder.encode(contrasenia) ;
        
        Usuario nuevo = new Usuario(usuario,correo,hash_password,rol);
        usuario_bd.guardar(nuevo);
        model.addAttribute("parametro",usuario);
        return new ModelAndView("guardarPerf",model);
        }
        return new ModelAndView("index");
    }
    
    @RequestMapping(value="/Gperfil", method = RequestMethod.POST)
    public ModelAndView guardaPerfil(HttpServletRequest request,ModelMap model){
        String usuario = request.getParameter("usuario");
        String nombre = request.getParameter("nombre");
        String app = request.getParameter("app");
        String apm = request.getParameter("apm");
        String telefono = request.getParameter("telefono");
        String rol = request.getParameter("rol");
        
        Usuario u = usuario_bd.getUsuario_user(usuario);
        
        u.setNombre(nombre);
        u.setApp(app);
        u.setApm(apm);
        u.setTelefono(telefono);
        u.setRol(rol);
        
        //falta capturar el id del usuario que es alumno 
        usuario_bd.actUser(u);
        //Usuario us=usuario_bd.getUsuario(3);
        
       // if(rol.equals("ROLE_Alumno")){
          //  Alumno a=new Alumno();
            //alumno_bd.guardar(a);
            
            
            
        //}
         
        return new ModelAndView("index",model);
    
    }
    
    
    @RequestMapping(value="/admin/verDenunciados", method = RequestMethod.GET)
    public ModelAndView verDenunciados(HttpServletRequest request,ModelMap model ){
        
     //public ModelAndView puestoLista(ModelMap model,HttpServletRequest request) {
      List<Usuario> ps = use_bd.obtenerListaUsuario();

      model.addAttribute("ps",ps);
        return new ModelAndView("admin_denunciados",model);
    }
    
   
     
    
    
}
