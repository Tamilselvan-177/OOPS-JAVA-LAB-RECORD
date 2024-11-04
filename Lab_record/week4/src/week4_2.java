class week4_2 {
    private String name;
    private int rollNo;
    public week4_2(){
        System.out.println("No-arg constructor is invoked");
        this.name = null;
        this.rollNo=0;
    }
    public week4_2(String name){
        System.out.println("1 arg constructor is invoked");
        this.name = name;
        this.rollNo=0;
    }
    public week4_2(String name, int rollNo){
        System.out.println("2 arg constructor is invoked");
        this.name = name;
        this.rollNo = rollNo;
    }
    public void display(){
        System.out.println("Name ="+name+" , Roll no = "+rollNo);
    }
    public static void main(String[] args){
        week4_2 student1 = new week4_2();
        week4_2 student2 = new week4_2("Rajalakshmi");
        week4_2 student3 = new week4_2("Lakshmi",101);
        student1.display();
        student2.display();
        student3.display();
    }
}