package ba.unsa.etf.rpr.tutorijal01;

public class Student {
    private String ime,prezime;
    private int indeks;

    public Student(String ime,String prezime,int indeks) {
        this.ime=ime;
        this.prezime=prezime;
        this.indeks=indeks;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime=ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime=prezime;
    }
    public int getIndex() {
        return indeks;
    }
    public void setIndex(int indeks) {
        this.indeks=indeks;
    }
    @Override
    public String toString() {
        return prezime +" "+ ime + " (" + indeks + ")";
    }


}