import java.util.Scanner;

/**
 * Esta es la clase principal del programa.
 */
public class Main {

    /**
     * Método principal del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introduccion de los datos
        System.out.print("Introduzca su peso(kg): ");
        int peso = scanner.nextInt();

        System.out.print("Introduzca su altura(cm): ");
        int altura = scanner.nextInt();

        System.out.print("Introduzca su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Introduzca su genero(Hombre/Mujer): ");
        String genero = scanner.next();

        System.out.print("Introduzca nivel de actividad\nSuave=1\nModerado=2\nActivo=3\nMuy activo=4\n");
        int nivelActividad = scanner.nextInt();

        System.out.print("¿Eres usuario premium? (si/no): ");
        String usuariopremium = scanner.next();

        //Comprobacion de usuario premium
        if (usuariopremium.equalsIgnoreCase("si")) {

            //Introduccion de datos especiales del usuario premium
            System.out.print("Introduzca su meta(ganar musculo,perder peso,mantener peso): ");
            String meta = scanner.next();

            //Declaracion de los atributos introducidos en la funcion del usuario premium
            UsuarioPremium usuarioPremium = new UsuarioPremium(peso, altura, edad, genero, meta, nivelActividad);

            //Declaracion de la funcion de la calculadoraBasica
            CalculadoraBasica calculadoraBasica = new CalculadoraBasica(usuarioPremium.getPeso(), usuarioPremium.getAltura(),
                    usuarioPremium.getEdad(), usuarioPremium.getSexo(), usuarioPremium.getNivelActividad());

            //Uso de la funcion de calculo de la masa corporal de la calculadora basica
            double masaCorporal = calculadoraBasica.calcularMasaCorporal(usuarioPremium.getPeso(), usuarioPremium.getAltura());

            //Uso de la funcion de calculo del estado fisico de la calculadora basica
            String estadoFisico = calculadoraBasica.determinarEstadoFisico(masaCorporal);

            //Uso de la funcion de calculo de las calorias de mantenimiento de la calculadora basica
            double caloriasMantenimiento = calculadoraBasica.calcularCaloriasMantenimiento(usuarioPremium.getPeso(),
                    usuarioPremium.getAltura(), usuarioPremium.getEdad(), usuarioPremium.getSexo(), usuarioPremium.getNivelActividad());

            //Declaracion de los atributos introducidos en la funcion de calculadora premium
            CalculadoraPremium calculadoraPremium = new CalculadoraPremium(usuarioPremium.getPeso(), usuarioPremium.getAltura(),
                    usuarioPremium.getEdad(), usuarioPremium.getSexo(),
                    usuarioPremium.getNivelActividad());

            //Funcion del calculo de la ingesta de proteinas diarias
            double proteinas = calculadoraPremium.calcularProteinas(usuarioPremium.getObjetivo(), usuarioPremium.getPeso());

            //Funcion del calculo de la ingesta de grasas diarias
            double grasas = calculadoraPremium.calcularGrasas(usuarioPremium.getObjetivo(), usuarioPremium.getNivelActividad(),
                    usuarioPremium.getPeso(), usuarioPremium.getAltura(),usuarioPremium.getEdad(),usuarioPremium.getSexo());

            //Funcion del calculo de la ingesta de hidratos diarios
            double hidratos = calculadoraPremium.calcularHidratosCarbono(usuarioPremium.getObjetivo(),
                    usuarioPremium.getNivelActividad(), usuarioPremium.getPeso(), usuarioPremium.getAltura(),usuarioPremium.getEdad(),
                    usuarioPremium.getSexo());

            //Muestra el resultado de todas las funciones anteriores, junto a un pequeño mensaje para diferenciar el resultado de cada funcion
            System.out.println("IMC: " + masaCorporal);
            System.out.println("Estado fisico: " + estadoFisico);
            System.out.println("Calorias de mantenimiento: " + caloriasMantenimiento);
            System.out.println("Proteinas: " + proteinas);
            System.out.println("Grasas: " + grasas);
            System.out.println("Hidratos: " + hidratos);
        } else {

            //Declaracion de los atributos introducidos en la funcion del usuario premium
            UsuarioBasico usuarioBasico = new UsuarioBasico(peso, altura, edad, genero, nivelActividad);

            //Declaracion de la funcion de la calculadoraBasica
            CalculadoraBasica calculadoraBasica = new CalculadoraBasica(usuarioBasico.getPeso(), usuarioBasico.getAltura(),
                    usuarioBasico.getEdad(), usuarioBasico.getSexo(), usuarioBasico.getNivelActividad());

            //Uso de la funcion de calculo de la masa corporal de la calculadora basica
            double masaCorporal = calculadoraBasica.calcularMasaCorporal(usuarioBasico.getPeso(), usuarioBasico.getAltura());

            //Uso de la funcion de calculo del estado fisico de la calculadora basica
            String estadoFisico = calculadoraBasica.determinarEstadoFisico(masaCorporal);

            //Uso de la funcion de calculo de las calorias de mantenimiento de la calculadora basica
            double caloriasMantenimiento = calculadoraBasica.calcularCaloriasMantenimiento(usuarioBasico.getPeso(),
                    usuarioBasico.getAltura(), usuarioBasico.getEdad(), usuarioBasico.getSexo(), usuarioBasico.getNivelActividad());

            //Muestra el resultado de todas las funciones anteriores, junto a un pequeño mensaje para diferenciar el resultado de cada funcion
            System.out.println("IMC: " + masaCorporal);
            System.out.println("Estado fisico: " + estadoFisico);
            System.out.println("Calorias de mantenimiento: " + caloriasMantenimiento);
        }
        //Final de la funcion del escaner para reiniciar los valores y no ocurran errores no deseados en la aplicacion
        scanner.close();
    }
}