package OOP;

import java.util.Objects;

public class Hogwarts {

    private final String nameOfStudent;
    private final int powerOfMagic;
    private final int distanceOfTransgression;

    public Hogwarts(String nameOfStudent, int powerOfMagic, int distanceOfTransgression) {
        this.nameOfStudent = nameOfStudent;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }


    @Override
    public String toString() {
        return "Студенты Хогвартса: " + nameOfStudent +
                ", Сила магии составляет " + powerOfMagic +
                ", Расстояние трансгрессии составляет " + distanceOfTransgression + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerOfMagic == hogwarts.powerOfMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(nameOfStudent, hogwarts.nameOfStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStudent, powerOfMagic, distanceOfTransgression);
    }


    public void compareHogwarts(Hogwarts student) {
        if (this.powerOfMagic > student.getPowerOfMagic()) {
            System.out.println("Сила магии " + this.nameOfStudent + " больше чем " + student.getNameOfStudent());
        } else if (this.powerOfMagic < student.getPowerOfMagic()) {
            System.out.println("Сила магии " + this.nameOfStudent + " меньше чем " + student.getNameOfStudent());
        } else {
            System.out.println("Сила магии " + this.nameOfStudent + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }

        if (this.distanceOfTransgression > student.getDistanceOfTransgression()) {
            System.out.println("Расстояние трансгрессии " + this.nameOfStudent + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.powerOfMagic < student.getPowerOfMagic()) {
            System.out.println("Расстояние трансгрессии " + this.nameOfStudent + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Расстояние трансгрессии " + this.nameOfStudent + " и "
                    + student.getNameOfStudent() + " одинаковое");
        }
    }


}
