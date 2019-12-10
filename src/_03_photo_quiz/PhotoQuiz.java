package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String why = "https://pics.me.me/ji-believe-i-can-fly-cataddicisanony-amouse-i-believe-i-can-25038037.png";
		// 2. create a variable of type "Component" that will hold your image
		Component ibf;
		Component t;
	
		// 3. use the "createImage()" method below to initialize your Component
		ibf = createImage(why);
		// 4. add the image to the quiz window
		quizWindow.add(ibf);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("what is catnip cat food or cat candy");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("cat candy")) {
			t = createImage("https://pics.me.me/according-to-my-calculations-youre-awesome-memes-com-you-re-amazing-52831177.png");
			
			
			JOptionPane.showMessageDialog(null, "Correct");

		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			t = createImage("https://i.pinimg.com/236x/2d/57/82/2d57828eb9a1247a955d50b3aa70d5e4.jpg");
			
			
			JOptionPane.showMessageDialog(null, "Incorrect");

		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(ibf);
		quizWindow.add(t);
		quizWindow.pack();
		
		
		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
