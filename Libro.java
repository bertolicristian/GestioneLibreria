/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

/**
 *
 * @author bertoli.cristian
 */
public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private int annoPubblicazione;
    private double prezzo;

    public Libro(String titolo, String autore, String genere, int annoPubblicazione, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + ", annoPubblicazione=" + annoPubblicazione + ", prezzo=" + prezzo + '}';
    }
    
    
}
