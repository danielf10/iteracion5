/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;

import java.security.Principal;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.modelo.Clase;
import mx.unam.ciencias.is.modelo.ClaseDAO;
import mx.unam.ciencias.is.modelo.Usuario;
import mx.unam.ciencias.is.modelo.Nivel;
import mx.unam.ciencias.is.modelo.UsuarioDAO;

import mx.unam.ciencias.is.modelo.NivelDAO;

import mx.unam.ciencias.is.modelo.Materia;
import mx.unam.ciencias.is.modelo.MateriaDAO;
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
     
    @Autowired
   NivelDAO nivel_bd;
     @Autowired
   MateriaDAO materia_bd;
     
     @Autowired
    private ClaseDAO clase_bd;
    
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
    @RequestMapping(value="/materi", method = RequestMethod.GET)
    public ModelAndView materi(HttpServletRequest request,ModelMap model){
        String materia = request.getParameter("materia");
        Nivel nivel= nivel_bd.getNivel(4);
        Materia mater=new Materia(materia,nivel);
        materia_bd.guardar(mater);
        
        
        
        
        return new ModelAndView("index");
    
    }
    
    @RequestMapping(value="/peticion2", method = RequestMethod.GET)
    public ModelAndView peticion2(HttpServletRequest request,ModelMap model){
        String parametro = request.getParameter("parametro");
        System.out.println("La peticion2 es: =================>"+parametro);
        model.addAttribute("parametro", parametro);
        return new ModelAndView("index",model);
    
    }
    
    @RequestMapping(value="/consulta", method = RequestMethod.GET)
    public ModelAndView consulta(HttpServletRequest request,ModelMap model){
        List<Nivel> nv = nivel_bd.obtenerListaNivel();

      model.addAttribute("nv",nv);
        
        
        return new ModelAndView("consultaP",model);
    
    }
    @RequestMapping(value="/prueba", method = RequestMethod.GET)
    public ModelAndView prueba(HttpServletRequest request,ModelMap model){
        
        
        return new ModelAndView("prueba",model);
    
    }
    
   
    
    
    @RequestMapping(value="/verMaterias", method = RequestMethod.GET)
    public ModelAndView materias(HttpServletRequest request,ModelMap model){
        return new ModelAndView("materia",model);
    
    }
    
    
    @RequestMapping(value="/consultaMat", method = RequestMethod.GET)
    public ModelAndView p(HttpServletRequest request,ModelMap model){
        
        Long id = Long.parseLong(request.getParameter("mate"));
       System.out.println(id+"- hola");
       List<Materia> materias = materia_bd.getMateriasPorNivel(id);
        if(materias!=null){
           model.addAttribute("mat",materias);
        
        }
        
        return new ModelAndView("materias",model);
    
    
    
}
    
    
     @RequestMapping(value="/consultProf", method = RequestMethod.GET)
    public ModelAndView profe(HttpServletRequest request,ModelMap model){
        
        Long id = Long.parseLong(request.getParameter("materia"));
          
         
         List<Clase> clases = clase_bd.getClasesPorMateria(id);
       
        if(clases!=null){
           model.addAttribute("cl",clases);
           
        }
        
          
           model.addAttribute("materia",id);
        
        return new ModelAndView("verProf");
    
    
    
}
    
    
    
    
}
