package calculos;

import javax.swing.JOptionPane;

public abstract class Impressao {
    
    public void testeImpressao(){
        JOptionPane.showMessageDialog(null, 
                "Este é o teste de impressãodo método testeImpressao()!");
    }
    
    public abstract void imprimirResultado();
}