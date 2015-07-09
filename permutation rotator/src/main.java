import java.util.ArrayList;


public class main {
	
	static ArrayList<String> permutations;
	static final int SHAPE_SIDES = 6;
	static final int COLOURS = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub  

		permutations = new ArrayList<String>();
		permutations = BuildPermutations(permutations, SHAPE_SIDES, COLOURS);
		permutations = RemoveRotations(permutations, SHAPE_SIDES);
	}
	
	public static ArrayList<String> BuildPermutations(ArrayList<String> inList, int maxSides, int maxColours)
	{
		BuildPermutations(inList, maxSides, maxColours, "");

		return inList;
	}

	public static void BuildPermutations(ArrayList<String> inList, int maxSides, int maxColours, String entry)
	{
		int i=0;
		while (i<maxColours)
		{
			if(entry.length()+1<maxSides)
			{
				BuildPermutations(inList,maxSides,maxColours,entry+(i+1));
			}
			else
			{
				inList.add(entry+(i+1));
			}
			i++;
			
		}
	}
	
	public static ArrayList<String> RemoveRotations(ArrayList<String> inList, int rotationAmnt)
	{
		//for each value in the list
		int i=0;
		String rotate = "";
		while (i<inList.size())
		{
			rotate = inList.get(i);
			//take the value of the current record and rotate letters from head to tail.
			int j = 1;
			while (j<rotationAmnt)
			{
				int k = i;
				String rotateHead = rotate.substring(0,1);
				String rotateTail = rotate.substring(1,rotate.length());
				rotate = rotateTail+rotateHead;
				while(k<inList.size())
				{
					if(rotate.compareTo(inList.get(k))==0)
					{
						inList.remove(k);
						break;
					}
					k++;
				}
				j++;
			}
			i++;
		}
		
		return inList;
	}
	
}

