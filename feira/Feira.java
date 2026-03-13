package feira;

public class Feira {
    
public static void main(String[] args) {
    
    Cliente cliente = new Cliente();
    cliente.setatacado(true);
    cliente.setvarejo(true);

    Manga manga = new Manga();
    manga.setpalmer(true);
    manga.setrosa(true);
    manga.setcoquinho(true);

    Uva uva = new Uva();
    uva.setrosada(true);
    uva.setverde(true);
    uva.setsemSemente(true);

    
        System.out.println(cliente.setatacado());
        System.out.println(cliente.setvarejo());
        System.out.println(uva.setrosada());
        System.out.println(uva.setsemsemente());
        System.out.println(uva.setverde());
        System.out.println(manga.palmer());
        System.out.println(manga.rosa());
        System.out.println(manga.coquinho());



        cliente.setatacado();
        cliente.setvarejo();
        manga.setcoquinho(true);
        manga.setpalmer(true);
        manga.setrosa(true);
        uva.setrosada(true);
        uva.setsemSemente(true);
        uva.setverde(true);
    }


}

