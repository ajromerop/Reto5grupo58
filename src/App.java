import views.index;

public class App {
    public static void main(String[] args) throws Exception {
        index runPantalla = new index("jdbc:sqlite:ProyectosConstruccion.db");
        runPantalla.setVisible(true);

    }
}