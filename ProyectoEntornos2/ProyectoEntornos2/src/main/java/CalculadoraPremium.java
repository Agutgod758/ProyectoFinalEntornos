/**
 * La clase CalculadoraPremium es una subclase de CalculadoraBasica que representa una calculadora premium de información de salud y estado físico con funcionalidades adicionales.
 */
public class CalculadoraPremium extends CalculadoraBasica{

    /**
     * Constructor para la clase CalculadoraPremium que inicializa los atributos.
     *
     * @param peso           El peso del usuario básico.
     * @param altura         La altura del usuario básico.
     * @param edad           La edad del usuario básico.
     * @param sexo           El sexo del usuario básico.
     * @param nivelActividad El nivel de actividad del usuario básico.
     */
    public CalculadoraPremium(int peso, int altura, int edad, String sexo, int nivelActividad) {
        super(peso, altura, edad, sexo, nivelActividad);
    }

    /**
     * Calcula la ingesta diaria de proteínas recomendada para el usuario basada en su peso.
     *
     * @param objetivo El objetivo del usuario premium.
     * @param peso     El peso del usuario.
     * @return La cantidad de proteínas recomendada en gramos.
     */
    public double calcularProteinas(String objetivo, int peso) {
        double Proteinas = (peso*2.2);
        return Proteinas;
    }

    /**
     * Calcula la ingesta diaria de grasas recomendada para el usuario basada en su objetivo, nivel de actividad, peso, altura, edad y sexo.
     *
     * @param objetivo       El objetivo del usuario premium.
     * @param NivelActividad El nivel de actividad del usuario premium.
     * @param peso           El peso del usuario.
     * @param altura         La altura del usuario.
     * @param edad           La edad del usuario.
     * @param sexo           El sexo del usuario.
     * @return La cantidad de grasas recomendada en gramos.
     */
    public double calcularGrasas(String objetivo, int NivelActividad, int peso,int altura,int edad,String sexo) {
        double CaloriasMantenimiento =((peso*10)+(altura*6.25)+(edad*5));

        if (sexo=="Mujer"||sexo=="mujer"){
            CaloriasMantenimiento = CaloriasMantenimiento-161;
        }if (sexo=="Hombre"||sexo=="hombre") {
            CaloriasMantenimiento = CaloriasMantenimiento+5;
        }
        double Grasas = ((CaloriasMantenimiento*0.35)/9);
        return Grasas;
    }

    /**
     * Calcula la ingesta diaria de hidratos de carbono recomendada para el usuario basada en su objetivo, nivel de actividad, peso, altura, edad y sexo.
     *
     * @param objetivo       El objetivo del usuario premium.
     * @param NivelActividad El nivel de actividad del usuario premium.
     * @param peso           El peso del usuario.
     * @param altura         La altura del usuario.
     * @param edad           La edad del usuario.
     * @param sexo           El sexo del usuario.
     * @return La cantidad de hidratos de carbono recomendada en gramos.
     */
    public double calcularHidratosCarbono(String objetivo, int NivelActividad, int peso,int altura,int edad,String sexo) {
        double CaloriasMantenimiento =((peso*10)+(altura*6.25)+(edad*5));

        if (sexo=="Mujer"||sexo=="mujer"){
            CaloriasMantenimiento = CaloriasMantenimiento-161;
        }if (sexo=="Hombre"||sexo=="hombre") {
            CaloriasMantenimiento = CaloriasMantenimiento+5;
        }
        double Hidratos = ((CaloriasMantenimiento/2)/4);
        return Hidratos;
    }
}
