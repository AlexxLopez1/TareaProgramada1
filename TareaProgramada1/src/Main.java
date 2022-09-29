import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tiempoLaboral = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos años lleva en la empresa: "));
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario en dólares: "));
        int salarioB;

        if (tiempoLaboral >= 10){
            salarioB = (int) ((salario*0.20)+(salario));
        }
        else{
            salarioB = (salario);
        }

        if ((salarioB >= 1000) && (salarioB < 2000)){
            salarioB = (int) (salarioB-(salarioB*0.10));
        }

        if (salarioB >= 2000){
            salarioB = (int) (salarioB-(salarioB*0.15));
        }

        JOptionPane.showMessageDialog(null, "Su salario bruto es de : $" +salario);
        JOptionPane.showMessageDialog(null, "Su salario con deducciones y bono aplicado es de: $"+salarioB);
    }
}
