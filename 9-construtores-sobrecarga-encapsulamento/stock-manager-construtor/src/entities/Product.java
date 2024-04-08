package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //constructor default
    public Product() {
    }
    // constructor

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // constructor - overload
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /*
     * Encapsulamento em Java é o conceito de ocultar os detalhes de implementação de uma classe,
     * tornando seus atributos privados e fornecendo métodos públicos para acessá-los e modificá-los(setters e getters).
     * Isso promove segurança, controle, flexibilidade e abstração, permitindo que os objetos da classe sejam
     * utilizados por meio de uma interface pública, enquanto os detalhes internos da implementação são mantidos ocultos
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    /* A quantidade de produtos só poderá ser alterada através dos métodos addProducts e removeProducts.
     * Dessa forma, para quantity não haverá o método setQuantity, para proteger o objeto Product de alteracoes
     * inconsistentes de quantiadde
     * */
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
       return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $: "
                + String.format("%.2f", totalValueInStock());
    }
}
