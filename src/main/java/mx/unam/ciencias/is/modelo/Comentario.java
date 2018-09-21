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

@Entity
@Table(name="comentarios")


/**
 *
 * @author jonh
 */
public class Comentario implements Serializable{
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idcomentarios")
    private Long idComentario;
    
    @ManyToOne
    @JoinColumn(name="idusuario")
    private Usuario usuario;
    
    @Column(name="comentario")
    private String Comentario;
    
    @Column(name="estado")
    private  long estado;

    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public long getEstado() {
        return estado;
    }

    public void setEstado(long estado) {
        this.estado = estado;
    }

    public Comentario() {
    }

    public Comentario(Long idComentario, Usuario usuario, String Comentario, long estado) {
        this.idComentario = idComentario;
        this.usuario = usuario;
        this.Comentario = Comentario;
        this.estado = estado;
    }
    
    
    
}
