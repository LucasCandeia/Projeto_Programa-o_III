/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author EAD
 */
public class Mulher {

    private String nome;
    private int idade;
    private String tipo;
    private String data;
    private String proxima;

    public Mulher() {
    }

    public Mulher(String nome, int idade, String tipo, String data, String proxima) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.data = data;
        this.proxima = proxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProxima() {
        return proxima;
    }

    public void setProxima(String proxima) {
        this.proxima = proxima;
    }

}
