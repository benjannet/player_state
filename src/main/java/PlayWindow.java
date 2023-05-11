
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class PlayWindow {

	private JFrame frame;
	private JPanel panel;
	private JButton bPlay, bStop, bPrev, bNext;
	private JLabel lAction;
	private JTextField lState;
	private Player player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayWindow window = new PlayWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBounds(0, 0, 300, 250);
		frame.add(panel);

		bPlay = new JButton("Play");
		bStop = new JButton("Stop");
		bPrev = new JButton("Previous");
		bNext = new JButton("Next");

		panel.add(bPlay);
		panel.add(bStop);
		panel.add(bPrev);
		panel.add(bNext);

		lState = new JTextField("Ready");
		panel.add(lState);
		lAction= new JLabel("");
		panel.add(lAction);

		player = new Player();

		bPlay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lAction.setText(player.getState().clickPlay());
				lState.setText(player.getState().getClass().getSimpleName());
			
			}
		});

		bStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lAction.setText(player.getState().clickLock());
				lState.setText(player.getState().getClass().getSimpleName());
			}
		});
		bNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lAction.setText(player.getState().clickNext());
				lState.setText(player.getState().getClass().getSimpleName());
			}
		});

		bPrev.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lAction.setText(player.getState().clickPrevious());
				lState.setText(player.getState().getClass().getSimpleName());
			}
		});
	}

}