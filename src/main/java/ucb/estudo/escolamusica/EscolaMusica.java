package ucb.estudo.escolamusica;

public class EscolaMusica {
    public static void main(String[] args) {
        System.out.println("Iniciar a Orquestra");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new Bateria("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new Saxofone("Saxofone", "Latão", "Alto");

        EscolaMusica em = new EscolaMusica();

        em.apresentar(banda);
    }

    private void apresentar(InstrumentoMusical[] banda) {
        System.out.println("=== A ORQUESTRA VAI COMEÇAR ===\n");

        System.out.println("--- Afinando todos os Instrumentos ---");

        for(InstrumentoMusical instrumento : banda){
            instrumento.afinar();
        }

        System.out.println("--- Instrumentos Começam a Tocar ---");
        for(InstrumentoMusical instrumento : banda){
            instrumento.tocar();
        }

        System.out.println(" --- Mostrando Informações dos Instrumentos---");
        for(int i = 0 ; i < banda.length ; i++){
            System.out.println("Instrumento musical " + (i + 1) + " : ");
            banda[i].mostrarInformacoes();
            banda[i].tocar();
            System.out.println();

        }
    }
}
