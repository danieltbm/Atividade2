package Visao;

import javax.swing.JOptionPane;

import Modelagem.Estudante;

public class InterfaceUsuario {
    public static void main(String[] args) {
        // Solicitando ao usuário o número de estudantes a serem cadastrados
        String input = JOptionPane.showInputDialog("Quantos estudantes você deseja cadastrar?");
        int numEstudantes = Integer.parseInt(input);

        Estudante filaEstudantes = new Estudante(numEstudantes);

        // Incluindo estudantes na fila usando JOptionPane
        for (int i = 0; i < numEstudantes; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do estudante " + (i + 1) + ":");
            filaEstudantes.incluirNaFila(nome);
        }

        // Mostrando os estudantes da fila
        filaEstudantes.mostrarFila();
    }
}
