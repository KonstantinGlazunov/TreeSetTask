import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
Firm mazda = new Firm("Mazda", 4000, "auto");
Firm mazda2 = new Firm("Mazda", 4000, "auto1");
Firm mazerati = new Firm("Mazerati", 1500, "auto");
Firm bosch = new Firm("Bosch", 10000, "Tools");
Firm bosch2 = new Firm("Bosch", 8000, "Tools2");
Firm buderus = new Firm("Buderus", 5000, "heating");

        TreeSet<Firm> firmsSet1 = new TreeSet<>();  //сортировка по названию и количеству сотрудников
        firmsSet1.add(mazda);
        firmsSet1.add(mazerati);
        firmsSet1.add(bosch);
        firmsSet1.add(buderus);
        firmsSet1.add(bosch2);
        System.out.println(firmsSet1);


        TreeSet<Firm> firmsSet2 = new TreeSet<>( //сортировка по названию, количеству сотрудников и продукту
                new Comparator<Firm>() {
                    @Override
                    public int compare(Firm o1, Firm o2) {
                        if (o1.getTitel().compareTo(o2.getTitel()) != 0) {
                            return o1.getTitel().compareTo(o2.getTitel());
                        }
                        if (o1.getEmployees() - o2.getEmployees() != 0) {
                            return o1.getEmployees() - o2.getEmployees();
                        }
                    return o1.getProduct().compareTo(o2.getProduct());
                    }
                }
        );

        firmsSet2.add(mazda);
        firmsSet2.add(mazda2);
        firmsSet2.add(mazerati);
        firmsSet2.add(bosch);
        firmsSet2.add(buderus);
        firmsSet2.add(bosch2);
        System.out.println(firmsSet2);

    }
}