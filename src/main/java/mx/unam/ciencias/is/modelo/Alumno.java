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

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Daniel
 */

@Entity
@Table(name="alumno")
public class Alumno implements Serializable {
     
   
   
    
    //El validacion del alumno
    @Column(name = "validacion")
    private int validacion;
    
    
 //relacion Alumno----usuario
     @Id@OneToOne
    @JoinColumn(name="id")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


@OneToMany(mappedBy = "alumno")
    private Set<PedirClase> PerdirClases;

    public Set<PedirClase> getPerdirClases() {
        return PerdirClases;
    }

    public void setPerdirClases(Set<PedirClase> PerdirClases) {
        this.PerdirClases = PerdirClases;
    }






     
    
   
    

    

    public int getValidacion() {
        return validacion;
    }

    public void setValidacion(int validacion) {
        this.validacion = validacion;
    }

    public Alumno() {
    
    }
    
    public Alumno(Usuario usuario)
    {
    this.usuario = usuario;
    }

    

   public Alumno(int validacion,Usuario usuario) {
        
        this.validacion = validacion;
        this.usuario = usuario;
    }
    
    
    
    
    
    
    
    
}
