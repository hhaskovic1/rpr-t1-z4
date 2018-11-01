package ba.unsa.etf.rpr.tutorijal01;

import static org.junit.jupiter.api.Assertions.*;

public class z4PredmetTest {
    @org.junit.jupiter.api.Test
    public void predmetKonstruktorTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        assertEquals("MLTI 9 10", predmet.getNazivPredmeta() + " " + predmet.getSifraPredmeta() + " " +predmet.getMaxBr());
    }
    @org.junit.jupiter.api.Test
    public void setNazivPredmetaTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        predmet.setNazivPredmeta("IM2");
        assertEquals("IM2 9 10", predmet.getNazivPredmeta() + " " + predmet.getSifraPredmeta() + " " +predmet.getMaxBr());
    }
    @org.junit.jupiter.api.Test
    public void setSifraPredmetaTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        predmet.setSifraPredmeta(7);
        assertEquals("MLTI 7 10", predmet.getNazivPredmeta() + " " + predmet.getSifraPredmeta() + " " +predmet.getMaxBr());
    }
    @org.junit.jupiter.api.Test
    public void getBrojStudenataTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        predmet.setBrojStudenata(5);
        assertEquals(5, predmet.getBrojStudenata());
    }

    @org.junit.jupiter.api.Test
    public void upisiStudentaTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        Student student = new Student("Hasan", "Haskovic", 17717);
        predmet.upisiStudenta(student);
        assertEquals(1, predmet.getBrojStudenata());
    }
    @org.junit.jupiter.api.Test
    public void ispisiStudentaTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        Student student1 = new Student("Hasan", "Haskovic", 17717);
        Student student2 = new Student("Meho", "Mehic", 17777);
        predmet.upisiStudenta(student1);
        predmet.upisiStudenta(student2);
        predmet.ispisiStudenta(student1);
        assertEquals(1, predmet.getBrojStudenata());
    }
    @org.junit.jupiter.api.Test
    public void toStringTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        Student student = new Student("Hasan", "Haskovic", 17717);
        predmet.upisiStudenta(student);
        predmet.toString();
        assertEquals("1. Haskovic Hasan (17717)"+"\n", predmet.toString());

    }
    @org.junit.jupiter.api.Test
    public void getNazivPredmetaTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        assertEquals("MLTI", predmet.getNazivPredmeta());
    }
    @org.junit.jupiter.api.Test
    public void getMax_BrTest() {
        Predmet predmet =new Predmet("MLTI",9,10);
        assertEquals(10, predmet.getMaxBr());
    }
}