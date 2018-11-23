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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author Daniel
 */


@Entity
@Table(name="alumno")
public class MateriaNivel implements Serializable {
    
    @ManyToOne
    @JoinColumn(name="idMateria")
    private Materia materia;
    @ManyToOne
    @JoinColumn(name="idNivel")
    private Nivel nivel;
    
}
