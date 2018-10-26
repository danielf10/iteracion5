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
@Table(name="materia")
public class Materia {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    //id del la materia 
    private long idNivel;
    
    //El nombre del la materia
    @Column(name = "nombre")
    private String nombre;

    public long getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(long idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia() {
    }
    
    
    
}