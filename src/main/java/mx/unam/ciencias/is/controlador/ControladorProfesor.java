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
import mx.unam.ciencias.is.modelo.Nivel;
import mx.unam.ciencias.is.modelo.NivelDAO;
import mx.unam.ciencias.is.modelo.Materia;
import mx.unam.ciencias.is.modelo.MateriaDAO;
import mx.unam.ciencias.is.modelo.Profesor;
import mx.unam.ciencias.is.modelo.ProfesorDAO;
import mx.unam.ciencias.is.modelo.Clase;
import mx.unam.ciencias.is.modelo.ClaseDAO;




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
    
    @Autowired
    private NivelDAO nivel_bd;
    
    @Autowired
    private MateriaDAO materia_bd;
    @Autowired
    private ProfesorDAO profesor_bd;
    
    @Autowired
    private ClaseDAO clase_bd;
    
    
    
     @RequestMapping(value="/prof/crearSes", method = RequestMethod.GET)
    public ModelAndView materias(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correoUs");
        model.addAttribute("correo",correo);
        
        
        return new ModelAndView("crear_asesoria",model);
    
    }
    
    
    
     @RequestMapping(value="/prof/crearSes/crear", method = RequestMethod.GET)
    public ModelAndView crear(HttpServletRequest request,ModelMap model){
        Long id = Long.parseLong(request.getParameter("materia"));
         String correo=request.getParameter("correoP");
        Long costo=Long.parseLong(request.getParameter("costo"));
        System.out.println("////////////////////crear materia ////////////////////////");
        System.out.println(id+" - hola");
         System.out.println(correo+" - hola2");
        System.out.println(costo+" - hola3");
        System.out.println("////////////////////fin////////////////////////");
      
        
       // Materia ma = materia_bd.getMateria;
        Materia ma = materia_bd.getMat(id);
        
        System.out.println("/sasa///////////////////algo de la materia////////////////////////");
        System.out.println(ma.getIdmateria()+" "+ma.getNombre() +"materia su id no esta vacio ");
        
         Usuario u = usuario_bd.getUsuario(correo);
         
         Profesor prof=profesor_bd.getProfesor(u.getIdPersona());
         
         
         
         Clase c = new Clase(costo,ma,prof);
        
        clase_bd.guardar(c);
         
         model.addAttribute("mat",costo);
        
         
         
         
         
        return new ModelAndView("sessionP",model);
    
    }
    
     @RequestMapping(value="/prof/crearSes/verMat", method = RequestMethod.GET)
    public ModelAndView ver(HttpServletRequest request,ModelMap model){
        
        Long id = Long.parseLong(request.getParameter("nivel"));
        String correo=request.getParameter("correoU");
        System.out.println("////////////////////ver materia////////////////////////");
        System.out.println(id+"- hola");
        System.out.println(correo+"- hola2");
        
        
        System.out.println("//////////////////// fin ver materia////////////////////////");
        List<Materia> materias = materia_bd.getMateriasPorNivel(id);
       // if(materias!=null){
            model.addAttribute("mat",materias);
           
            model.addAttribute("correo",correo);
        
        //}
        
        return new ModelAndView("crear_asesoria",model);
    
    }
    
    
    
    
    
    
}
