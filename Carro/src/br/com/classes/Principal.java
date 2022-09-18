
package br.com.classes;


public class Principal {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Adão","00000");
        Pessoa p2 = new Pessoa("Eva","111111");
        Pessoa p3 = new Pessoa("Maria","2222",p,p2);
        Pessoa p4 = new Pessoa("Mariazinha","33333",p3);
        
        Carro c1 = new Carro("0xx-1234", "Branco");
        Carro c2 = new Carro("ppp-1234", "Cinza");
        
        c1.setDono(p);
        c1.addPessoaQueDirigiu(p);
        c1.addPessoaQueDirigiu(p2);
        p.venderCarro(c1, p2);
        
        System.out.println(c1);
        System.out.println(p);
        System.out.println(p2);
        System.out.println("Pessoas que digiriam o carro c1");
        c1.listarPessoasQueDirigiram();
        System.out.println("Carros de adão");
        p.listarCarros();
        System.out.println("Carros de eva");
        p2.listarCarros();
        
        
        
        
    }
    
}
