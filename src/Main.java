public class Main {
    public static void main(String a[]) {
        AnimalDomestico gato, perro;
        gato = new Gato("Tom", "negro", "siames");
        gato.saludar();
        perro = new Perro("Baby", "cafe", "chapi");
        perro.saludar();
    }
}
