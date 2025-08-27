package exercicio02;

public class Losango implements FiguraGeometrica {

    private double diagonal1, diagonal2;

    public Losango(double diagonal1, double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;

    }

    public double calcularArea(){
        return (diagonal1 * diagonal2) / 2;
    }

    public String getNomeFigura(){
        return "Losango";
    }
    
}
