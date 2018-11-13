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
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

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
    
    
    
    
    
    
    
    //relacion Alumno----usuario
    
    //@Id@OneToOne
    //@JoinColumn(name="id")
    //private Usuario usuario;

    //public Usuario getUsuario() {
      //  return usuario;
    //}

    //public void setUsuario(Usuario usuario) {
      //  this.usuario = usuario;
    //}
    
    
    
    /////////////////////////////
    
    
    //El validacion del alumno
    @Column(name = "validacion")
    private int validacion;
    

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

    public Alumno() {
    
    }

   // public Alumno(Usuario usuario, int validacion) {
     //   this.usuario = usuario;
       // this.validacion = validacion;
    //}

    //public Alumno(long idAlumno, Usuario usuario, int validacion) {
      //  this.idAlumno = idAlumno;
      //  this.usuario = usuario;
        //this.validacion = validacion;
    //}
    
    
    
    
    
    
    
    
}
