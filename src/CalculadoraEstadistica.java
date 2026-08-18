public class CalculadoraEstadistica {

    public static double calcularMedia(double datos) {
        double suma = 0;
        
        for(double dato : datos){
            suma += dato;
        }
        
        return suma / datos.length;
        
    }
    
    public static void main(String args) {
        double datos = {10, 20, 30, 40, 50};
        
        Stystem.out.printf("Media = %.2f%n", calculadorMedia(datos));
    }
    
    
    public static double calcularDesviacionEstandar(double datos) {
        double media = calcularMedia(datos);
        double suma = 0;
        
        for (double dato : datos) {
            suma += Math.pow(dato - media, 2) ;
        }
        
        
        return Math.sqrt(suma / datos.length);
    
    }
    
    System.out.printf(
        "Desviacion estandar = %.2f%n",
        calcularDesviacionEstandar(Datos)
    );
    
}

        
        
