package aula03;

public class Carro extends Veiculo{

    private int numPortas;

    public Carro(String modelo, int ano, int numPortas){
        super(modelo, ano);
        this.numPortas = numPortas;

    }



    @Override
    public void imprimirDetalhes(){
        super.imprimirDetalhes();
        System.out.println("Cilindradas: " + this.numPortas);
    }
    

}
