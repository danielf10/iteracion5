/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author Daniel
 */
@Entity
@Table(name="materia_nivel")
public class Materia_Nivel implements Serializable {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @ManyToOne
    @JoinColumn(name="idMateria")
    private Materia materia;
    @ManyToOne
    @JoinColumn(name="idNivel")
    private Nivel nivel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Materia_Nivel() {
    }

    public Materia_Nivel(long id, Materia materia, Nivel nivel) {
        this.id = id;
        this.materia = materia;
        this.nivel = nivel;
    }

    public Materia_Nivel(Materia materia, Nivel nivel) {
        this.materia = materia;
        this.nivel = nivel;
    }
    
    
    
    
    
    
    
    
    
    
    
}
