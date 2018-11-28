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
    
   
   
   @RequestMapping(value="/alum/inicioAl/verClases", method = RequestMethod.GET)
    public ModelAndView verClas(HttpServletRequest request,ModelMap model){
        String correo=request.getParameter("correoUs");
        
         List<Nivel> nv = nivel_bd.obtenerListaNivel();
         
        model.addAttribute("correo",correo); 
        model.addAttribute("nv",nv);
        
        
        return new ModelAndView("verClase_alum",model);
    
    }
    
    
    
    
    
    
}
