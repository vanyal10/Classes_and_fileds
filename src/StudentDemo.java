public class StudentDemo {
    public static void main(String[] args) {
        Student lora = new Student("lora", "Biology", 21);
        Student joana = new Student("Joana", "Chemistry", 19);
        Student konstantin = new Student("Konstantin", "Finance", 18);

        System.out.println("Lora year in college: " + lora.yearInCollege);

        for (int i = 0; i < 5; i++) {
            lora.upYear();
        }

        System.out.println("Lora year in college: " + lora.yearInCollege);

        System.out.println("Lora money: " + lora.money);
        lora.receiveScholarship(3, 200);
        System.out.println("Lora money: " + lora.money);
    }
}

