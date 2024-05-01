import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
            La mejor película del fin del milenio
        """;
        double sumaEvaluacionesUsuarios = 0;
        double promedioEvaluacionesUsuarios;

        System.out.println("Título de película: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println(
            "Incluída en plan básico: "
            + (incluidoEnElPlanBasico ? "Sí" : "No")
        );

        double mediaEvaluaciones = (4.5 + 4.8 + 3) / 3;

        System.out.println("Evaluación promedio: " + mediaEvaluaciones);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        int i = 0;

        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println(
                "Ingresa la evaluación que le darías a "
                + nombre
                + ": "
            );
            double evaluacionUsuario = teclado.nextDouble();
            sumaEvaluacionesUsuarios += evaluacionUsuario;

            i++;
        }

        promedioEvaluacionesUsuarios = sumaEvaluacionesUsuarios / 3;

        System.out.println(
            "Evaluación promedio según usuarios: "
            + promedioEvaluacionesUsuarios
        );
    }
}