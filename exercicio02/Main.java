package exercicio02;
public class Main {
    public static void main(String[] args) {
        // Create a manager for geometric figures
        GerenteDeFiguras gerente = new GerenteDeFiguras();
        
        
        Triangulo triangulo1 = new Triangulo(5, 8);
        Triangulo triangulo2 = new Triangulo(3, 6);
        Losango losango1 = new Losango(4, 6);
        Losango losango2 = new Losango(8, 10);
        
        
        gerente.adicionarFigura(triangulo1);
        gerente.adicionarFigura(triangulo2);
        gerente.adicionarFigura(losango1);
        gerente.adicionarFigura(losango2);
        
        
        System.out.println("Lista de todas as figuras:");
        gerente.imprimeFiguras();
        
        
        System.out.println("\nÁrea total de todas as figuras: " + 
                          gerente.calcularAreaTotalDeFiguras());
        
        
        FiguraGeometrica maiorFigura = gerente.getMaiorAreaDeFigura();
        System.out.println("\nFigura com maior área: " + maiorFigura.getNomeFigura() + 
                         " com área de " + maiorFigura.calcularArea());
    }
}