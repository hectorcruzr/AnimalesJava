public class Main {
    public static void main(String a[]) {
        AnimalDomestico gato, perro;
        gato = new Gato("Tom", "negro", "siames");
        gato.saludar();     //enlace estatico
        perro = new Perro("Baby", "cafe", "chapi");
        perro.saludar();

        Veterinario veterinario;
        veterinario=new Veterinario(perro);
        veterinario.curar();
    }
}
