
package instrumusica.elements;

/**
 *
 * @author dapec
 */
public class Datos {
    private String marca;
    private String modelo;
    private String clase; //EJEMPLO: Cuerdas
    private String tipo; //EJEMPLO: Guitarra
    private String subtipo; //EJEMPLO: Eléctico
    private String color;
    private Double precio;
    private String materiales; //EJEMPLO: Material1/Material2/Material3
    private Double peso; //en gramos
    private String dimensiones; //EJEMPLO: L:50cm x A:20cm x H:5cm (largoxanchoxaltura)
    private String paisFab; //EJEMPLO: China

    public Datos() {
        this.marca = "SIN-MARCA";
        this.modelo = "SIN-MODELO";
        this.clase = "SIN-CLASE";
        this.tipo = "SIN-TIPO";
        this.subtipo = "SIN-SUBTIPO";
        this.color = "SIN-COLOR";
        this.precio = 0.0;
        this.materiales = "SIN-MATERIALES";
        this.peso = 0.0;
        this.dimensiones = "SIN-DIMENSIONES";
        this.paisFab = "SIN-PAIS-DE-FABRICACIÓN";
    }//end constructor sin parámetros

    public Datos(String marca, String modelo, String clase, String tipo, 
            String subtipo, String color, Double precio, String materiales, 
            Double peso, String dimensiones, String paisFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.clase = clase;
        this.tipo = tipo;
        this.subtipo = subtipo;
        this.color = color;
        this.precio = precio;
        this.materiales = materiales;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.paisFab = paisFab;
    }//end constructor con parámetros
    
    
    //SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }//end setMarca

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }//end setModelo

    public void setClase(String clase) {
        this.clase = clase;
    }//end setClase

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }//end setTipo

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }//end setSubtipo

    public void setColor(String color) {
        this.color = color;
    }//end setColor

    public void setPrecio(Double precio) {
        this.precio = precio;
    }//end setPrecio

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }//end setMateriales

    public void setPeso(Double peso) {
        this.peso = peso;
    }//end setPeso

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }//end setDimensiones
    
    public void setPaisFab(String paisFab) {
        this.paisFab = paisFab;
    }//end setPaisFab
    
    
    //GETTERS
    public String getMarca() {
        return marca;
    }//end getMarca

    public String getModelo() {
        return modelo;
    }//end getModelo

    public String getClase() {
        return clase;
    }//end getClase

    public String getTipo() {
        return tipo;
    }//end getTipo

    public String getSubtipo() {
        return subtipo;
    }//end getSubtipo

    public String getColor() {
        return color;
    }//end getColor

    public Double getPrecio() {
        return precio;
    }//end getPrecio

    public String getMateriales() {
        return materiales;
    }//end getMateriales

    public Double getPeso() {
        return peso;
    }//end getPeso

    public String getDimensiones() {
        return dimensiones;
    }//end getDimensiones
    
    public String getPaisFab() {
        return paisFab;
    }//end getPaisFab
    
    @Override
    public String toString(){
        return 
                "  Marca: " + this.getMarca() + "\n"
                + "  Modelo: " + this.getModelo() + "\n"
                + "  Clase: " + this.getClase() + "\n"
                + "  Tipo: " + this.getTipo() + "\n"
                + "  Sub-Tipo: " + this.getSubtipo() + "\n"
                + "  Color: " + this.getColor() + "\n"
                + "  Precio: $" + String.format("%.2f", this.getPrecio()) + " MXN\n"
                + "  Materiales: " + this.getMateriales() + "\n"
                + "  Peso: " + String.format("%.2f", this.getPeso()) + "g\n"
                + "  Dimensiones: " + this.getDimensiones() + "\n"
                + "  Pais de fabricación: " + this.getPaisFab()
                + "\n-------------------------------------------------\n\n";
    }//end toString
    
    public String toStringArchivoCSV(){
        return this.getMarca() + "," + this.getModelo() + "," + this.getClase() + ","
                + this.getTipo() + "," + this.getSubtipo() + "," + this.getColor() + ","
                + this.getPrecio() + "," + this.getMateriales() + "," + this.getPeso() + ","
                + this.getDimensiones() + "," + this.getPaisFab();
    }//end toStringArchivoCSV
    
}//end class
