import java.util.Scanner;

interface Playable {
    void play();
}
class football implements Playable {
    String name;

    public football(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name + " is Playing football");
    }
}

class Volleyball implements Playable {
    String name;
    public Volleyball(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name + " is Playing volleyball");
    }
}

class Basketball implements Playable {
    String name;
    public Basketball(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println(name + " is Playing basketball");
    }
}

class week72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        football foot = new football(name);
        name = scan.nextLine();
        Volleyball volley = new Volleyball(name);
        name = scan.nextLine();
        Basketball basket = new Basketball(name);
        foot.play();
        volley.play();
        basket.play();
    }
}
