import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends JPanel implements ActionListener {

	JRadioButton radio1, radio2;
	ButtonGroup radioBtnGrup;
	JButton btn1;
	boolean selected = false;

	public RadioButtonPanel() {
		super();
		radio1 = new JRadioButton("Hello");
		radio2 = new JRadioButton("World!");

		radioBtnGrup = new ButtonGroup();
		radioBtnGrup.add(radio1);
		radioBtnGrup.add(radio2);
		btn1 = new JButton("Tamam");
		btn1.addActionListener(this);
		add(radio1);
		add(radio2);
		add(btn1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (radioBtnGrup.getSelection() != null) {
			selected = true;
		}
		if (e.getActionCommand().equals("Tamam")) {

			if (selected) {

				if (radio1.isSelected()) {
					JOptionPane.showMessageDialog(this, radio1.getActionCommand());
				} else if (radio2.isSelected()) {
					JOptionPane.showMessageDialog(this, radio2.getActionCommand());
				}
			} else {
				JOptionPane.showMessageDialog(this, "Please select one option.");
			}
		}

	}

}
