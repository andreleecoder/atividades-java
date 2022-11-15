import javax.swing.*;

class AtividadePratica {
  public static void main(String entrada[]) {
    // variaveis
    int n1, n2, div;
    double pot;
    String msg = "";

    // entrada de dados
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

    // Processamento
    div = (int) n1 / (int) n2;
    pot = Math.pow(n1, n2);

    // saida resultado
    msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
    msg = msg + "A potencia " + n1 + " por " + n2 + " = " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.out.println(msg);
    System.exit(0);
  }
}