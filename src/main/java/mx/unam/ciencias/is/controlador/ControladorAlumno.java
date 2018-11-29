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
import mx.unam.ciencias.is.modelo.Alumno;
import mx.unam.ciencias.is.modelo.AlumnoDAO;
import mx.unam.ciencias.is.modelo.Materia;
import mx.unam.ciencias.is.modelo.MateriaDAO;
import mx.unam.ciencias.is.modelo.PedirClase;
import mx.unam.ciencias.is.modelo.PedirClaseDAO;

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
public class ControladorAlumno {
 @Autowired
    private UsuarioDAO usuario_bd;
 
 @Autowired
    private NivelDAO nivel_bd;
    
    @Autowired
    private MateriaDAO materia_bd;
    @Autowired
    private ProfesorDAO profesor_bd;
    
    @Autowired
    private ClaseDAO clase_bd;
    
   @Autowired
private AlumnoDAO alumno_bd;
   
    @Autowired
    private PedirClaseDAO pc_bd;
    
   
   
   @RequestMapping(value="/alum/inicioAl/verClases", method = RequestMethod.GET)
    public ModelAndView verClas(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correoUs");
        
         List<Nivel> nv = nivel_bd.obtenerListaNivel();
         
        model.addAttribute("correo",correo); 
        model.addAttribute("nv",nv);
        
        
        return new ModelAndView("verNivel_alum",model);
    
    }
    
    @RequestMapping(value="/alum/inicioAl/verPC", method = RequestMethod.GET)
    public ModelAndView verPC(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correoUs");
         Usuario us=usuario_bd.getUsuario(correo);
        
         List<PedirClase> pc = pc_bd.getPedirClasesPorAlumno(us.getIdPersona());
         
        model.addAttribute("correo",correo); 
        model.addAttribute("p",pc);
        
        
        return new ModelAndView("verNivel_alum",model);
    
    }
    
    
    
     @RequestMapping(value="/alum/inicioAl/verClases/consultaMat_alum", method = RequestMethod.GET)
    public ModelAndView verM(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correo");
         Long id = Long.parseLong(request.getParameter("mate"));
          List<Materia> materias = materia_bd.getMateriasPorNivel(id);
        if(materias!=null){
           model.addAttribute("mat",materias);
           
        }
           model.addAttribute("correo",correo);
        
        
        
        return new ModelAndView("verMate_alum",model);
    
    }
    
    
    @RequestMapping(value="/alum/inicioAl/verClases/consultaMat_alum/consultProf_alum", method = RequestMethod.GET)
    public ModelAndView verProfe(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correo");
         Long id = Long.parseLong(request.getParameter("materia"));
          
         
         List<Clase> clases = clase_bd.getClasesPorMateria(id);
       
        if(clases!=null){
           model.addAttribute("cl",clases);
           
        }
        
           model.addAttribute("correo",correo);
           model.addAttribute("materia",id);
        
        
        
        return new ModelAndView("verProf_alum",model);
    
    }
    
    
    
     @RequestMapping(value="/alum/inicioAl/verClases/consultaMat_alum/verProf_alum/pedirClass", method = RequestMethod.GET)
    public ModelAndView perdirClase(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correo");
         Long id = Long.parseLong(request.getParameter("materia"));
          
        Usuario us=usuario_bd.getUsuario(correo);
        Alumno alumno=alumno_bd.getAlumno(us.getIdPersona());
        
        Clase clase=clase_bd.getClaseM(id);
        
        PedirClase pcl=new PedirClase(0,alumno,clase);
        pc_bd.guardar(pcl);
        
        
       
        
        
        model.addAttribute("correo",correo);
        
        
        
        return new ModelAndView("sessionAl",model);
    
    }
    
    
    
    
    
}
