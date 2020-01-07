package _06_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	JButton fat = new JButton();
	JButton sat = new JButton();

	Dimension BIG = new Dimension(600, 500);
	Dimension SMALL = new Dimension(400, 300);

	JFrame cat = new JFrame();
	JPanel mat = new JPanel();

	public void run() {

		// 1. Add the panel to the frame
cat.add(mat);
		// 2. Make the frame visible
cat.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
fat.setText("Click me ");
		// 4. Set the text of the rightButton to "Click me!"
sat.setText("Click me.");
		// 5. Add an action listener to the leftButton
fat.addActionListener(this);
		// 6. Add an action listener to the rightButton
sat.addActionListener(this);
		// 7. Add the leftButton to the panel
mat.add(fat);
		// 8. Add the rightButton to the panel
mat.add(sat);
		// 9. Pack the frame
cat.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
cat.setTitle("YOU WILL DIE IF YOU DO NOT LISTEN TO THESE BUTTONS");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		if (buttonPressed==fat) {
			sat.setText("NO CLICK ME OR ELSE!!!!!");
			sat.setPreferredSize(BIG);
			fat.setText("Click me please I beg of you.");
			fat.setPreferredSize(SMALL);
		}
		else if (buttonPressed==sat) {
			fat.setText("NO CLICK ME I NEED IT PLEASE YOU WILL REGRET IT IF YOU DO'T CLICK ME!!!!!");
			fat.setPreferredSize(BIG);
			sat.setText("Click me really, I'm the good one, choose me!!");
			sat.setPreferredSize(SMALL);
		}
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		cat.pack();
	}
}
