package imserso;

public class ImsersoApp {
    public static void main(String[] args) {

        Abuelo pepe = new Abuelo("pepe",89);
        Abuelo jacobo = new Abuelo("jacobo",75);
        Abuelo marisa = new Abuelo("marisa",67);
        Abuelo denis = new Abuelo("denis",68);

        Autobusimserso alsa = new Autobusimserso("1234KKK","MADRID");

        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(jacobo);
        alsa.insertarAbuelo(marisa);
        alsa.insertarAbuelo(denis);

        System.out.println(alsa.getListaAbuelos());

        alsa.borrarAbuelo(denis);
        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarAbuelos();

        alsa.mostrarMayores(80);

    }
}
