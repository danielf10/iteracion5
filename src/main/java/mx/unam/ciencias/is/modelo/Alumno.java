/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import java.util.List;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Daniel
 */

@Entity
@Table(name="alumno")
public class Alumno implements Serializable {
     
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    
     private long idAlumno;
    
    //El validacion del alumno
    @Column(name = "validacion")
    private int validacion;
    
    
     //El validacion del alumno
    @Column(name = "idUsuario")
    private int idUsuario;
    
    
    

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getValidacion() {
        return validacion;
    }

    public void setValidacion(int validacion) {
        this.validacion = validacion;
    }
    
    
    
    
    
}
