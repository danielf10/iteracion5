/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.controlador;


import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import mx.unam.ciencias.is.modelo.Alumno;
import mx.unam.ciencias.is.modelo.AlumnoDAO;
import mx.unam.ciencias.is.modelo.Usuario;
import mx.unam.ciencias.is.modelo.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Daniel
 */
@Controller 
public class ControladorAlumno {
 @Autowired
    private UsuarioDAO usuario_bd;
    
  //  @Autowired
//private AlumnoDAO alumno_bd;
    
    
    
    
    
    
    
}
