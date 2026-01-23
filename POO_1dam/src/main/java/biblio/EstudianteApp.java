package biblio;

public class EstudianteApp {

    public static void main(String[] args) {

        Estudiante angel = new Estudiante("angel","1DAM","angel@iesmutxamel.com");

        System.out.println(angel.getNIA());

        Estudiante denis = new Estudiante("denis");

        System.out.println(denis.getNIA());

        Estudiante joaquin = new Estudiante("joaquin");

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("angel@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("angel@alu.edu.gva.es"));

        Editorial editorial = new Editorial("Millenium","España");

        Libro divina_comedia = new Libro("divina comedia","dante ali",editorial);

        System.out.println(divina_comedia);

        /// ////////////////////
        divina_comedia.prestar(angel);

        System.out.println(angel);

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("Libros creados: " + Libro.getTotalLibros());

        divina_comedia.devolver();
        divina_comedia.devolver();

        System.out.println(angel);

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);

    }
}
