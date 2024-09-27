import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

class DupilcateString{
	                                                                                
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		HashMap<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(map.isEmpty())
			{
				map.put(ch[i],1);
			}
			else
			{
				if(map.containsKey(ch[i]))
				{
					map.put(ch[i],map.get(ch[i])+1);
				}
				else
				{
					map.put(ch[i],1);
				}
			}
		}
		
		Set<Map.Entry<Character,Integer>>entryset= map.entrySet();
		
		for(Map.Entry<Character,Integer> e:entryset)
		{
			if(e.getValue()>1) 
			System.out.print(" "+e.getKey());
		}
		
	}
}