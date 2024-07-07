//package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionMultipleCatch {

	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(5);
		numList.add(6);
		numList.add(7);
		displayItems(numList, 4);

	}
	public static void displayItems(List<Integer> numList,int index) {
		/*try {
		System.out.println(numList.get(index/0));
		}catch(IndexOutOfBoundsException e){
			System.out.println("Please give index upto "+(numList.size()-1));
		}catch(NullPointerException e) {
			System.out.println("PLease enter a valid list");
		}catch(Exception e) {
			System.out.println("Unknown exception");
		}*/
		
		try {
			System.out.println(numList.get(index/0));
			
			}catch(IndexOutOfBoundsException | NullPointerException e){
				System.out.println("Exception occured");
			}catch(Exception e) {
				System.out.println("Unknown exception");
			}
	}

}
