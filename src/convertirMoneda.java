import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class convertirMoneda extends JFrame {
	 
	public convertirMoneda () {
		super();
		setSize(250, 300);
		setTitle("CONVERTIR MONEDAS");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		JButton b1;
		JComboBox combo;
		

		
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new BorderLayout());
		
		JTextField pantalla = new JTextField("CONVERTIR MONEDAS", 20);
		pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
		pantalla.setFont(new Font("Arial", Font.BOLD, 14));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setEditable(false);
		pantalla.setBackground(Color.WHITE);
		panel.add("North", pantalla);
		JLabel etiq1 = new JLabel("Selecciona el tipo de moneda para convertir");
		JLabel etiq2 = new JLabel("Selecciona la cantidad: ");
        b1 = new JButton ("Aceptar");
        
        combo = new JComboBox();
		combo.addItem("Dolar");
		combo.addItem("Peso");
		combo.addItem("Euro");
		
        GridLayout distGrid = new GridLayout(5,3);
        getContentPane().setLayout(distGrid);
        getContentPane().add( etiq1 );
        getContentPane().add(combo);
        getContentPane().add(b1);
        getContentPane().add(etiq2);
        JLabel etiq3;
        b1.addActionListener( new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            AbstractButton etiq3;
			etiq3.setText("Has seleccionado: " );			
          }	
        {

        
	        
       
		
	        
}
	public void entrada () {
		
		
	}
	
    public void salida () {
		
		
	}
    
    public  static  void  main ( String [] args ) {
        convertirMoneda ventana =  new  convertirMoneda();
        ventana . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        ventana . pack();
        ventana . setVisible ( true );

    }
