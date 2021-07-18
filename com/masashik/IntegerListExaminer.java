package com.masashik;

import java.util.List;
import java.util.ArrayList;

public class IntegerListExaminer {

	/**
	 * Given a list of Integers, return a list that contains the elements that form the longest sublist 
	 * of even integers in the list. If two sublists are of equal length, the first subset is returned.
	 *
	 * Ex.
	 * [1 3 3] returns []
	 * [2 3 3] returns [2]
	 * [2 3 4 6 3] returns [4 6]
	 * [2 3 4 6 3 6 8] returns [4 6]
	 */

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

			list.add(1);
			list.add(2);
			list.add(4);
			list.add(4);
			list.add(6);
			list.add(1);
			list.add(8);
			list.add(8);
			list.add(8);
			list.add(8);
			list.add(8);
			list.add(1);
			list.add(6);
			list.add(6);
			list.add(6);
			list.add(6);
			list.add(6);

		List<Integer> foundSublist = findLongestEvenSublist(list);

		int longestSublistSize = foundSublist.size();

		System.out.println("The longest even sublist size is " + longestSublistSize);

		String foundSublistToString = "";
		if (longestSublistSize > 0) {
			StringBuilder foundSublistArray = new StringBuilder();
			for (Integer i : foundSublist) {
				foundSublistArray.append(String.valueOf(i));
				foundSublistArray.append(",");
			}
			foundSublistToString = foundSublistArray.toString().substring(0, foundSublistArray.length() - 1);
		}

		System.out.println("The longest even sublist is " + "[" + foundSublistToString + "]");

	}

	public static List<Integer> findLongestEvenSublist(List<Integer> list) {

		List<List<Integer>> listOfSublist = new ArrayList<>();

		if (list == null || list.size() == 0) {

			//Input list does not have any item.
			return new ArrayList<Integer>();

		} else {

			//System.out.println("Input list is not empty or NULL.");

			//Input list has items.
			List<Integer> sublists = new ArrayList<>();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i) % 2 == 0) {
					//i is an even num.
					sublists.add(list.get(i));
				} 
				else {
					//i is an odd num.
					if (sublists.size() > 0) {
						listOfSublist.add(sublists);
						sublists = new ArrayList<>();
					}
				}
			}

			if (sublists.size() > 0) {
				listOfSublist.add(sublists);
			}

			//System.out.println(listOfSublist.size());

			if (sublists.size() == list.size()) {
				//All items in the list are even num.
				return list;
			}

			List<Integer> longestSizedList = new ArrayList<Integer>();

			//Find the longest sized list from sublists.
			for (List<Integer> comparingSublist : listOfSublist) {
				if (comparingSublist.size() > longestSizedList.size()) {
					longestSizedList = comparingSublist;
				}
			}

			return longestSizedList;
		}
	}

}
