
package br.com.classes;

import java.util.ArrayList;
import java.util.List;


public class Carro {
    private String placa;
    private String cor;
    private Pessoa dono;
    
     private List<Pessoa> pessoasQueDirigiram = new ArrayList<Pessoa>();

    public Carro(String placa, String cor) {
        this.placa = placa;
        this.cor = cor;
    }
     
    public void listarPessoasQueDirigiram(){
        for (Pessoa item : pessoasQueDirigiram) {
            System.out.println(item);
        }
    }

    public List<Pessoa> getPessoasQueDirigiram() {
        return pessoasQueDirigiram;
    }

    public void setPessoasQueDirigiram(List<Pessoa> pessoasQueDirigiram) {
        this.pessoasQueDirigiram = pessoasQueDirigiram;
    }     
    
    public void addPessoaQueDirigiu(Pessoa p){
        pessoasQueDirigiram.add(p);
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", cor=" + cor + ", dono=" + dono + '}';
    }
    
    

    
    
    
}
