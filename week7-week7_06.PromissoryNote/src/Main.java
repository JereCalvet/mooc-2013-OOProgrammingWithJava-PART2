/*
Tema: Variables primitivas o originales en hashMap
*/
public class Main {
    public static void main(String[] args) {
        PromissoryNote listaDePagare = new PromissoryNote();
        listaDePagare.setLoan("jere", 100.3);
        listaDePagare.setLoan("Agustin", 3392.17);
        
        System.out.println(listaDePagare.howMuchIsTheDebt("Jere"));
    }
}
