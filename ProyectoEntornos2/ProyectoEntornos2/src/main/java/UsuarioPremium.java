/**
 * La clase UsuarioPremium es una subclase de Usuario que representa a un usuario premium con características adicionales.
 */
public class UsuarioPremium extends Usuario{
    //Atributos
    private String objetivo;

    /**
     * Constructor para la clase UsuarioPremium que inicializa los atributos.
     *
     * @param peso           El peso del usuario premium.
     * @param altura         La altura del usuario premium.
     * @param edad           La edad del usuario premium.
     * @param sexo           El sexo del usuario premium.
     * @param objetivo       El objetivo del usuario premium.
     * @param nivelActividad El nivel de actividad del usuario premium.
     */
    public UsuarioPremium(int peso, int altura, int edad, String sexo, String objetivo, int nivelActividad) {
        super(peso, altura, edad, sexo, nivelActividad,true);
        this.objetivo = objetivo;
    }

    /**
     * Obtiene el objetivo del usuario premium.
     *
     * @return El objetivo del usuario premium.
     */
    public String getObjetivo() {
        return objetivo;
    }

    /**
     * Establece el objetivo del usuario premium.
     *
     * @param objetivo El objetivo del usuario premium.
     */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
