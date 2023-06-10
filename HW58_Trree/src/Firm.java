public class Firm implements Comparable <Firm>{

    private String titel;
    private int employees;
    private String product;

    public Firm(String titel, int employees) {
        this.titel = titel;
        this.employees = employees;
    }
    public Firm(String titel, int employees, String product) {
        this.titel = titel;
        this.product = product;
        this.employees = employees;

    }
    @Override
    public int compareTo(Firm o) {
        if (this.titel.compareTo(o.titel) != 0) {
            return this.titel.compareTo(o.titel);
        }
        return this.employees - o.employees;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "titel='" + titel + '\'' +
                ", employees=" + employees +
                ", product='" + product + '\'' +
                '}';
    }

    public String getTitel() {
        return titel;
    }

    public int getEmployees() {
        return employees;
    }

    public String getProduct() {
        return product;
    }
}
