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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author Daniel
 */

@Entity
@Table(name="materia")
public class Materia implements Serializable {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    //id del la materia 
    private long idmateria;
    
    //El nombre del la materia
    @Column(name = "nombre")
    private String nombre;

   
     @ManyToOne
    @JoinColumn(name="idnivel")
    private Nivel nivel;
    
    
     
     
     
     
    public long getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(long idmateria) {
        this.idmateria = idmateria;
    }
    
     @OneToMany(mappedBy = "materia")
    private Set<Clase> clases; 

    public Set<Clase> getClases() {
        return clases;
    }

    public void setClases(Set<Clase> clases) {
        this.clases = clases;
    }

   
     
    
    
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    
    
    public Materia() {
    }

    public Materia(long idmateria, String nombre, Nivel nivel) {
        this.idmateria = idmateria;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Materia(String nombre, Nivel nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    
    
    
    
    
    
    
}
