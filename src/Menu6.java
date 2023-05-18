import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.html.HTMLDocument.Iterator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
public class Menu6 extends JFrame {
    JButton action,Butonnes;
    Container c2;
    TextField campo,camp2;
    Categoria dato;
    String n,Vcategoria;
    int p,values;
    int cont =0;
    int i=-1;

    JComboBox<String> combo;
    
    
    public Menu6(ArrayList<Dulce> objeto,Base base){
        c2= getContentPane();
        setTitle("Resumen de dulces");
        setSize(500, 300);
        setLocation(450,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        c2.setLayout(new FlowLayout(1,30,30));
        JLabel empty = new JLabel("Use el scroll de ser necario");
        c2.add(empty);
        JTextArea at= new JTextArea(10, 15);
        at.setEditable(false);
        at.append("Nombres de dulces creados\n===============\n");
        for (int i=0; i<objeto.size(); i++){
            Dulce obj = objeto.get(i);
            String nom = obj.getNombre();
            
            
            
            at.append(nom+"\n");
            
            at.append("===============\n");

        }
        JScrollPane pane = new JScrollPane(at);
        


        JButton volver = new JButton("Volver");
        volver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                App ap = new App(objeto, base);
            }
            
        });
        c2.add(pane); 
        c2.add(volver);

            
            
                
        
        setVisible(true);
            
    }
    public void itemStateChanged(ItemEvent e) {
        
       
    }

    
    public void actionPerformed(ActionEvent e) {
        
    }
   
}

