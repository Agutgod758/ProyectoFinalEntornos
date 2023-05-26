/**
 * La clase CalculadoraBasica es una subclase de UsuarioBasico que representa una calculadora básica de información de salud y estado físico.
 */
public class CalculadoraBasica extends UsuarioBasico{

    /**
     * Constructor para la clase CalculadoraBasica que inicializa los atributos.
     *
     * @param peso           El peso del usuario básico.
     * @param altura         La altura del usuario básico.
     * @param edad           La edad del usuario básico.
     * @param sexo           El sexo del usuario básico.
     * @param nivelActividad El nivel de actividad del usuario básico.
     */
    public CalculadoraBasica(int peso, int altura, int edad, String sexo, int nivelActividad) {
        super(peso, altura, edad, sexo, nivelActividad);
    }

    /**
     * Calcula el índice de masa corporal (IMC) utilizando el peso y la altura proporcionados.
     *
     * @param peso   El peso del usuario.
     * @param altura La altura del usuario en centímetros.
     * @return El índice de masa corporal (IMC) del usuario.
     */
    public double calcularMasaCorporal(int peso, double altura) {
        double altura2 = (altura/100)*(altura/100);
        double MasaCorporal = peso/altura2;
        return MasaCorporal;
    }

    /**
     * Calcula las calorías de mantenimiento para el usuario utilizando el peso, altura, edad, sexo y nivel de actividad proporcionados.
     *
     * @param peso           El peso del usuario.
     * @param altura         La altura del usuario.
     * @param edad           La edad del usuario.
     * @param sexo           El sexo del usuario.
     * @param nivelActividad El nivel de actividad del usuario.
     * @return Las calorías de mantenimiento del usuario.
     */
    public double calcularCaloriasMantenimiento(int peso, int altura, int edad, String sexo, int nivelActividad) {
        double CaloriasMantenimiento =((peso*10)+(altura*6.25)+(edad*5));

            if (sexo=="Mujer"||sexo=="mujer"){
                CaloriasMantenimiento = CaloriasMantenimiento-161;
            }if (sexo=="Hombre"||sexo=="hombre") {
                CaloriasMantenimiento = CaloriasMantenimiento+5;
            }
        return CaloriasMantenimiento;
    }

    /**
     * Determina el estado físico del usuario basado en su índice de masa corporal (IMC).
     *
     * @param MasaCorporal El índice de masa corporal (IMC) del usuario.
     * @return El estado físico del usuario.
     */
    public String determinarEstadoFisico(double MasaCorporal) {
        if(MasaCorporal<18.5){
            return "Peso insuficiente";
        }if (MasaCorporal>=18.5 && MasaCorporal<25){
            return "Peso normal";
        }if(MasaCorporal>=25 && MasaCorporal<30){
            return "Sobrepeso";
        }if(MasaCorporal>=30){
            return "Obesidad";
        }
        return "";
    }
}
