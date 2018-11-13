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



@Entity
@Table(name="usuario")

/**
 *
 * @author jonh
 */
public class Usuario implements Serializable{
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    //id del usuario
    private long idPersona;
 
    //El nombre del usuario
    @Column(name = "us")
    private String us;
    
     //El correo del usuario
    @Column(name = "correo")
    private String correo;
    
    
    //La contrasenia del usuario
    @Column(name = "contrasenia")
    private String contrasenia;
    
    //El nombre del usuario
    @Column(name = "nombre")
    private String nombre;
    
    
     //El nombre del usuario
    @Column(name = "app")
    private String app;
    
     //El nombre del usuario
    @Column(name = "apm")
    private String apm;
    
     //El nombre del usuario
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name= "rol")
    private String rol;
    
     //El nombre del usuario
    @Column(name = "denunciado")
    private int denunciado;
    
     //El nombre del usuario
    @Column(name = "foto")
    private String foto;
    
    
    //relacion con el usuario-------alumno 
   // @OneToOne
   // private Alumno alumno;

    //public Alumno getAlumno() {
       // return alumno;
    //}

    //public void setAlumno(Alumno alumno) {
        //this.alumno = alumno;
    //}
    /////////////////////////////////////////
   
    
    ///////////metodos set and get////////////////////

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public String getUser() {
        return us;
    }

    public void setUser(String user) {
        this.us = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getDenunciado() {
        return denunciado;
    }

    public void setDenunciado(int denunciado) {
        this.denunciado = denunciado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
   
    
    ////////metodos constructores//////////

    public Usuario() {
    }

    public Usuario(long idPersona, String us, String correo , String contrasenia, String nombre, String app, String apm, String telefono, String rol, int denunciado, String foto) {
        this.idPersona = idPersona;
        this.us = us;
        this.correo = correo;
         this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.telefono = telefono;
        this.rol = rol;
        this.denunciado = denunciado;
        this.foto = foto;
    }
    
    
    
    
    
    

    public Usuario(long idPersona, String user, String correo, String contrasenia) {
        this.idPersona = idPersona;
        this.us = user;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    
    
    
     public Usuario(String user, String correo , String contrasenia) {
        this.us = user;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

     
   
     
     
 

    public Usuario(String user, String correo, String contrasenia, String rol) {
        this.us = user;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }
    
    
    
    
    
    
}
