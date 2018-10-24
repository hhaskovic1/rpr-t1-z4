package ba.unsa.etf.cetvrti;

public class Main {
    public static void main(String[] args) {
        //studenti
        Student s = new Student("Hasan","Haskovic",17717);

        Student s1 = new Student("Sara","Sarac",172810);

        Predmet p =new Predmet("MLTI",9,10);

        p.upisiStudenta(s);

        p.upisiStudenta(s1);

        p.ispisiStudenta(s1);

        System.out.println(p);
        //p=null;
        //s=null;
        //s1=null;
        System.exit(0);

    }
}
