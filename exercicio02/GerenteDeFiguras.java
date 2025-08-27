package exercicio02;

import java.util.ArrayList;
import java.util.List;


public class GerenteDeFiguras{

private List<FiguraGeometrica> figuras;

public GerenteDeFiguras(){
    this.figuras = new ArrayList<>();

}

public void adicionarFigura(FiguraGeometrica figura){
    figuras.add(figura);
}

public double calcularAreaTotalDeFiguras(){
    double areaTotal = 0;
    for (FiguraGeometrica figura : figuras){
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

}