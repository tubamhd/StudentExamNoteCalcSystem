public class Student {
    Course tarih;
    Course fizik;
    Course kimya;

    String name;
    String student_no;
    String subjects;
    double average;
    boolean IsPass;

    Student(String name, String student_no, String subjects, Course tarih, Course fizik, Course kimya){
        this.name = name;
        this.student_no = student_no;
        this.subjects = subjects;
        this.tarih = tarih;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        boolean IsPass = false;
    }

    /*void AddBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            c3.note = note3;
        }


    }*/

    //tarihen = Dersin sınav notu (tarih e'xam n'ote)
    //tarihpn = Dersin sözlü notu (tarih p'resentation n'ote)

    //  This function gives the average of subjects with exam and presentation notes.

    void AddBulkExamNote(int tarihen, int fiziken, int kimyaen, double tarihpn, double fizikpn, double kimyapn){
        this.tarih.average(tarihpn, tarihen);
        this.fizik.average(fizikpn, fiziken);
        this.kimya.average(kimyapn, kimyaen);
    }

    void print_note(){
        System.out.println("___________________________");
        System.out.println("Öğrenci Adı:  " + this.name);
        System.out.println("Öğrenci No:  " + this.student_no);
        System.out.println("Ders: " + this.tarih.name + " \tNot: " + this.tarih.note);
        System.out.println("Ders: " + this.fizik.name + " \tNot: " + this.fizik.note);
        System.out.println("Ders: " + this.kimya.name + " \tNot: " + this.kimya.note);
        System.out.println("Ortalamanız: " + this.average);
    }

    void IsPass(){
        this.IsPass = IsCheckPass();
        print_note();
        this.average = (this.tarih.note + this.fizik.note + this.kimya.note) / 3.0;
        if (this.IsPass){
            System.out.println(this.name + " Sınıfı Geçtin!");
        }else{
            System.out.println(this.name + "Sınıfta Kaldın!");
        }

    }

    void CalcAverage(){
        this.average = (this.tarih.note + this.fizik.note + this.kimya.note) / 3.0;
    }

    boolean IsCheckPass(){
        CalcAverage();
        return this.average > 55;

    }
}
