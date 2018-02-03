public class Veterinario {
    AnimalDomestico animal;

    public Veterinario(AnimalDomestico animal) {
        this.animal = animal;
    }

    public void curar() {
        System.out.print("curando a un\t");
        if (this.animal instanceof Gato)
            System.out.print("gato\t");
        else
            System.out.print("perro\t");
        this.animal.saludar();      //enlace dinamico
    }
}
