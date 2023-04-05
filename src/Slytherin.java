package OOP;

import java.util.Objects;

public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int resoluteness;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;


    public Slytherin(String nameOfStudent, int powerOfMagic, int distanceOfTransgression,
                     int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Факультет Слизерин, " +
                "хитрость составляет " + cunning +
                ", решительность составляет " + resoluteness +
                ", амбиция составляет " + ambition +
                ", находчивость составляет " + resourcefulness +
                ", жажда власти составляет " + lustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && resoluteness == slytherin.resoluteness &&
                ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness &&
                lustForPower == slytherin.lustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, resoluteness, ambition, resourcefulness, lustForPower);
    }


    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int totalValue1 = student1.cunning + student1.resoluteness + student1.ambition
                + student1.resourcefulness + student1.lustForPower;
        int totalValue2 = student2.cunning + student2.resoluteness + student2.ambition
                + student2.resourcefulness + student2.lustForPower;
        if (totalValue1 > totalValue2) {
            System.out.println("Количество баллов для студента " + student1.getNameOfStudent()
                    + " составляет " + totalValue1 + " и он лучший студент Слизерина чем "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Количество баллов для студента " + student2.getNameOfStudent()
                    + " составляет " + totalValue2 + " и он лучший студент Слизерина чем "
                    + student1.getNameOfStudent());
        }
    }

    public void compareSlytherin(Slytherin student) {
        super.compareHogwarts(student);
        if (this.cunning > student.getCunning()) {
            System.out.println("Хитрость " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.cunning < student.getCunning()) {
            System.out.println("Хитрость " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Хитрость " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


        if (this.resoluteness > student.getResoluteness()) {
            System.out.println("Решительность " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.resoluteness < student.getResoluteness()) {
            System.out.println("Решительность " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Решительность " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


        if (this.ambition > student.getAmbition()) {
            System.out.println("Амбиция " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.ambition < student.getAmbition()) {
            System.out.println("Амбиция " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Амбиция " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Находчивость " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.resourcefulness < student.getResourcefulness()) {
            System.out.println("Находчивость " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Находчивость " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


        if (this.lustForPower > student.getLustForPower()) {
            System.out.println("Жажда власти " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.lustForPower < student.getLustForPower()) {
            System.out.println("Жажда власти " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Жажда власти " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


    }

}
