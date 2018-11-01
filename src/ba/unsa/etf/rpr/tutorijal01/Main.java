package ba.unsa.etf.rpr.tutorijal01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Predmet[] predmeti = new Predmet[50];
        Student[] studenti = new Student[50];
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int x = 0;
        int i = 0;
        int j = 0;
        System.out.println("Izaberite opciju: ");
        do {
            System.out.println("1 - Kreiraj predmet");
            System.out.println("2 - Kreiraj studenta");
            System.out.println("3 - Upisi studenta na predmet");
            System.out.println("4 - Ispisi studenta sa predmeta");
            System.out.println("5 - Obrisi studenta");
            System.out.println("6 - Spisak studenata na predmetu");
            System.out.println("0 - Prekini program");

            x = scanner.nextInt();

            if(x==1) {
                System.out.println("Unesite naziv, sifru predmeta i maksimalan broj studenata na predmetu");
                String naziv = s.nextLine();
                int sifra = scanner.nextInt();
                int max = scanner.nextInt();
                predmeti[i] = new Predmet(naziv,sifra,max);

                System.out.println("Kreiran predmet " + naziv);
                i++;
            }

            else if(x==2) {
                System.out.println("Unesite ime, prezime i broj indeksa studenta");
                String ime = s.nextLine();
                String prezime = s.nextLine();
                int index = scanner.nextInt();
                studenti[j] = new Student(ime,prezime,index);
                System.out.println("Kreiran student " + ime + " " + prezime);

                j++;

            }

            else if(x==3) {

                System.out.println("Unesite sifru predmeta: ");
                int sifra= scanner.nextInt();
                int pamti = 0;

                for(int k=0; k<i; k++) {
                    if(sifra==predmeti[k].getSifraPredmeta()) {
                        pamti=k;
                        break;
                    }
                }
                System.out.println("Unesite broj indeksa: ");
                int index = scanner.nextInt();
                for(int k=0; k<j; k++) {
                    if(index==studenti[k].getIndex()) {
                        predmeti[pamti].upisiStudenta(studenti[k]);
                        System.out.println("Student " + studenti[k].getIme() + " " + studenti[k].getPrezime() + " je upisan na predmet " + predmeti[pamti].getNazivPredmeta());
                        break;
                    }
                    else if(predmeti[pamti].getBrojStudenata()>=predmeti[pamti].getMaxBr()) {
                        System.out.println("Predmet je popunjen");
                    }
                }



            }

            else if(x==4) {

                System.out.println("Unesite sifru predmeta: ");
                int sifra= scanner.nextInt();
                int pamti = 0;

                for(int k=0; k<i; k++) {
                    if(sifra==predmeti[k].getSifraPredmeta()) {
                        pamti=k;
                        break;
                    }
                }
                System.out.println("Unesite broj indeksa: ");
                int index = scanner.nextInt();
                for(int k=0; k<j; k++) {
                    if(index==studenti[k].getIndex()) {
                        predmeti[pamti].ispisiStudenta(studenti[k]);
                        System.out.println("Student " + studenti[k].getIme() + " " + studenti[k].getPrezime() + " je ispisan sa predmeta " + predmeti[pamti].getNazivPredmeta());
                        break;
                    }

                }
            }

            else if(x==5) {
                System.out.println("Unesite broj indeksa: ");
                int index = scanner.nextInt();
                boolean izbrisan = false;

                for(int k=0; k<j; k++) {
                    if(studenti[k].getIndex()==index) {
                        for(int l=k; l<j; l++) {
                            studenti[k]=studenti[k+1];
                        }
                        izbrisan=true;
                        j--;
                    }
                    if(izbrisan==true) {
                        System.out.println("Student sa brojem indeksa: " + index + " je obrisan");
                        break;
                    }
                }





            }

            else if(x==6) {
                System.out.println("Unesite sifru predmeta: ");
                int sifra= scanner.nextInt();
                for(int k=0; k<i; k++) {
                    if(sifra==predmeti[k].getSifraPredmeta()) {

                        for(int l=0; l<j; l++)
                        {
                            System.out.println(predmeti[l].toString());
                        }
                        break;
                    }
                }


            }


        }while(x!=0);



        System.exit(0);




    }
}
