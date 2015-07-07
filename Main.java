
public class Main {

    public static void main(String[] args) {

        //Liga
        Liga Indonesia = new Liga("Indonesia");
        Liga spanyol = new Liga("Spanyol");

        //Divisi
        Divisi serieA = new Divisi("Serie A",Indonesia);
        Divisi serieB = new Divisi("Serie B",Indonesia);
        Divisi divisi1 = new Divisi("Divisi1",spanyol);
        Divisi divisi2 = new Divisi("Divisi2",spanyol);

        //Klub
        Klub Arema = new Klub("Arema Malang",serieA,Indonesia);
        Klub Persija = new Klub("Persija Jakarta",serieA,Indonesia);
        Klub Persela = new Klub("Persela Lamongan",serieB,Indonesia);
        Klub SriwijayaFC = new Klub("SriwijayaFC Palembang",serieB,Indonesia);
        Klub real = new Klub("Real Madrid",divisi1,spanyol);
        Klub barca = new Klub("Barcelona",divisi1,spanyol);
        Klub villa = new Klub("Villareal",divisi2,spanyol);
        Klub espanyol = new Klub("Espanyol",divisi2,spanyol);

        Indonesia.setDaftarDivisi(serieA);
        Indonesia.setDaftarDivisi(serieB);
        spanyol.setDaftarDivisi(divisi1);
        spanyol.setDaftarDivisi(divisi2);

        serieA.setDaftarKlub(Arema);
        serieA.setDaftarKlub(Persija);
        serieB.setDaftarKlub(Persela);
        serieB.setDaftarKlub(SriwijayaFC);
        divisi1.setDaftarKlub(real);
        divisi1.setDaftarKlub(barca);
        divisi2.setDaftarKlub(villa);
        divisi2.setDaftarKlub(espanyol);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomer 1 :");
        System.out.println("Divisi Liga Indonesia : ");
        Indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomer 2 :");
        System.out.println("Klub Liga Indonesia : ");
        serieA.getDaftarKlubLiga("Indonesia");
        System.out.println("Liga Spanyol : ");
        divisi1.getDaftarKlubLiga("Spanyol");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomer 3 :");
        System.out.println("Serie A : ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Serie B : ");
        serieB.getDaftarKlubDivisi("Serie B");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomer 4 :");
        Arema.getDivisi("Arema Malang");
        real.getDivisi("Real Madrid");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomer 5 :");
        Arema.getLiga("Arema Malang");
    }
}

