package AppMusica.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificaco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public void setCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClassificaco() {
        return classificaco;
    }

    public void setClassificaco(int classificaco) {
        this.classificaco = classificaco;
    }

    public void curte (){
        this.totalCurtidas++;
    }

    public void reproduz (){
        this.totalDeReproducoes++;
    }
}
