import javax.swing.*;
import java.awt.*;
class Calculatorapp extends JFrame{
	JButton[] btnarray;
	JTextField txtfield;

	Calculatorapp(){
		setSize(300,300);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		txtfield=new JTextField();
		txtfield.setFont(new Font("", 1, 25));
		add("North",txtfield);

		btnarray=new JButton[16];
		String[] buttonname={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

		JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 2, 2));

		for (int i = 0; i < buttonname.length; i++) {
			btnarray[i]=new JButton(buttonname[i]);
			btnarray[i].setFont(new Font("", 1, 20));
			buttonPanel.add(btnarray[i]);
		}
		add("Center",buttonPanel);
		
	}
} 

public class calculator{  
	public static void main(String[] args){  
		new Calculatorapp().setVisible(true);
		
	}  
}  
