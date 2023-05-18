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

public class Menu1 extends JFrame implements ActionListener,ItemListener {
    JButton action;
    Container c2;
    
    TextField campo,camp2;
    Categoria dato;
    String n;
    int p;
    JComboBox<String> combo;
    
    public Menu1(ArrayList<Dulce> objeto,Base base){
        
            c2= getContentPane();
            setLocation(450,200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setTitle("Insertar dulce");
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
            panelsi.add(campo);
            
            
//
            
            JLabel ms2= new JLabel("Tipo de dulce");
            panelsi.add(ms2);
            String lista [] = {"Seleccione un tipo","Dulce","Acido","Sin azucar"};
            combo = new JComboBox<>(lista);
            combo.addItemListener(this);
            panelsi.add(combo);
            
//
            
            JLabel leibol= new JLabel("Precio");
            panelsi.add(leibol);
            camp2= new TextField(10);
            panelsi.add(camp2);
            

            
            GridLayout grid = new GridLayout(1,3,30,30);
            JPanel Panel2= new JPanel(grid);
            Panel2.add(empty);
            action= new JButton("Agregar Dulce");
            
            action.addActionListener(new ActionListener() {
                
                
                public void actionPerformed(ActionEvent ae) {
                    
                    p=Integer.parseInt(camp2.getText());
                    n=campo.getText();
                    Dulce dolci= new Dulce(n, dato, p);
                    
                    objeto.add(dolci);
                    base.DataUpload(objeto);
                    JOptionPane.showMessageDialog(c2,"Exito","Proceso completado",1);
                    dispose();

                    App obj = new App(base.obtain(),base);
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
        
        if(e.getSource()==combo){
            if(e.getStateChange()==1){
                if(e.getItem()=="Dulce"){
                    dato = Categoria.dulce;
                }
                if(e.getItem()=="Acido"){
                    dato = Categoria.acido;
                }
                if(e.getItem()=="Sin azucar"){
                    dato = Categoria.notdulce;
                }
                if(e.getItem()=="Seleccione un tipo"){
                    dato = null;
                }
            }
                
            
          }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
