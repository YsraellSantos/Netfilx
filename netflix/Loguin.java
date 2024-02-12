package ex05.netflix;

import javax.swing.JOptionPane;

public class Loguin {
    private String email;
    private String senha;

    private void emailLoguin() {
        do {
            email = JOptionPane.showInputDialog(null, "Digite seu email", "Netflix", JOptionPane.QUESTION_MESSAGE);
            if (email == null || !email.contains("@gmail.com")) {
                JOptionPane.showMessageDialog(null, "Email inválido. Por favor, insira seu email novamente. (Ex: '@gmail.com')", "Email Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (email == null || !email.contains("@gmail.com"));
    }

    private void senhaLoguin() {
        do {
            senha = JOptionPane.showInputDialog(null, "Digite sua senha", "Netflix", JOptionPane.QUESTION_MESSAGE);
            if (senha == null || senha.length() < 6) {
                JOptionPane.showMessageDialog(null, "Senha incorreta. Por favor, insira uma senha com pelo menos 6 caracteres.", "Senha de Acesso",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (senha == null || senha.length() < 6);
        JOptionPane.showMessageDialog(null, "Email e senha válidos. Seja muito bem-vindo ao Netflix!", "Netflix", JOptionPane.INFORMATION_MESSAGE);
    }

    public void enviarAcceso() {
        emailLoguin();
        senhaLoguin();
    }
}

