package lesson150331.linked_list.anonymous;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.Transient;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UIExample {
	static class ButtonClickProcessor implements ActionListener {

		public void actionPerformed(final ActionEvent e) {
			System.out.println("Happened");

		}
	}

	public static void main(final String[] args) {

		JFrame frame = new JFrame("Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		// JButton button = new JButton("Click") {
		// @Override
		// @Transient
		// public Dimension getPreferredSize() {
		// // TODO Auto-generated method stub
		// return new Dimension(50, 20);
		// }
		// };
		// frame.add(button);
		frame.setVisible(true);

		// button.addActionListener(new ButtonClickProcessor());
		// button.addActionListener(new ActionListener() {
		//
		// public void actionPerformed(final ActionEvent e) {
		// // TODO Auto-generated method stub
		// System.out.println("2nd");
		// }
		// });
		frame.addMouseListener(new MouseListener() {

			public void mouseReleased(final MouseEvent e) {
				System.out.println("release");

			}

			public void mousePressed(final MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("press");

			}

			public void mouseExited(final MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("exited");

			}

			public void mouseEntered(final MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("entered");

			}

			public void mouseClicked(final MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("release");

			}
		});
	}

}
