package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel cheet;
	JLabel feet;
	JLabel zeet;
JLabel deet;
JLabel leet ;
	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame reet = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
		reet.setVisible(true);
		reet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
		reet.setSize(1920, 2200);
		// 4. Set the title of the frame
		reet.setTitle("yeet");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
		JPanel beet = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		reet.add(beet);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image file in a String variable.
		String seet = "images-1.jpg";
		String parakeet = "images-2.jpg";
		String meet = "images-3.jpg";
		String jeet = "gong.jpg";
		String weet = "horn.jpg";
		// 9. Edit the next line to use your String variable
		cheet = createLabelImage(seet);

		// 10. Add the image to the panel
		beet.add(cheet);
		// 11. Set the layout of the panel to "new GridLayout()"type name = new type();
		beet.setLayout(new GridLayout());

		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
		reet.pack();
		// 13. add this mouse listener to drumLabelWithImage
		cheet.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.

		feet = createLabelImage(parakeet);
		beet.add(feet);
		feet.addMouseListener(this);
		reet.pack();

		zeet = createLabelImage(meet);
		beet.add(zeet);
		zeet.addMouseListener(this);
		reet.pack();
		
		deet = createLabelImage(jeet);
		beet.add(deet);
		deet.addMouseListener(this);
		reet.pack();
		
		leet = createLabelImage(weet);
		beet.add(leet);
		leet.addMouseListener(this);
		reet.pack();
	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.
		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
		if (drumClicked == cheet) {
			playSound("cymbal.wav");
		} else if (drumClicked == feet) {
			playSound("drum.wav");
		}
		else if (drumClicked == zeet) {
			playSound("ilikebongos.wav");
		}
		else if (drumClicked == deet) {
			playSound("gonggoesboomboom.wav");
		}
		else if (drumClicked == leet) {
			playSound("totallynotaprankairhorn.wav");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			playSound("totallynotaprankairhorn.wav");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			playSound("totallynotaprankairhorn.wav");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			playSound("totallynotaprankairhorn.wav");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			playSound("totallynotaprankairhorn.wav");
		}
		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works
			}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
