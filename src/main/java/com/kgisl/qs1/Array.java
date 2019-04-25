package com.kgisl.qs1;
import java.util.Arrays;
import java.util.List;

class Array
{
	
	public static int length;

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Tamil Nadu", "Chennai");

		String[] array = list.toArray(new String[0]);
		System.out.println(Arrays.toString(array));
	}
}