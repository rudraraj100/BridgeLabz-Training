package com.day4.zipzipmart;

import java.util.ArrayList;

public class SaleMergeSort {

	public static void divide(ArrayList<Sales> record, int si, int ei) {

		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;
		divide(record, si, mid);
		divide(record, mid + 1, ei);

		conquer(record, si, mid, ei);

	}

	public static void conquer(ArrayList<Sales> record, int si, int mid, int ei) {

		ArrayList<Sales> merged = new ArrayList<>();

		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= ei) {
			if (record.get(idx1).getPurchaseDate().compareToIgnoreCase(record.get(idx2).getPurchaseDate()) < 0) {
				merged.add(x++, record.get(idx1++));
			} else {
				merged.add(x++, record.get(idx2++));
			}
		}
		while (idx1 <= mid) {

			merged.add(x++, record.get(idx1++));

		}
		while (idx2 <= ei) {

			merged.add(x++, record.get(idx2++));

		}

		for (int i = 0, j = si; i < merged.size(); i++, j++) {

			record.set(j, merged.get(i));

		}

	}
}
