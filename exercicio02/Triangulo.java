package exercicio02;


public class Triangulo implements FiguraGeometrica {
    
    double base, altura;

    public void triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (this.base*this.altura) / 2;
    }

    public String getNomeFigura(){
        return "Triangulo";
    }

}
