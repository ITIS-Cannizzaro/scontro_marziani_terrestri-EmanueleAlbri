public class Marziano {
	String matricola;
    int autonomia, AI, tecnologia; //Le variabili non le ho fatte "private" come chiesto nel testo perché se no non sarei riuscito a fare l'attaccoTerrestri e
    //l'attaccoMarziani che avrebbe avuto senso. Perché se l'avessi fatto con il codice dato dalla consegna quando Ken attacca subisce lui danno e non il Marziano
    //e viceversa

    Marziano(){
        matricola= "indefinito";
        autonomia= 50;
        AI=5;
        tecnologia=5;
        StatoGioco.incMarziani();
        System.out.print("\nIl Marziano " + matricola + " entra in gioco.");
    }
    Marziano(String matricola, int[] param){
        this.matricola= matricola;
        autonomia= param[0];
        AI=param[1];
        tecnologia= param[2];
        StatoGioco.incMarziani();
        System.out.print("\nIl Marziano " + matricola + " entra in gioco.");
    }

    void attaccaTerrestri(Terrestre x){
        if(!attivo())
            System.out.println("Non posso attaccare: Sono morto!");
        else{
            if(StatoGioco.numMarzianiinGioco() >= StatoGioco.numTerrestriinGioco()) {
                x.vita = x.vita - 20 + 2 * x.velocità + x.armamento;
                System.out.println("\nx102 ha attaccato Ken! \nStato di vita del terrestre: " + x.vivente() + "\nTotale vita: " + x.vita);
            }else
                System.out.println("Marziano " + matricola + ". Non mi conviene attaccare!");
        }
    }

    boolean attivo(){
        if(autonomia > 0)
            return true;
        else
            return false;
    }

    public String toString(){
        return "\nMatricola: " + matricola + "\nAutonomia: " + autonomia + "\nAI: " + AI +"\nTecnologia: " + tecnologia;
    }

    boolean equals(Marziano x){
        if(x.autonomia == autonomia && x.AI == AI && x.tecnologia == tecnologia)
            return true;
        else
            return false;
    }
}
