package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class andnowthecutenesstvbesttvinthecountry implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton buttton = new JButton();
	JButton butttton = new JButton();

	void run() {

		
		frame.setVisible(true);
		button.addActionListener(this);
		panel.add(button);
		frame.pack();

		frame.add(panel);
		
		panel.setVisible(true);
		buttton.addActionListener(this);
		panel.add(buttton);
		frame.pack();

		frame.add(panel);
		
		panel.setVisible(true);
		butttton.addActionListener(this);
		panel.add(butttton);
		frame.pack();

	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		} else if (buttton == e.getSource()) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");

		} else if (butttton == e.getSource()) {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");

		}

	}
}
