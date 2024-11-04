class College
{
    protected   String collegeName;

    public College(String collegeName) {
        // initialize the instance variables
        this.collegeName = collegeName;
    }

    public void admitted() {
        System.out.println("A student admitted in "+collegeName);
    }
}
class Student extends College{

    String studentName;
    String department;

    public Student(String collegeName, String studentName,String depart) {
        super(collegeName);
        // initialize the instance variables
        this.studentName = studentName;
        this.department = depart;


    }

    public String toString(){
        // return the details of the student
        return "CollegeName : "+collegeName+"\nStudentName : "+studentName + "\nDepartment : "+department;
    }
}
class week53 {
    public static void main (String[] args) {
        Student  s1 = new Student("REC","Venkatesh","CSE");
        s1.admitted();
        // invoke the admitted() method
        System.out.println(s1.toString());
    }
}