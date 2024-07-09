import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculatorapp extends JFrame{
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnDiv;
	private JButton btnMul;
	private JButton btnEquals;
	private JButton btnDec;
	
	private JTextField txtfield;
	// private JPanel btnpanel;
	Calculatorapp(){
		setSize(300,300);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		txtfield=new JTextField();
		txtfield.setFont(new Font("", 1, 25));
		add("North",txtfield);
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 2, 2));
		
		btn7=new JButton("7");
		btn7.setFont(new Font("",1,25));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"7");
            }            
        });
		//add(btn7);
		buttonPanel.add(btn7);
		
		btn8=new JButton("8");
		btn8.setFont(new Font("",1,25));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"8");
            }            
        });
		//add(btn8);
		buttonPanel.add(btn8);
		
		btn9=new JButton("9");
		btn9.setFont(new Font("",1,25));
		btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"9");
            }            
        });
		//add(btn9);
		buttonPanel.add(btn9);
		
		btnMul=new JButton("*");
		btnMul.setFont(new Font("",1,25));
		//add(btnMul);
		buttonPanel.add(btnMul);
		
		btn4=new JButton("4");
		btn4.setFont(new Font("",1,25));
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"4");
            }            
        });
		
		//add(btn4);
		buttonPanel.add(btn4);
		
		btn5=new JButton("5");
		btn5.setFont(new Font("",1,25));
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"5");
            }            
        });
		//add(btn5);
		buttonPanel.add(btn5);
		
		btn6=new JButton("6");
		btn6.setFont(new Font("",1,25));
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"6");
            }            
        });
		//add(btn6);
		buttonPanel.add(btn6);
		
		btnDiv=new JButton("/");
		btnDiv.setFont(new Font("",1,25));
		//add(btnDiv);
		buttonPanel.add(btnDiv);
		
		btn1=new JButton("1");
		btn1.setFont(new Font("",1,25));
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"1");
            }            
        });
		//add(btn1);
		buttonPanel.add(btn1);
		
		btn2=new JButton("2");
		btn2.setFont(new Font("",1,25));
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"2");
            }            
        });
		//add(btn2);
		buttonPanel.add(btn2);
		
		btn3=new JButton("3");
		btn3.setFont(new Font("",1,25));
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"3");
            }            
        });
		//add(btn3);
		buttonPanel.add(btn3);
		
		btnAdd=new JButton("+");
		btnAdd.setFont(new Font("",1,25));
		//add(btnAdd);
		buttonPanel.add(btnAdd);
		
		btn0=new JButton("0");
		btn0.setFont(new Font("",1,25));
		btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                String text = txtfield.getText();
                txtfield.setText(text+"0");
            }            
        });
		//add(btn0);
		buttonPanel.add(btn0);
		
		btnDec=new JButton(".");
		btnDec.setFont(new Font("",1,25));
		//add(btnDec);
		buttonPanel.add(btnDec);
		

		btnEquals=new JButton("=");
		btnEquals.setFont(new Font("",1,25));
		//add(btnEquals);
		buttonPanel.add(btnEquals);
		
		btnSub=new JButton("-");
		btnSub.setFont(new Font("",1,25));
		//add(btnSub);
		buttonPanel.add(btnSub);
		
		add("Center",buttonPanel);
	}
}
class Calculator{
	public static void main(String args[]){
		Calculatorapp c1=new Calculatorapp();
		c1.setVisible(true);
	}
}
