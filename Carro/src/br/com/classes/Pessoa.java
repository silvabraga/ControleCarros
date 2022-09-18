
package br.com.classes;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {
    private String nome;
    private String cpf;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, String cpf, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.cpf = cpf;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Pessoa mae) {
        this.nome = nome;
        this.cpf = cpf;
        this.mae = mae;
    }    

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }    
    
    private List<Carro> carros = new ArrayList<Carro>();

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    public void listarCarros(){
        for (Carro item : carros) {
            System.out.println(item);
        }
    }
    
    public void comprarCarro(Carro c){
        carros.add(c);
        c.setDono(this);
    }
    
    public void venderCarro(Carro c,Pessoa p){
        carros.remove(c);
        c.setDono(p);
        p.comprarCarro(c);
    }
   
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
    
    
    
}
