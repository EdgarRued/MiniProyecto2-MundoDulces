import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
public class Menu4aux extends JFrame implements ItemListener,ActionListener {
    JButton action;
    Container c2;
    TextField campo,camp2;
    Categoria dato;
    String n,Vcategoria;
    int p,PosX,values;
    JComboBox<String> combo;
    
    public Menu4aux(ArrayList<Dulce> objeto,Base base, int x){
            c2= getContentPane();
            setLocation(450,200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        GridLayout newgrid1= new GridLayout(1,3,30,30);
            c2.setLayout(new FlowLayout(1));
            JLabel empty= new JLabel("");
            c2.add(empty);
            GridLayout pru= new GridLayout(6,2,30,30);
            JPanel panelsi= new JPanel(pru);
//
            panelsi.add(empty);
            panelsi.add(empty);
            JLabel ms1 = new JLabel("Nombre del dulce ");
            panelsi.add(ms1);
            campo = new TextField(10);
            Dulce prueba = objeto.get(x);
            n = prueba.getNombre();
            campo.setText(n);
            
            panelsi.add(campo);
            campo.setEditable(false);
            
            
//
            
            JLabel ms2= new JLabel("Tipo de dulce");
            panelsi.add(ms2);
            TextField campillo= new TextField(10);
            dato = prueba.getCatego();
            if(dato==Categoria.acido){
                Vcategoria = "Acido";
            }if(dato==Categoria.dulce){
                Vcategoria = "Dulce";
            }if(dato==Categoria.notdulce){
                Vcategoria =  "Sin azucar";
            }
            campillo.setText(Vcategoria);
            panelsi.add(campillo);
            campillo.setEditable(false);
            
//
            
            JLabel leibol= new JLabel("Precio");
            panelsi.add(leibol);
            camp2= new TextField(10);
            camp2.setText(prueba.getPrecio()+"");
            panelsi.add(camp2);
            camp2.setEditable(false);
            
            

            
            GridLayout grid = new GridLayout(1,3,30,30);
            JPanel Panel2= new JPanel(grid);
            Panel2.add(empty);
            action= new JButton("Volver");
            action.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    
                        
                       

                        
                    
                    dispose();
                    App ap = new App(objeto, base);
                    
                    
                }
            });
            Panel2.add(action);
            Panel2.add(empty);
            panelsi.add(Panel2);
            panelsi.add(empty);
            
            panelsi.add(empty);
            panelsi.add(empty);

            c2.add(panelsi);
            c2.add(empty);

            setSize(500, 300);
            setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

