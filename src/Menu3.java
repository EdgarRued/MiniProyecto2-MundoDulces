
import java.awt.Container;
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
public class Menu3 extends JFrame implements ActionListener,ItemListener {
    Container contenedor;
    TextField text,campo,camp2;
    JComboBox<String> combo;
    Categoria dato;
    JButton action;
    String n,naux;
    int values,cont;
    
    public Menu3(ArrayList<Dulce> objeto, Base base){
        
        contenedor=getContentPane();
        setLocation(450,200);
        

        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 1, 20, 20));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(1,25,25));
        JLabel asd = new JLabel("Nombre del dulce a eliminar");
        panel.add(asd);
         text = new TextField(10);
        panel.add(text);
        JButton boton = new JButton("Aceptar");
        ArrayList<Dulce> p = base.obtain();
        boton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                n= text.getText();
                String aux=text.getText();
                int pe=0;
                int PosX=1411;
                for (int i=0;i<p.size();i++){
                    Dulce dulce = p.get(i);
                    String comp = dulce.getNombre();
                    
                    if (comp.equals(n)){
                        pe= 1;
                        PosX=i;
                        JOptionPane.showMessageDialog(contenedor,"Dulce eliminado","exito",1);
                        p.remove(i);
                        base.DataUpload(p);
                        dispose();
                        App ap= new App(objeto,base);
                    }else if(comp.compareTo(n)==0){
                        pe= 2;
                    }
                }
                    
                
                if (pe==1){

                    
                     
            
        }else if(pe==2){
            JOptionPane.showMessageDialog(contenedor,"no se encontro el dulce","Error",0);
            dispose();
            App obj = new App(objeto,base);
        }
    }
            
}); 
        panel.add(boton);

        contenedor.add(panel);

        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
