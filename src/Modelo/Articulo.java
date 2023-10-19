/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;

/**
 *
 * @author Saira
 */
public class Articulo {
    int id_articulo;
    int numero;
    String titulo_art;
    Date inicio;
    Date fin;

    public Articulo(int id_articulo, int numero, String titulo_art, Date inicio,
            Date fin) {
        this.id_articulo = id_articulo;
        this.numero = numero;
        this.titulo_art = titulo_art;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Articulo(int numero, String titulo_art, Date inicio, Date fin) {
        this.numero = numero;
        this.titulo_art = titulo_art;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo_art() {
        return titulo_art;
    }

    public void setTitulo_art(String titulo_art) {
        this.titulo_art = titulo_art;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
    
    
}
