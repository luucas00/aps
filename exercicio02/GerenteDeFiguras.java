package exercicio02;
import java.util.ArrayList;
import java.util.List;



public class GerenteDeFiguras {
   
    private List<FiguraGeometrica> figuras;
    
   
    public GerenteDeFiguras() {
        this.figuras = new ArrayList<>();
    }
    
   
    public void adicionarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }
    
    
    public double calcularAreaTotalDeFiguras() {
        double areaTotal = 0;
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
    

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }
    
    
    public void imprimeFiguras() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Figura: " + figura.getNomeFigura() + 
                             ", Área: " + figura.calcularArea());
        }
    }
    
    
    public FiguraGeometrica getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) {
            return null;
        }
        
        FiguraGeometrica maiorFigura = figuras.get(0);
        double maiorArea = maiorFigura.calcularArea();
        
        for (FiguraGeometrica figura : figuras) {
            double area = figura.calcularArea();
            if (area > maiorArea) {
                maiorArea = area;
                maiorFigura = figura;
            }
        }
        
        return maiorFigura;
    }
}