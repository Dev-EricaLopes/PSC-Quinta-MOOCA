
import javax.swing.JOptionPane;
/**
 *
 * @author erica
 */
public class ExemploFor {
    public static void main(String[] args)
    {
        double nota1, nota2;
        
    //  for(contador;condição;incremento/decremento)
        for(int i=1; i <= 5; i++)
        {
            System.out.println(i);
        nota1 = Double.parseDouble
        (JOptionPane.showInputDialog("Digite a nota 1"));
        nota2 = Double.parseDouble
        (JOptionPane.showInputDialog("Digite a nota 2"));
        
        JOptionPane.showMessageDialog
        (null, "Média: " + (nota1 + nota2) / 2);
        }
        System.out.println("* * * FIM  DO PROGRAMA * * *");
    }  
}
