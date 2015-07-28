import java.util.ArrayList;

import javax.swing.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testS = "http://cwdv-tlkcc04.comtec-europe.co.uk/travelink/ExternalFunctions/xml/DynamicPackages/DynamicPackageSearch.asp?LocalCurrency=GBP&XmlResults=2&SearchType=1&accomonrequest=True&conditionalsupplements=true&DBName=Q151_RelA_IGOSKI_22Jul14&NoAdults=2&NoChilds=0&NoInfants=0&StartDate=02-Sep-2015&Duration=7&DepApt=LGW&rooms=1&occupancy=2,0,0&MinimumRating=0&Product=CE&PlusMinus=0&MulticomFlights=true&AccommodationSearchType=Airport&UseMultipleChildBands=True&Arrapt=GVA&Accomname=Hotel%20Du%20Golf%20Apartments&IncludeTransfers=True";
		
		Address test = new Address(testS);

		ArrayList<VariableContainer> variables = test.getVariables();

	    JFrame f = new JFrame("My Hello Panel!");
	    f.setVisible(true); // equivalent to f.show()!

		// Frame Parameters
		f.setTitle("testTitle");
		f.setSize(300,200); // default size is 0,0
		f.setLocation(10,200); // default is 0,0 (top left corner)
		JPanel p = new JPanel();
		f.add(p);
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));


		// Add Panels
		p.add(new VariableContainer("test=data"));
		p.add(new VariableContainer("test=data2"));
		for(int i=0;i<variables.size();i++)
		{p.add(variables.get(i));}

	}

}
