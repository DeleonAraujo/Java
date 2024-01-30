package operacoesbasicas;

import javax.swing.JOptionPane;

public class SomarSubtrair {

    public void SomarSubtrair () {
        Somar s = new Somar(1);
        JOptionPane.showMessageDialog(null, "O valor da soma de dois doubles é: "
                +s.somarDoisDoubles(2.4, 2.6));
    }
}
