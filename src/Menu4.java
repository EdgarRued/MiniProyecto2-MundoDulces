import java.awt.Container;

import javax.swing.JOptionPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Menu4 extends JFrame {
    Container contenedor;
    TextField text,campo,camp2;
    JComboBox combo;
    Categoria dato;
    JButton action;
    String n,naux;
    int values,cont,PosX;
    static int p=0;
    public Menu4(ArrayList<Dulce> base, Base beis){
        
        contenedor=getContentPane();
        setLocation(450,200);
        setTitle("Buscar dulce");

        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 1, 20, 20));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(1,25,25));
        JLabel asd = new JLabel("Nombre del dulce a buscar");
        panel.add(asd);
         text = new TextField(10);
        panel.add(text);
        JButton boton = new JButton("Buscar");
        
        
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                n=text.getText();
                for (int i=0;i<base.size();i++){
                    Dulce dulce = base.get(i);
                    String comp = dulce.getNombre();
                    if (comp.equals(n)){
                        p=1;
                        PosX=i; 
                        contenedor.setVisible(false);
                        dispose();
                        Menu4aux auxiliar = new Menu4aux(base, beis, PosX);
                    } if(p==0){
                        p= 2;
                    }
                }
                
                
                
                if (p==1){
                    
                    
            
        }else if(p==2){
            JOptionPane.showMessageDialog(contenedor,"no se encontro el dulce","error",0);
            dispose();
            App obj = new App(base, beis);
        }
    }
            
}); 
        panel.add(boton);

        contenedor.add(panel);

        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
   
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}
