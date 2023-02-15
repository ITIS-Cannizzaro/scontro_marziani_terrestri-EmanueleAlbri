public class GiocoBattaglia {
	public static void main(String[] args){
        System.out.println("IL GIOCO BATTAGLIA HA INIZIO!");
        Marziano m1= new Marziano();
        Terrestre t1= new Terrestre();
        Marziano m2= new Marziano();
        Terrestre t2= new Terrestre();

        int[] paramM= {50, 5, 5};
        int[] paramT= {75, 10, 6};
        Marziano x102= new Marziano("x102", paramM);
        Terrestre ken= new Terrestre("Ken", paramT);
        Marziano x104= new Marziano("x104", paramM);
        Terrestre aziz= new Terrestre("Aziz", paramT);

        System.out.println("\nConfronto fra i 2 terrestri: ");
        if(t1.equals(ken) == true)
            System.out.println("I due terrestri hanno le stesse potenzialità offensive!");
        else
            System.out.println("I due terrestri non hanno le stesse potenzialità offensive!");

        System.out.println("Confronto fra i 2 marziani: ");
        if(m1.equals(x102) == true)
            System.out.println("I due marziani hanno le stesse potenzialità offensive!");
        else
            System.out.println("I due marziani non hanno le stesse potenzialità offensive!");

        ken.toString();
        x102.toString();

        for(int i= 0; i < 2; i++){
            ken.attaccaMarziani(x102);
            x102.attaccaTerrestri(ken);
        }
        System.out.println("IL GIOCO È TERMINATO!");
    }
}
