package ba.unsa.etf.rpr.tutorijal01;

import static org.junit.jupiter.api.Assertions.*;

public class z4StudentTest {
    @org.junit.jupiter.api.Test
    public void studentKonstruktorTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        assertEquals("Haskovic Hasan (17717)", student.toString());
    }

    @org.junit.jupiter.api.Test
    public void getImeTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        assertEquals("Hasan", student.getIme());
    }

    @org.junit.jupiter.api.Test
    public void setImeTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        student.setIme("Meho");
        assertEquals("Haskovic Meho (17717)", student.toString());
    }

    @org.junit.jupiter.api.Test
    public void getPrezimeTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        assertEquals("Haskovic", student.getPrezime());
    }

    @org.junit.jupiter.api.Test
    public void setPrezimeTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        student.setPrezime("Mehic");
        assertEquals("Mehic Hasan (17717)", student.toString());
    }

    @org.junit.jupiter.api.Test
    public void getIndexTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        assertEquals(17717, student.getIndex());
    }

    @org.junit.jupiter.api.Test
    public void setIndexTest() {
        Student student = new Student("Hasan", "Haskovic", 17717);
        student.setIndex(71171);
        assertEquals(71171, student.getIndex());
    }

}