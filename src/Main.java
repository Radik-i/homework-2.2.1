package OOP;

import static OOP.Gryffindor.compareGryffindorStudents;
import static OOP.Hufflepuff.compareHufflepuffStudents;
import static OOP.Ravenclaw.compareRavenclawStudents;
import static OOP.Slytherin.compareSlytherinStudents;

public class Main {
    public static void main(String[] args) {

        Slytherin draco = new Slytherin("Драко Малфой", 10, 20,
                30, 40, 50, 60, 70);

        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 11, 21,
                31, 41, 51, 61, 71);

        Slytherin gregori = new Slytherin("Грегори Гойл", 12, 22,
                32, 42, 52, 62, 72);


        Ravenclaw chou = new Ravenclaw("Чжоу Чанг", 14, 24,
                34, 44, 54, 64);

        Ravenclaw padma = new Ravenclaw("Падма Патил", 15, 25,
                35, 45, 55, 65);

        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 25, 35,
                45, 55, 65, 75);


        Hufflepuff zakharia = new Hufflepuff("Захария Смит", 16, 26,
                36, 46, 56);

        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 27, 37,
                47, 57, 67);

        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 38,
                48, 58, 68, 78);


        Gryffindor harry = new Gryffindor("Гарри Поттер", 39, 29,
                79, 49, 99);

        Gryffindor hermiona = new Gryffindor("Гермиона Грейнджер", 75, 65,
                95, 95, 55);

        Gryffindor ron = new Gryffindor("Рон Уизли", 55, 65,
                15, 15, 15);


//Сделайте метод, который выводит на экран описание студента.
        print(draco);
        print(chou);
        print(zakharia);
        print(harry);
        System.out.println();


//сравнивают между собой учеников одного факультета по свойствам
        (harry).compareGryffindor(hermiona);
        System.out.println();

        (zakharia).compareHufflepuff(sedrik);
        System.out.println();

        (chou).compareRavenclaw(padma);
        System.out.println();

        (draco).compareSlytherin(gregori);
        System.out.println();


//Реализуйте 4 метода,которые сравнивают между собой учеников одного факультета по свойствам.
// У каждого ученика нужно сложить баллы по каждому свойству


        compareGryffindorStudents(harry, ron);
        System.out.println();

        compareHufflepuffStudents(zakharia, sedrik);
        System.out.println();

        compareRavenclawStudents(padma, chou);
        System.out.println();

        compareSlytherinStudents(draco, gregori);
        System.out.println();


//Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию
// трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
        harry.compareHogwarts(draco);
        System.out.println();

        chou.compareHogwarts(gregori);
        System.out.println();

    }

    public static void print(Hogwarts students) {
        System.out.println(students);
    }
}