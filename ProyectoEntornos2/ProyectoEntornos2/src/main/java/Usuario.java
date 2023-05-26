/**
 * La clase Usuario representa a un usuario con atributos relacionados con su perfil y características.
 */
public class Usuario {
    //Atributos
    private int peso;
    private int altura;
    private int edad;
    private String sexo;
    private boolean tipoUsuario;
    private int nivelActividad;

    /**
     * Constructor para la clase Usuario que inicializa los atributos.
     *
     * @param peso           El peso del usuario.
     * @param altura         La altura del usuario.
     * @param edad           La edad del usuario.
     * @param sexo           El sexo del usuario.
     * @param nivelActividad El nivel de actividad del usuario.
     * @param tipoUsuario    El tipo de usuario.
     */
    public Usuario(int peso, int altura, int edad, String sexo, int nivelActividad, boolean tipoUsuario) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        this.nivelActividad = nivelActividad;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * Obtiene el peso del usuario.
     *
     * @return El peso del usuario.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Establece el peso del usuario.
     *
     * @param peso El peso del usuario.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }


    /**
     * Obtiene la altura del usuario.
     *
     * @return La altura del usuario.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Establece la altura del usuario.
     *
     * @param altura La altura del usuario.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Obtiene la edad del usuario.
     *
     * @return La edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del usuario.
     *
     * @param edad La edad del usuario.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el sexo del usuario.
     *
     * @return El sexo del usuario.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo del usuario.
     *
     * @param sexo El sexo del usuario.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene el nivel de actividad del usuario.
     *
     * @return El nivel de actividad del usuario.
     */
    public int getNivelActividad() {
        return nivelActividad;
    }

    /**
     * Establece el nivel de actividad del usuario.
     *
     * @param nivelActividad El nivel de actividad del usuario.
     */
    public void setNivelActividad(int nivelActividad) {
        this.nivelActividad = nivelActividad;
    }

    /**
     * Verifica el tipo de usuario.
     *
     * @return true si el usuario es de un tipo específico, false de lo contrario.
     */
    public boolean isTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Establece el tipo de usuario.
     *
     * @param tipoUsuario El tipo de usuario.
     */
    public void setTipoUsuario(boolean tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}