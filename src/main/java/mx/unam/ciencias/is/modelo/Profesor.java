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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author Daniel
 */

@Entity
@Table(name="profesor")
public class Profesor implements Serializable {
    
    
    
    
   //cvs del profesor
    @Column(name = "cvs")
    private String cvs;
    
    //El validacion del profesor
    @Column(name = "validacion")
    private int validacion;
    
    
    
    //relacion profesor----usuario
     @Id@OneToOne
    @JoinColumn(name="id")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
    
    
    

    

    public String getCvs() {
        return cvs;
    }

    public void setCvs(String cvs) {
        this.cvs = cvs;
    }

    public int getValidacion() {
        return validacion;
    }

    public void setValidacion(int validacion) {
        this.validacion = validacion;
    }

    public Profesor() {
    }

    
    
    
   
    
    public Profesor(String cvs, int validacion, Usuario usuario) {
        this.cvs = cvs;
        this.validacion = validacion;
        this.usuario = usuario;
    }
    
    
    
    
    
    
}
