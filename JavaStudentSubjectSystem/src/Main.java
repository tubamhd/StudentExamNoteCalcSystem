public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Tugba","905000000","TRH");
        Teacher t2 = new Teacher("Sophia", "9050000000", "FZK");
        Teacher t3 = new Teacher("Daniel", "090500000","KMY");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "101", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("William", "1770","4",tarih, fizik, kimya);
        s1.AddBulkExamNote(100,78,50, 56,77,90);
        s1.IsPass();

        Student s2 = new Student("Daphine", "764", "2", tarih, fizik, kimya);
        s2.AddBulkExamNote(69,70,66,100,70,59);
        s2.IsPass();
    }
}
