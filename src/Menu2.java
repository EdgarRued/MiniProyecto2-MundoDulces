import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Container;
import javax.swing.JOptionPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Menu2 extends JFrame implements ActionListener ,ItemListener {
    Container contenedor;
    TextField text,campo,camp2;
    JComboBox combo;
    Categoria dato;
    JButton action;
    String n,naux;
    int values,cont;
    
    public Menu2(Base objeto){
        
        contenedor=getContentPane();
        setLocation(450,200);

        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 1, 20, 20));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(1,25,25));
        JLabel asd = new JLabel("Nombre del dulce a actualizar");
        panel.add(asd);
         text = new TextField(10);
        panel.add(text);
        JButton boton = new JButton("Aceptar");

        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                
                String aux=text.getText();
                int p = objeto.ObtenerDelArreglo(aux);
                String pib = objeto.prueba();
                    System.out.println(pib);
                
                if (p==1){
                    dispose();
                    Menu2aux auxiliar = new Menu2aux(objeto);
                    
            
        }else if(p==2){
            JOptionPane.showMessageDialog(contenedor,"no se encontro el dulce");
            dispose();
            App obj = new App();
        }
    }
            
}); 
        panel.add(boton);

        contenedor.add(panel);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}
