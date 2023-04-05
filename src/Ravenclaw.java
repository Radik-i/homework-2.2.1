package OOP;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {

    private final int cleverness;
    private final int wisdom;
    private final int wit;
    private final int fullOfCreativity;


    public Ravenclaw(String nameOfStudent, int powerOfMagic, int  distanceOfTransgression,
                     int cleverness, int wisdom, int wit, int fullOfCreativity) {
        super(nameOfStudent, powerOfMagic, distanceOfTransgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }


    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Факультет Когтевран, " +
                "сообразительность составляет " + cleverness +
                ", мудрость составляет " + wisdom +
                ", остроумие составляет " + wit +
                ", креативность составляет " + fullOfCreativity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return cleverness == ravenclaw.cleverness && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && fullOfCreativity == ravenclaw.fullOfCreativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cleverness, wisdom, wit, fullOfCreativity);
    }


    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int totalValue1 = student1.cleverness + student1.wisdom + student1.wit + student1.fullOfCreativity;
        int totalValue2 = student2.cleverness + student2.wisdom + student2.wit + student2.fullOfCreativity;
        if (totalValue1 > totalValue2) {
            System.out.println("Количество баллов для студента " + student1.getNameOfStudent()
                    + " составляет " + totalValue1 + " и он лучший студент Когтеврана чем "
                    + student2.getNameOfStudent());
        } else if (totalValue1 < totalValue2) {
            System.out.println("Количество баллов для студента " + student2.getNameOfStudent()
                    + " составляет " + totalValue2 + " и он лучший студент Когтеврана чем "
                    + student1.getNameOfStudent());
        }
    }


    public void compareRavenclaw(Ravenclaw student) {
        super.compareHogwarts(student);
        if (this.cleverness > student.getCleverness()) {
            System.out.println("Сообразительность " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.cleverness < student.getCleverness()) {
            System.out.println("Сообразительность " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Сообразительность " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }

        if (this.wisdom > student.getWisdom()) {
            System.out.println("Мудрость " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.wisdom < student.getWisdom()) {
            System.out.println("Мудрость " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Мудрость " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }

        if (this.wit > student.getWit()) {
            System.out.println("Остроумие " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.wit < student.getWit()) {
            System.out.println("Остроумие " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Остроумие " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковое");
        }

        if (this.fullOfCreativity > student.getFullOfCreativity()) {
            System.out.println("Креативность " + this.getNameOfStudent() + " больше чем "
                    + student.getNameOfStudent());
        } else if (this.fullOfCreativity < student.getFullOfCreativity()) {
            System.out.println("Креативность " + this.getNameOfStudent() + " меньше чем "
                    + student.getNameOfStudent());
        } else {
            System.out.println("Креативность " + this.getNameOfStudent() + " и "
                    + student.getNameOfStudent() + " одинаковая");
        }


    }

}

