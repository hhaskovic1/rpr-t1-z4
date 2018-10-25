package ba.unsa.etf.cetvrti;

public class Predmet {
    private String nazivPredmeta;
    private int sifraPredmeta, brojStudenata;
    private final int maxBr;
    private Student [] nizStudenata = null;

    public Predmet (String nazivPredmeta, int sifraPredmeta, int maxBr) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.brojStudenata = 0;
        this.maxBr = maxBr;
        nizStudenata=new Student[50];
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta (String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public void setSifraPredmeta (int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    public int getBrojStudenata() {
        return brojStudenata;
    }
    public void setBrojStudenata (int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }
    public int getMaxBr() {
        return maxBr;
    }
    public void upisiStudenta(Student s){
        if(brojStudenata<maxBr){
            nizStudenata[brojStudenata]=s;
            brojStudenata++;
        }
    }
    public void ispisiStudenta(Student s){
        for(int i=0;i<brojStudenata-1;i++) {
            for(int j=i+1;j<brojStudenata;j++) {
                if(s.getIndex()==nizStudenata[i].getIndex())nizStudenata[i]=nizStudenata[j];
            }
        }
        brojStudenata--;
    }
    @Override
    public String toString() {
        String s="";
        for(int i=0;i<brojStudenata;i++)s+= (i+1)+". " + nizStudenata[i].getPrezime() + " " + nizStudenata[i].getIme() + " (" + nizStudenata[i].getIndex() + ")" + "\n";
        return s;
    }
}
