package OOP;

import java.util.Objects;
public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;


    public Gryffindor(String nameOfStudent, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honor, int bravery) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Факультет Гриффиндор, " +
                " благородство составляет " + nobility +
                ", честь составляет " + honor +
                ", храбрость составляет " + bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }


    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int totalValue1 = student1.nobility + student1.bravery + student1.honor;
        int totalValue2 = student2.nobility + student2.bravery + student2.honor;
        if (totalValue1 > totalValue2) {
            System.out.println("Количество баллов для студента " + student1.getNameOfStudent()
                    + " составляет " + totalValue1 + " \n" +
                    " и он лучший ученик Гриффиндора чем "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Количество баллов для студента " + student2.getNameOfStudent()
                    + " составляет " + totalValue2 + " и он лучший студент Гриффиндора чем "
                    + student1.getNameOfStudent());
        }
    }

    public void compareGryffindor(Gryffindor student) {
        super.compareHogwarts(student);
        if (this.nobility > student.getNobility()) {
            System.out.println("Благородство " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.nobility < student.getNobility()) {
            System.out.println("Благородство " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Благородство " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковое");
        }

        if (this.bravery > student.getBravery()) {
            System.out.println("Храбрость " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.bravery < student.getBravery()) {
            System.out.println("Храбрость " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Храбрость " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


        if (this.honor > student.getHonor()) {
            System.out.println("Честь " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.honor < student.getHonor()) {
            System.out.println("Честь " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Честь " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }
    }


}
