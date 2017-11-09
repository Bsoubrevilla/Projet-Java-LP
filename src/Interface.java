import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Interface extends JFrame {
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Jeu du coffre");
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.addActionListener(actionJouer());
		btnJouer.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(btnJouer);
		
		JButton btnCharger = new JButton("Charger niveau");
		btnJouer.addActionListener(actionCharger());
		btnCharger.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(btnCharger);
		
		JButton btnCopyrights = new JButton("Credits");
		btnCopyrights.addActionListener(actionCopy());
		btnCopyrights.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(btnCopyrights);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(actionQuitter());
		btnQuitter.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(btnQuitter);
	}

    private ActionListener actionQuitter() {
		// TODO Auto-generated method stub
    	System.exit(0);
		return null;
	}

	private ActionListener actionCopy() {
		// TODO Auto-generated method stub
		return null;
	}

	private ActionListener actionCharger() {
		// TODO Auto-generated method stub
		return null;
	}

	private ActionListener actionJouer() {
		// TODO Auto-generated method stub
		return null;
	}

	private static final long serialVersionUID = 1L;


}
