import javax.swing.*;

public class Main {
    /*
    * Vinicius Komninakis De Souza - 3017108746
    * Maycon F. Neto - 
    *
    * */

    public static void main(String[] args) {
        int resposta = 0;
        while (resposta == JOptionPane.YES_OPTION) {
            int errou = 0;
            Palavra palavra = new Palavra();
            String p = JOptionPane.showInputDialog("Digite a palavra a ser descoberta").toLowerCase();
            palavra.setPalavraChave(p);
            String v = palavra.getPalavraChave();
            char desenhaPalavra[] = new char[v.length()];
            Jogo jogo = new Jogo();
            int acertou = jogo.getAcertou();
            //quantidade de letras + 5 por conta do boneco desenhado, em toeria hihih
            jogo.setTentativas(v.length() + 5);
            int tentativas = jogo.getTentativas();

            //criando segredo palavra no console;
            for (int y = 0; y < v.length(); y++) {
                desenhaPalavra[y] = '_';
            }
            //desenhando palavra
            for (int i = 0; i < desenhaPalavra.length; i++) {
                System.out.print(desenhaPalavra[i]);
            }
            System.out.print("\n");
            JOptionPane.showMessageDialog(null, "Começando o jogo...");
            for (int j = 0; j < tentativas; j++) {

                String l = JOptionPane.showInputDialog("Digite sua letra:").toLowerCase();
                //mudando a letra de string para char
                char letra = l.charAt(0);
                for (int f = 0; f < v.length(); f++) {
                    if (v.charAt(f) == letra) {
                        desenhaPalavra[f] = letra;
                        char apresenta[] = desenhaPalavra;
                        System.out.print(apresenta);
                        System.out.print("\n");
                        acertou++;
                    }
                }
                errou++;
                if (errou == 5) {
                    String chuteUsuario = JOptionPane.showInputDialog("Suas chances acabaram, chute uma palavra..");
                    if (chuteUsuario.equals(v)) {
                        JOptionPane.showMessageDialog(null, "Parabens, você acertou! A palavra certa era: " + v);
                        System.exit(0);
                    } else {
                       JOptionPane.showMessageDialog(null, "Você perdeu... Boa sorte na próxima =)");
                        break;
                    }
                }
                if (acertou == v.length()) {
                    JOptionPane.showMessageDialog(null, "Você ganhouuu!!!! A palavra certa era : " + v);
                    System.exit(0);
                }
            }
            resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        }
    }
}

