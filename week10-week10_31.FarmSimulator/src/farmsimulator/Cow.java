package farmsimulator;

import java.util.Random;

/**
 *
 * @author Jere
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double udderCapacity;
    private double milkAmount;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String randomName() {
        String genName = NAMES[new Random().nextInt(31)];
        return genName;
    }

    private double randomUdderCap() {
        double capGen = 15 + new Random().nextInt(26);
        return capGen;
    }

    public Cow() {
        this.name = this.randomName();
        this.udderCapacity = this.randomUdderCap();
    }

    public Cow(String name) {
        this.name = name;
        this.udderCapacity = this.randomUdderCap();
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return milkAmount;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double milk = this.milkAmount;
        this.milkAmount = 0.0;
        return milk;
    }

    @Override
    public void liveHour() {
        double min = 0.7;
        double max = 2.0;
        double milkProduced = min + (max - min) * new Random().nextDouble();
        double tempCheckExceed = this.milkAmount + milkProduced;
        if (this.udderCapacity >= tempCheckExceed) {
            this.milkAmount += milkProduced;
        }
    }
}
