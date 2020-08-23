package clonee;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class main {
	public static void main(String[] args) {
		// System.out.println(wordSquare("SATORAREPOTENETOPERAROTAS"));
	}

//"SATORAREPOTENETOPERAROTAS"
	// "AAAA
	// EEEE
	// N
	// OOOO
	// PP
	// RRRR
	// SS
	// TTTT"
//	public static int beauty(int[] arr) {
//
//	}

	public static int beauty(int[] arr) {
		if (arr[0] < arr[1])
			return (2 * arr[0] + 1 + min(arr[1] - arr[0] - 1, (arr[3] - 1) * (arr[0] + 1)));
		else if (arr[0] == arr[1]) {

			if (arr[0] == 0)
				return 0;
			return (2 * arr[2]);
		} else
			return (2 * arr[1] + 1 + min(arr[0] - arr[1] - 1, (arr[2] - 1) * (arr[1] + 1)));
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
}