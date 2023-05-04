import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class test {
	
	//@Test // this will execute the test case
	
	
	
		public void regular() 
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Parikshit");
			names.add("Ahan");
			names.add("Ram");
			int count=0;
			
			for(int i=0;i<names.size();i++) 
			{
				String actual=names.get(i);
				if(actual.startsWith("R")) 
				{
					count++;
				}
						
			}
		
			System.out.println(count);
		
		
		}
	   // @Test
	    public void streamFilter() 
	    {
	    	ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Parikshit");
			names.add("Ahan");
			names.add("Ram");
			//There is no life for intermidiate op. if there is no terminal op
			//terminal op. will execute only if inter. op (filter) returns true
			//We can create Stream
			//How to create stream in API
			
			               // Lambda Expressions
			               //        |
			
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			Long d=Stream.of("Abhijeet","Don","Parikshit","Ahan","Ram").filter(s->
			
			{
				s.startsWith("A");
				return false;
					
			}).count();
			System.out.println(d);
			//print all the names of array list
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
			
			
			
	    	
	    	
	    	
	    	
	    }
		
		
		
		
		
		//@Test
		public void streamMap() 
		{
			//print name of length>4 with Uppercase
			List<String>new1=Arrays.asList("Abhijeet","don","suresh","darmesh","Ram");
					new1.stream().filter(s->s.startsWith("d")).map(s->s.replace("don", "kachraseth")).forEach(s->System.out.println(s));
			//print names which have first letter as a with uppercase and sorted
			
			
			List<String>names=Arrays.asList("AIBHIJEET","don","Parikshit","AHAN","Ram");
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
			//Merging 2 different Lists
			Stream<String>newDoc=Stream.concat(names.stream(),new1.stream());
			//newDoc.sorted().forEach(s->System.out.println(s));
			
			boolean flag=newDoc.anyMatch(s->s.equalsIgnoreCase("Parikshit"));
			System.out.println(flag);
			AssertJUnit.assertTrue(flag);
		}
		//@Test
		public void streamCollect() 
		{
			List<String>ls=Stream.of("Abhijeet","don","suresh","darmesh","Ram").filter(s->s.endsWith("h")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(ls.get(0));
		}
		//@Test
		public void practise() 
		{
		   List<String>prt=Stream.of("Suresh","Shadlou","pardeep","Aslam").filter(p->p.startsWith("S")).map(p->p.toUpperCase())
			.collect(Collectors.toList());
		   System.out.println(prt.get(0));
				
					
			
		}
		@Test
		public void assignment() 
		{
			List<Integer>values=Arrays.asList(2,6,2,3,4,1,8);
			//print unique number from this array
			//sort the Array
			//values.stream().distinct().forEach(s->System.out.println(s));
			List<Integer>newVal=values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(newVal.get(2));
			
			
			
			
			
			
		}
	}


