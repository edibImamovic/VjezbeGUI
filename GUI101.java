import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ZadatakPrvi {

	public static void main(String[] args) {
		ButtonHandler nesta = new ButtonHandler();
		JFrame gui = new JFrame();
		JPanel pan = new JPanel();
		Dimension dim = new Dimension(600, 600);
		
		JButton dugme = new JButton("Dugme");
		JButton dugme2 = new JButton("Dugme2");
		
		dugme.addActionListener(nesta);
		gui.add(pan);
		gui.setSize(300, 300);
		gui.setMaximumSize(dim);
		gui.setTitle("GUI 101");
		pan.add(dugme);
		pan.add(dugme2);
		gui.setVisible(true);
	

	}
	private static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Kliki klik");
			JButton b = (JButton)(e.getSource());
			b.setText("Macooo");
			
		}
		
	}

}
