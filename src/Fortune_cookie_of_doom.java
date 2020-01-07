import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie_of_doom implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
   JFrame frame =new JFrame();
   JButton button = new JButton();
   frame.setVisible(true);
   
   
   frame.add(button);
   frame.pack();
   button.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "yay... whoohooo, am i done yet?");
	}
}
