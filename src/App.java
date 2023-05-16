import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener, ItemListener {
        Container contenedor,c2,c3,c4,c5,c6;
        TextField campo,camp2;
        FlowLayout flowLayout;
        GridLayout gridLayout;
        Categoria dato;
        
        BorderLayout borderLayout;
        ArrayList <JButton> lista;
        JButton  b1,b2,b3,b4,b5,b6;
        
        
    public  App() {
        contenedor= getContentPane();
        
       gridLayout= new GridLayout(1,3, 30,30);
       contenedor.setLayout(gridLayout);
       JPanel panelmain = new JPanel();
       JLabel labelL, labelR;
       labelL = new JLabel("");
       contenedor.add(labelL);
       labelR = new JLabel("");
       panelmain.setLayout(new GridLayout(7,1));
       JLabel labelMain = new JLabel("De click en la opcion deseada...");
       panelmain.add(labelMain);

       
       
       b1= new JButton("Ingresar Dulce");
       b1.addActionListener(this);
       panelmain.add(b1);
       b2= new JButton("Actualizar Dulce");
       b2.addActionListener(this);
       panelmain.add(b2);
       b3= new JButton("Eliminar Dulce");
       b3.addActionListener(this);
       panelmain.add(b3);
       b4= new JButton("Buscar Dulce ");
       b4.addActionListener(this);
       panelmain.add(b4);
       b5= new JButton("Listar todos los dulces");
       b5.addActionListener(this);
       panelmain.add(b5);
       b6= new JButton("Resumen de dulces");
       b6.addActionListener(this);
       panelmain.add(b6);
       contenedor.add(panelmain);
       contenedor.add(labelR);
       setSize(700, 700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       setVisible(true);

    }

   

   
    
    
    public void actionPerformed(ActionEvent e) {
       
        
        if (e.getSource()==b1){
            dispose();
            
            Menu1 menu = new Menu1();
        }
        
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
    }
    
}
