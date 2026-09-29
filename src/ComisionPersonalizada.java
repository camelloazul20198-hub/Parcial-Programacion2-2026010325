public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        int n = 5; // Cambiá este número por la cantidad de letras de tu primer nombre
        double porcentaje = (5.0 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}
