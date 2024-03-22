package Modelagem;

import javax.swing.JOptionPane;

public class Estudante {
    int inicio;
    int fim;
    int tamanho;
    int quantidadePessoas;
    String F[];

    public Estudante(int numEstudantes) {
        inicio = fim = -1;
        tamanho = numEstudantes;
        F = new String[tamanho];
        quantidadePessoas = 0;
    }

    public boolean estaVazia() {
        return quantidadePessoas == 0;
    }

    public boolean estaCheia() {
        return quantidadePessoas == tamanho;
    }

    public void incluirNaFila(String nome) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            F[fim] = nome;
            quantidadePessoas++;
        }
    }

    public void mostrarFila() {
        String pessoas = "Estudantes na fila:\n";
        for (int i = inicio; i <= fim; i++) {
            pessoas += F[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, pessoas);
    }
}
