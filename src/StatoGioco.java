public class StatoGioco {
	static int numeroMarziani= 0, numeroTerrestri= 0;

    static void incMarziani(){
        numeroMarziani++;
    }

    static void incTerrestri(){
        numeroTerrestri++;
    }

    static int numMarzianiinGioco(){
        return numeroMarziani;
    }

    static int numTerrestriinGioco(){
        return numeroTerrestri;
    }
}
