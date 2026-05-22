// Guia interativo via pop-ups que ensina passo a passo como fazer uma limonada gelada.
import javax.swing.JOptionPane;

public class OlaMundoPopus {
    public static void main(String[] args) {

        int escolha = JOptionPane.showConfirmDialog(null, "Vamos fazer uma limonada gelada??",
        "COMO FAZER UMA LIMONADA GELADA", JOptionPane.YES_OPTION);

        if (escolha == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "AEEE, vamos começar pegando os ingredientes." );
        } else{
            JOptionPane.showMessageDialog(null, "SAIA DESSE PROGRAMA AGORA!!!!!");
        }

        JOptionPane.showMessageDialog(null,"Pegue a quantidade de limões necessárias.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Pegar uma faca.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Cortar os limões ao meio.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Pegar o espremedor.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Expremer os meios limões no expremedor.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Pegue uma jarra.", "COMO FAZER UMA LIMONADA GELADA", 
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Despejar o suco do expremedor na jarra.", "COMO FAZER UMA LIMONADA GELADA", 
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Pegar a água, de preferência gelada.", "COMO FAZER UMA LIMONADA GELADA", 
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Colocar a quantidade desejada na jarra.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"Pegar o açucar.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Pegar uma colher.","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Com a colher, adicione o açucar .","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Misture TUDOOO!","COMO FAZER UMA LIMONADA GELADA",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Adicione o gelo.", "COMO FAZER UMA LIMONADA GELADA", 
        JOptionPane.INFORMATION_MESSAGE);

        int escolh = JOptionPane.showConfirmDialog(null, "FIMM! Conseguiu finalizar?",
        "COMO FAZER UMA LIMONADA GELADA", JOptionPane.YES_OPTION);

        if (escolh == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "AEEE, agora aprecie a sua limonada gelada!." );
        } else{
            JOptionPane.showMessageDialog(null, "Mas bah, refaça TUDO DE NOVO!");
        }
    }
}