public class Terrestre {
	String nome;
    int vita, velocità, armamento;//Le variabili non le ho fatte "private" come chiesto nel testo perché se no non sarei riuscito a fare l'attaccoTerrestri e
    //l'attaccoMarziani che avrebbe avuto senso. Perché se l'avessi fatto con il codice dato dalla consegna quando Ken attacca subisce lui danno e non il Marziano
    //e viceversa

    Terrestre(){
        nome="sconosciuto";
        vita=50;
        velocità=5;
        armamento=5;
        StatoGioco.incTerrestri();
        System.out.print("\nIl Terrestre " + nome + " entra in gioco");
    }

    Terrestre(String nome, int[] param){
        this.nome= nome;
        vita= param[0];
        velocità= param[1];
        armamento= param[2];
        StatoGioco.incTerrestri();
        System.out.print("\nIl Terrestre " + nome + " entra in gioco");
    }

    void attaccaMarziani(Marziano x){
        if(!vivente())
            System.out.println("Non posso attaccare: Sono morto!");
        else{
            if(StatoGioco.numMarzianiinGioco() <= StatoGioco.numTerrestriinGioco()) {
                x.autonomia = x.autonomia - 20 + 2 * x.AI + x.tecnologia;
                System.out.println("\nKen ha attaccato x102! \nStato di vita del marziano: " + x.attivo() + "\nAutonomia: " + x.autonomia);
            }else
                System.out.println("Terrestre " + nome + ". Non mi conviene attaccare!");
        }
    }

    boolean vivente(){
        if(vita > 0)
            return true;
        else
            return false;
    }

    public String toString(){
        return "\nNome: " + nome + "\nVita: " + vita + "\nVelocità: " + velocità + "\nArmamento: " + armamento;
    }

    boolean equals(Terrestre x){
        if(x.vita == vita && x.velocità == velocità && x.armamento == armamento)
            return true;
        else
            return false;
    }
}
