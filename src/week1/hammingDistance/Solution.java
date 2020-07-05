package week1.hammingDistance;

class Solution {
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	public static void main(String[] args) {
		System.out.println(hammingDistance(3, 4));
	}
}