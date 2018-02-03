abstract public class AnimalDomestico {
    protected String nombre;
    protected String color;
    protected String raza;

    public AnimalDomestico(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.nombre = color;
        this.raza = raza;
    }

    //abstract no lleva cuerpo, es una declaracion
    abstract public void saludar();

}
