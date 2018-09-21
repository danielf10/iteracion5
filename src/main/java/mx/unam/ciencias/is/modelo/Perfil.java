/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name="perfil")

/**
 *
 * @author jonh
 */
public class Perfil implements Serializable{
    
    @Id@OneToOne
    @JoinColumn(name="idusuario")
    private Usuario usuario;
    
    @Column(name="foto")
    private String foto;
    
    
    @Column(name="calificacion")
    private Long calificacion;
    
    @Column(name="descripcion")
    private String descripcion;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Long getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Perfil(){}

    public Perfil(Usuario usuario, String foto, Long calificacion, String descripcion) {
        this.usuario = usuario;
        this.foto = foto;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
    }
    
    
}
