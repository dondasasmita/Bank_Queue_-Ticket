public class Teller {

    public int numberOfCustomers = 0;
    public String name;


    public Teller (String name, int customers) {
        setNumberOfCustomers(customers);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int customers) {
        this.numberOfCustomers = customers;

    }
}
