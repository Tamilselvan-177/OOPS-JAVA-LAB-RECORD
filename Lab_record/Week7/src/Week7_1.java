import java.util.Scanner;
interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);

}
interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);

}
class College implements football {
    String homeTeam;
    String visitingTeam;

    public void setHomeTeam(String name){
        this.homeTeam = name;

    }
    public void setVisitingTeam(String name){
        visitingTeam = name;
    }
    public void homeTeamScored(int points){
        System.out.println(homeTeam+" "+points+" scored");
    }
    public void visitingTeamScored(int points){
        System.out.println(visitingTeam+" "+points+" scored");
    }
    public void winningTeam(int p1, int p2){
        if(p1>p2)
            System.out.println(homeTeam+" is the winner!");
        else if(p1<p2)
            System.out.println(visitingTeam+" is the winner!");
        else
            System.out.println("It's a tie match.");
    }
}
class prog{
    public static void main(String[] args){
        String hname;
        Scanner sc= new Scanner(System.in);
        hname= sc.nextLine();
        String  vteam=sc.next();
        int htpoints= sc.nextInt();
        int vtpoints= sc.nextInt();
        College s= new College();
        s.setHomeTeam(hname);
        s.setVisitingTeam(vteam);
        s.homeTeamScored(htpoints);
        s.visitingTeamScored(vtpoints);
        s.winningTeam(htpoints,vtpoints);

    }
}