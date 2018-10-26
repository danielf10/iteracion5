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
@Table(name="horario")
public class Horario {
    
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
        private long idHorario;
    
    
    //lunes
    @Column(name = "lunes")
    private String lunes;
    
    
    //hora_lunes
    @Column(name = "hora_lunes")
    private String hora_lunes;
    
    //martes
    @Column(name = "martes")
    private String martes;
    
    
    //martes
    @Column(name = "hora_martes")
    private String hora_martes;
    
    
    //miercoles
    @Column(name = "miercoles")
    private String miercoles;
    
    //miercoles
    @Column(name = "hora_miercoles")
    private String hora_miercoles;
    
    //jueves
    @Column(name = "jueves")
    private String jueves;
    
    
    //jueves
    @Column(name = "hora_jueves")
    private String hora_jueves;
    
    //viernes
    @Column(name = "viernes")
    private String viernes;
    
    //viernes
    @Column(name = "hora_viernes")
    private String hora_viernes;
    
    //sabado
    @Column(name = "sabado")
    private String sabado;
    
    //sabado
    @Column(name = "hora_sabado")
    private String hora_sabado;
    
    //domingo
    @Column(name = "domingo")
    private String domingo;
    
    //domingo
    @Column(name = "hora_domingo")
    private String hora_domingo;

    
    
    
    public long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(long idHorario) {
        this.idHorario = idHorario;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getHora_lunes() {
        return hora_lunes;
    }

    public void setHora_lunes(String hora_lunes) {
        this.hora_lunes = hora_lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getHora_martes() {
        return hora_martes;
    }

    public void setHora_martes(String hora_martes) {
        this.hora_martes = hora_martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getHora_miercoles() {
        return hora_miercoles;
    }

    public void setHora_miercoles(String hora_miercoles) {
        this.hora_miercoles = hora_miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getHora_jueves() {
        return hora_jueves;
    }

    public void setHora_jueves(String hora_jueves) {
        this.hora_jueves = hora_jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public String getHora_viernes() {
        return hora_viernes;
    }

    public void setHora_viernes(String hora_viernes) {
        this.hora_viernes = hora_viernes;
    }

    public String getSabado() {
        return sabado;
    }

    public void setSabado(String sabado) {
        this.sabado = sabado;
    }

    public String getHora_sabado() {
        return hora_sabado;
    }

    public void setHora_sabado(String hora_sabado) {
        this.hora_sabado = hora_sabado;
    }

    public String getDomingo() {
        return domingo;
    }

    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }

    public String getHora_domingo() {
        return hora_domingo;
    }

    public void setHora_domingo(String hora_domingo) {
        this.hora_domingo = hora_domingo;
    }
    
    
    
    
    
    
    
    
}
