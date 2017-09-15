public class RankingNinja {
    static public void ranking(Ninja[] ninjas) {
        Ninja[] lista = ninjas.clone();
        int maior;
        Ninja aux;

        for (int i=0; i < lista.length; i++) {
            maior = i;

            for (int j=i+1; j < lista.length; j++) {
                if (lista[j].getPontos() > lista[maior].getPontos()) {
                    maior = j;
                }
            }

            aux = lista[i];
            lista[i] = lista[maior];
            lista[maior] = aux;
        }

        System.out.println("*** RANKING DOS NINJAS ***");
        for (Ninja ninja: lista) {
            System.out.println(ninja.getNome() + " => " + ninja.getPontos() + " pontos!");
        }

    }
}