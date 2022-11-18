import javax.swing.*;

class ProgRepeticao {
  public static void main(String entrada[]) {
    // variaveis
    int Tabuada;
    char op=0;
    String msg = "", msgEntr="Doigite 1 para repeticao for\n 2 para repeticao while\n 3 para repeticao do while";

    // entrada de dados
    Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    // Processamento
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
    if(op>='1' && op<='2')
    {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
 
}