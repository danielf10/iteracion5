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
/**
 *
 * @author Daniel
 */
@Entity
@Table(name="clase")
public class Clase  implements Serializable{
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    //id del la materia 
    private long idClase;
    
    //El nombre del la materia
    @Column(name = "costo")
    private long  costo;

    

   @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;
    
     
    public long getIdClase() {
        return idClase;
    }

    public void setIdClase(long idClase) {
        this.idClase = idClase;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }
    
    @ManyToOne
    @JoinColumn(name="idmateria")
    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    

    public Clase() {
    }
    
    
    public Clase(long idClase, long costo, Profesor profesor) {
        this.idClase = idClase;
        this.costo = costo;
        this.profesor = profesor;
    }
    
    public Clase( long costo,Materia materia ,Profesor profesor) {
     
        this.costo = costo;
        this.materia=materia;
        this.profesor = profesor;
    }
    
     
     
     
     
     
     
}
