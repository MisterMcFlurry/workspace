import java.awt.Graphics;

import javax.swing.*;


public class VariableContainer extends JPanel {
	



	String name = "";
	String data = "";
	JTextField nameField;
	JTextField dataField;
	
	

	public VariableContainer(String input) {
		//split variable into variable name and data
		String temp[] = input.split("=");
		name = temp[0];
		data = temp[1];
		
		nameField = new JTextField(name);
		dataField = new JTextField(data);
		this.add(nameField);
		this.add(dataField);
			
		
		
	}
	
	public String getName() {return name;}
	public void setName(String in) {name = in;}

	public String getData() {return data;}
	public void setData(String in) {data = in;}
	
	public String getVariable() {return name+"="+data;}
	

}
