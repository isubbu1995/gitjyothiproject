package com.practice1;

import java.util.Arrays;
import java.util.List;

public class Interview {

	public static void main(String[] args) {
		// 8

		List<Integer> list = Arrays.asList(1, 2, 8, 20, 5, 6, 4, 4, 7, 9);
		int len = list.size();
		int larg = 0;
		int second = 0;

		for (int j = 1; j < len; j++) {

			if (larg < list.get(j)) {

				larg = list.get(j);

			}
			second = larg;

		}
		System.out.println(second);

	}

}
