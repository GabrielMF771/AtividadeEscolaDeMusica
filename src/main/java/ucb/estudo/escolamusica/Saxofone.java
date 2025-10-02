package ucb.estudo.escolamusica;

public class Saxofone extends InstrumentoMusical{
    private String tipo;

    public Saxofone(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;

    }

    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + nome + " " + tipo + "...");
        System.out.println("Melodia envolvente no saxofone");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando emborcadura e as chaves do saxofone");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }
}
