
import java.util.Scanner;

class person {
    private String Name;
    private String address;

    public person(String Name, String address) {
        this.Name = Name;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Name: " + Name + " address: " + address;
    }
}

class student extends person {
    private String program;
    private int year;
    private double fee;

    public student(String Name, String address, String program, int year, double fee) {
        super(Name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "student[ " + super.toString() + "" + " program: " + program + " year: " + year + " fee: " + fee + "]";
    }

}

class staff extends person {
    private String school;
    private double pay;

    public staff(String Name, String address, String school, double pay) {
        super(Name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "staff [" + super.toString() + "" + " school: " + school + " pay:  " + pay + "]";
    }

    public static void main(String[] args) {
        student[] stud = new student[2];
        for (int i = 0; i < 2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("enetr your Name");
            String Name = input.nextLine();
            System.out.println("enetr your address");
            String address = input.nextLine();
            System.out.println("enetr your program");
            String program = input.nextLine();
            System.out.println("enetr your year");
            int year = input.nextInt();
            System.out.println("enetr your fee");
            double fee = input.nextDouble();
            stud[i] = new student(Name, address, program, year, fee);
        }
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i]);
        }

        staff[] staf = new staff[2];
        for (int i = 0; i < 2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("enetr your Name");
            String Name = input.nextLine();
            System.out.println("enetr your address");
            String address = input.nextLine();
            System.out.println("enetr your school");
            String school = input.nextLine();
            System.out.println("enetr your pay");
            double pay = input.nextDouble();
            staf[i] = new staff(Name, address, school, pay);
        }
        for (int i = 0; i < staf.length; i++) {
            System.out.println(staf[i]);
        }
    }
}