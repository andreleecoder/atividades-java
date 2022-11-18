import javax.swing.*;

class AlgTabuada {
  public static void main(String entrada[]) {
    // variaveis
    int Tabuada;
    char op=0;
    String msg = "", msgEntr="Doigite 1 para repeticao for\n 2 para repeticao while\n 3 para repeticao do while";

    // entrada de dados
    Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

    // Processamento
   
  switch(op)
  {
    case '1':
      {
        msg = msg +"Tabuada do"+Tabuada+"pelo for: \n\n";
        for(int i=1; i<=10; i=i+1)
          {
           msg= msg +Tabuada+"x" + i +"="+Tabuada*i +"\n";
          }
       break;
      }
      case '2':
      {
        msg = msg+"Tabuada do"+Tabuada+"pelo while \n\n";
          int i = 1;
            while(i<=10);
          {
           msg=msg +Tabuada+"x" +i+"="+Tabuada*i +"\n";
          }
       break;
      }
      case '3':
      {
        msg = msg +"Tabuada do"+Tabuada+"pelo do/while \n\n";
         int i = 1;
          do
          {
           msg=msg +Tabuada+"x" +i+"="+Tabuada*i+"\n";
          } while(i<=10);
        
       break;
      }
default: JOptionPane.showMessageDialog(null, " opcao invalida, calculos nao realizados");
  }
    // saida resultado
    if(op>='1' && op<='3')
    {
      JOptionPane.showMessageDialog(null, msg);
    }
    System.exit(0);
  }
  }

 
