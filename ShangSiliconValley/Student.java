public class Student {
    public int studentId;
    public int stata;
    public int score;

    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].studentId = i + 1;
            students[i].stata = (int) Math.round(Math.random() * 6 + 1);
            students[i].score = (int) Math.round(Math.random() * 101);
        }

        for (Student student : students) {
            if (student.stata == 3) {
                System.out.println("Found student with stata 3: ID = " + student.studentId);
            }
        }

        for(int i = 0 ; i < students.length -1; i++){
            for(int j = 0 ; j < students.length -1  -i; j++){
                if(students[j].score > students[j + 1].score){
                    int temp = students[j].score;
                    students[j].score = students[j + 1].score;
                    students[j + 1].score = temp;
                }
            }

        }
        System.out.println("------------------------------------------");
        for (Student student : students) {
            System.out.print(student.score + "\t");
        }
    }
}