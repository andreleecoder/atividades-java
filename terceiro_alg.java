import javax.swing.*;
class MTAJ {
    public static void main(String entrada[]) {
      //variaveis
      int n1, n2;
      int mod, div;
      double raiz, pot;
      String msg = "";
  
      //entrada de dados
      n1 = Integer.parseInt(entrada[0]);
      n2 = Integer.parseInt(entrada[1]);
  
      //Processamento
      mod = n1 % n2;
      div = (int)n1 / (int)n2;
      raiz = Math.sqrt(n1);
      pot = Math.pow(n1, n2);
  
      //saida resultado
      msg = "n1 ="+ n1 +" n2 = "+ n2 + "\n";
      msg = msg + "resto da divisão de n1 por n2 = " + mod + "\n";
      msg = msg + "quociente da divisão de n1 por n2 = " + div + "\n";
      msg = msg + "raiz quadrada de n1 = "+ raiz + "\n";
      msg = msg + "potencial de n1 e n2 = "+ pot + "\n";
      
      System.out.println(msg);
      System.exit(0);
    }
  }