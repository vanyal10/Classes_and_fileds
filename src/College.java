public class College {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("Lora", "Biology", 20);
        Student student2 = new Student("Joana", "Chemistry", 22);
        Student student3 = new Student("Konstantin", "Finance", 21);


        student1.receiveScholarship(3.5, 500);
        student2.receiveScholarship(3.7, 600);


        student1.upYear();
        student2.upYear();


        StudentGroup bGroup = new StudentGroup("Biology");
        StudentGroup finGroup = new StudentGroup("Finance");
        StudentGroup cGroup = new StudentGroup("Chemistry");


         bGroup.addStudent(student1);
         finGroup.addStudent(student3);
         cGroup.addStudent(student2);


        String bestStudentb = bGroup.theBestStudent();
        System.out.println("The best student in Biology group is: " + bestStudentb);

        // Printing students in groups
        System.out.println("Students in Chemistry group:");
        cGroup.printStudentsInGroup();
        System.out.println();

        System.out.println("Students in Finance group:");
        finGroup.printStudentsInGroup();
    }
}

