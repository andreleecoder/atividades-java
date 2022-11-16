import javax.swing.*;

class ProgDecisao {
  public static void main(String entrada[]) {
    // variaveis
    int num;
    char op=0;
    String msg = "", msgEntr="Doigite 1 para par/impar \n Digite 2 para positivo/negativo";

    // entrada de dados
    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    op = (JOptionPane.showInputDialog("Digite outro numero inteiro")).charAt(0);

    // Processamento
  switch(op)
  {
    case '1':
      {
        if(num % 2 == 0)
        {
          msg = msg +num + " eh par.\n";
        }
        else
        {
           msg = msg +num +" eh impar.\n";
        }
       break;
      }
    case '2':
      {
        if(num > 0)
        {
          msg = msg +num+ "eh positivo\n";
        }
        else
        {
           msg = msg +num+ " eh nao positivo.\n";
        }
       break;
      }
       default: JOptionPane.showMessageDialog(null, " opcao invalida, calculos nao realizados");
  }

    // saida resultado
    if(op=='1' || op=='2')
    {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
 
}