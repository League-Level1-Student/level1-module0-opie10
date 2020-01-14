package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie_of_doom implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JButton button = new JButton();
		frame.setVisible(true);

		frame.add(button);
		frame.pack();
		button.addActionListener(this);

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rd = new Random().nextInt(5);

		if (rd == 0) {
			JOptionPane.showMessageDialog(null, "you will live long");
		}

		else if (rd == 1) {
			JOptionPane.showMessageDialog(null, "you will have many difficulties in life");
		}

		else if (rd == 2) {
			JOptionPane.showMessageDialog(null, "you will be dissapointed in this cookie");
		} else if (rd == 3) {
			JOptionPane.showMessageDialog(null, "you will have fun soon");
		} else if (rd == 4) {
			int rn = new Random().nextInt(2);

			  if (rn == 0) {
				JOptionPane.showMessageDialog(null, "you will travel to an exotic location");
			} else if (rn == 1) {
				JOptionPane.showMessageDialog(null,
						"LIVE IN FEAR FOR DEATH ALWAYS LURKS AROUND THE CORNER FOR YOU!!!!!");
			}

		}
	}
}
