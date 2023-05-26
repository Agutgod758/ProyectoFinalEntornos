/**
 * La clase UsuarioBasico es una subclase de Usuario que representa a un usuario con un perfil básico.
 */
public class UsuarioBasico extends Usuario{
    /**
     * Constructor para la clase UsuarioBasico que inicializa los atributos.
     *
     * @param peso           El peso del usuario básico.
     * @param altura         La altura del usuario básico.
     * @param edad           La edad del usuario básico.
     * @param sexo           El sexo del usuario básico.
     * @param nivelActividad El nivel de actividad del usuario básico.
     */
    public UsuarioBasico(int peso, int altura, int edad, String sexo, int nivelActividad) {
        super(peso, altura, edad, sexo, nivelActividad ,false);
    }
}
