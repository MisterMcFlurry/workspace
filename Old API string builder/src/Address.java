import java.util.ArrayList;
import java.util.Arrays;


public class Address {
	
	String input ="";

	ArrayList<String> url;
	ArrayList<VariableContainer> variables;
	
	
	public Address(String inString) {
		super();
		input = inString;
		variables = new ArrayList<VariableContainer>();
		BreakInput(inString);
	}
	
	//breaks apart the input string into URL and Variables
	private void BreakInput(String inString)
	{
		//break input into url and variables, 0=url, 1=variables
		String splitInput[] = inString.split("\\?");
		//split url up into elements separated by / and add it into a string list. 
		//3 should be the server, and 'length-1' should be the service 
		url = new ArrayList<String>(Arrays.asList(splitInput[0].split("/")));
		//split the variables up into a list of full variable strings
		String variableList[] = splitInput[1].split("&");
		//loop through list and build variable objects, adding them to the variable list
		for(int i=0;i<variableList.length;i++)
		{
			variables.add(new VariableContainer(variableList[i]));
		}
		
		
	}
	
	//builds up and returns the address string 
	private String BuildAddress()
	{
		return "temp";
	}

	public ArrayList<String> getUrl() {return url;}
	public void setUrl(ArrayList<String> url) {this.url = url;}

	public ArrayList<VariableContainer> getVariables() {return variables;}
	public void setVariables(ArrayList<VariableContainer> variables) {this.variables = variables;}
}
