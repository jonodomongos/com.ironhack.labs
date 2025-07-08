package Zapateria;

public class Zapato {

    // Propiedades
    private String marca;
    private String modelo;
    private String material;
    private double talla;
    private double precio;

    // Constructores
    public Zapato() {
    }

    public Zapato(String marca, String modelo, String material, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.talla = talla;
        this.precio = precio;
    }

    //Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "marca: " + marca +
                "\nmodelo: " + modelo +
                "\nmaterial: " + material +
                "\ntalla: " + talla +
                "\nprecio: " + precio
                ;
    }
}
