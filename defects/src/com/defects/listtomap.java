package com.defects;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class listtomap {
public static void main(String args[])
{
	Map<Object, Object> map1 =
		    Arrays.asList("t-98", "da-oiu", "c-3.0")
		        .stream()
		        .map(elem -> elem.split("-"))
		        .collect(Collectors.toMap(e -> e[0], e -> e[1]));
	
	System.out.println("Map 1::::" +map1);
	Map<Object, Object> map2 =
		    Arrays.asList("da-oiu", "t-98", "c-3.0")
		        .stream()
		        .map(elem -> elem.split("-"))
		        .collect(Collectors.toMap(e -> e[0], e -> e[1]));
	
	System.out.println("Map 1::::" +map2);
	System.out.println("mapped:::::" +map1.equals(map2));
}
}
