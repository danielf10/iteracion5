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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author Daniel
 */
@Entity
@Table(name="pedir_clase")
public class PedirClase implements Serializable{
    
     @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    //id del la materia 
    private long idPedirClase;
     
      //El nombre del la materia
    @Column(name = "aceptar")
    private long  aceptar;
    
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalumno")
    private Alumno alumno;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "idclase")
    private Clase clase;

    public long getIdPedirClase() {
        return idPedirClase;
    }

    public void setIdPedirClase(long idPedirClase) {
        this.idPedirClase = idPedirClase;
    }

    public long getAceptar() {
        return aceptar;
    }

    public void setAceptar(long aceptar) {
        this.aceptar = aceptar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public PedirClase() {
    }

    
    
    public PedirClase(long idPedirClase, long aceptar, Alumno alumno, Clase clase) {
        this.idPedirClase = idPedirClase;
        this.aceptar = aceptar;
        this.alumno = alumno;
        this.clase = clase;
    }

    public PedirClase(long aceptar, Alumno alumno, Clase clase) {
        this.aceptar = aceptar;
        this.alumno = alumno;
        this.clase = clase;
    }
     
    
    
     
     
     
     
     
    
}
