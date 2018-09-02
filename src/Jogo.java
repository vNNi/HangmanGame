public class Jogo {

    private int tentativas;
    private int quantidadeErros;
    private int acertou=0;

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getQuantidadeErros() {
        return quantidadeErros;
    }

    public void setQuantidadeErros(int quantidadeErros) {
        this.quantidadeErros = quantidadeErros;
    }

    public int getAcertou() {
        return acertou;
    }

    public void setAcertou(int i) {
        this.acertou = i;
    }
}
