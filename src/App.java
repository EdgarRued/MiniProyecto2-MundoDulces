import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;



import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener, ItemListener {
        Container contenedor,c2,c3,c4,c5,c6;
        JTextArea kasd= new JTextArea();
        
        FlowLayout flowLayout;
        GridLayout gridLayout;
        
        
        
        ArrayList <JButton> lista;
        JButton  b1,b2,b3,b4,b5,b6;
        
        
    public  App(ArrayList<Dulce> base, Base beos) {
        contenedor= getContentPane();
        setLocation(400,200);
        setTitle("Mundo Dulces");
       gridLayout= new GridLayout(1,3, 30,30);
       contenedor.setLayout(gridLayout);
       JPanel panelmain = new JPanel();
       JLabel labelL, labelR;
       labelL = new JLabel("");
       contenedor.add(labelL);
       labelR = new JLabel("");
       panelmain.setLayout(new FlowLayout(1, 5,10));
       JLabel labelMain = new JLabel("De click en la opcion deseada...");
       panelmain.add(labelMain);

       
       
       b1= new JButton("Ingresar Dulces");
       b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            
            Menu1 menu = new Menu1(base,beos);
        }
        
       });
       panelmain.add(b1);

       b2= new JButton("Actualizar Dulce");
       b2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

            Menu2 menu2 = new Menu2(base,beos);
        }
        
       });
       panelmain.add(b2);
       b3= new JButton("Eliminar Dulce");
       b3.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            Menu3 menu3 = new Menu3(base,beos);
        }
        
       });
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
       setSize(650, 300);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       setVisible(true);

    }

   

   
    
    
    public void actionPerformed(ActionEvent e) {
       
        
        if (e.getSource()==b1){
          
        }
        if (e.getSource()==b2){
            
        }
        
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
    }
    
}
