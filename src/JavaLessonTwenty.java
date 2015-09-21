import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class JavaLessonTwenty extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaLessonTwenty();
	}
	
	public JavaLessonTwenty(){
		this.setSize(400, 400);
		//this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My First Frame");
		
		
		JPanel thePanel = new JPanel();
		
		JLabel label1 = new JLabel("Tell me something");
		
		label1.setText("New Text");
		
		label1.setToolTipText("Does not do anything");
		
		thePanel.add(label1);
		
		JButton button1 = new JButton("Send");
		

		button1.setText("New Button");
		
		button1.setToolTipText("Its a button");
	
		thePanel.add(button1);
		
		
		JTextField textField1 = new JTextField("Type here", 15);
		textField1.setColumns(10);
		textField1.setText("Type Again");
		
		textField1.setToolTipText("Its a text field");
		thePanel.add(textField1);
		
		
		
		JTextArea textArea1 = new JTextArea(15,20);
		textArea1.setText("Just a whole bunch of text that is important");
		
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		JScrollPane scrollBar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		thePanel.add(scrollBar1);
	
		this.add(thePanel);
		
		this.setVisible(true);
		
		textField1.requestFocus();
	}

}
