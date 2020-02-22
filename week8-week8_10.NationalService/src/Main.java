public class Main {
    public static void main(String[] args) {
        CivilService r = new CivilService();
        System.out.println(r.getDaysLeft());
        r.work();
        r.work();
        System.out.println(r.getDaysLeft());
        
        MilitaryService r2 = new MilitaryService(500);
        System.out.println(r2.getDaysLeft());
        r2.work();
        r2.work();
        System.out.println(r2.getDaysLeft());
    }
}
