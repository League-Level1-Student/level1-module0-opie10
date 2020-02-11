package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Method;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffectsstore_com implements MouseListener, ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	JButton jb4 = new JButton();
	JButton jb5 = new JButton();
public void startsos() {
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.add(jp);
	
	jf.pack();
jf.addMouseListener(this);
jp.add(jb);
jb.setText("BOOOOOOOOOOOM BOOOOOM!!!!!!!!");
jb.addActionListener(this);
jp.add(jb2);
jb2.setText("DOOOOOOOOOOOM DOOOOOM!!!!!!!!");
jb2.addActionListener(this);
jp.add(jb3);
jb3.setText("PLUME FIRE DOOOOOOOM BOOOOOM!?!?!?!?!?!?!?!?!?!?");
jb3.addActionListener(this);
jp.add(jb4);
jb4.setText("DOOM DEATH DOOM");
jb4.addActionListener(this);
jp.add(jb5);
jb5.setText("DIE DOOM");
jb5.addActionListener(this);
jf.pack();

	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	













}

private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==jb) {
	playSound("boomboom.wav");	
	}
 else if (e.getSource()==jb2) {
	 playSound("dooomboom.wav");
		
	}
  else if (e.getSource()==jb3) {
	  Audio song= new Audio("younotshall.mp3");
	song.play(Audio.PLAY_ENTIRE_SONG);
}
  else if (e.getSource()==jb4) {
	  Audio Song= new Audio("TBGC.mp3");
	Song.play(Audio.PLAY_ENTIRE_SONG);
}
  else if (e.getSource()==jb5) {
	  Audio sonG= new Audio("tmmc.mp3");
	sonG.play(Audio.PLAY_ENTIRE_SONG);
}
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
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
