public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double exam_note;
    double presentation_note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
    }


    void average(double presentation_note, double exam_note){
        if (presentation_note >= 0 && presentation_note <= 100 && exam_note >= 0 && exam_note <= 100){
           this.note = presentation_note * 0.20 + exam_note * 0.60;
            //System.out.println("Sonuç: " + this.note);
        }

    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println(this.teacher.name + " Adlı Öğretmen " + this.name + " Dersine Eklendi! ");
        }else{
            System.out.println(this.name + " Dersi ile Öğretmen uyuşmuyor!");
        }
    }

    void printTeacher(){
        if (this.teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("İşlem Gerçekleşmedi!");
        }


    }
}
