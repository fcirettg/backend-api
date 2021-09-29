package com.implancec.dto;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solicitud {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long folio;

    private OffsetDateTime fechaRec;

    private OffsetDateTime fechaServ;

    private int estado;
    private int cantidad_alu;
    private int cantidad_papel;
    private int cantidad_pet;
    private int cantidad_vidrio;
    @ManyToOne
    @JoinColumn(name = "id_afiliado")
    private Afiliado afiliado;

    public Solicitud() {
    }

    public Solicitud(OffsetDateTime fechaRec, OffsetDateTime fechaServ, int estado, int cantidad_alu, int cantidad_papel, int cantidad_pet, int cantidad_vidrio, Afiliado afiliado) {
        this.fechaRec = fechaRec;
        this.fechaServ = fechaServ;
        this.estado = estado;
        this.cantidad_alu = cantidad_alu;
        this.cantidad_papel = cantidad_papel;
        this.cantidad_pet = cantidad_pet;
        this.cantidad_vidrio = cantidad_vidrio;
        this.afiliado = afiliado;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public OffsetDateTime getFechaRec() {
        return fechaRec;
    }

    public void setFechaRec(OffsetDateTime fechaRec) {
        this.fechaRec = fechaRec;
    }

    public OffsetDateTime getFechaServ() {
        return fechaServ;
    }

    public void setFechaServ(OffsetDateTime fechaServ) {
        this.fechaServ = fechaServ;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCantidad_alu() {
        return cantidad_alu;
    }
    public int getCantidad_papel() {
        return cantidad_papel;
    }
    public int getCantidad_pet() {
        return cantidad_pet;
    }
    public int getCantidad_vidrio() {
        return cantidad_vidrio;
    }
    public void setCantidad_alu(int cantidad_alu) {
        this.cantidad_alu = cantidad_alu;
    }
    public void setCantidad_papel(int cantidad_papel) {
        this.cantidad_papel = cantidad_papel;
    }
    public void setCantidad_pet(int cantidad_pet) {
        this.cantidad_pet = cantidad_pet;
    }
    public void setCantidad_vidrio(int cantidad_vidrio) {
        this.cantidad_vidrio = cantidad_vidrio;
    }
}
