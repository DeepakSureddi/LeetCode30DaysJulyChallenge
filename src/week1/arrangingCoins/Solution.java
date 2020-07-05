package week1.arrangingCoins;

public class Solution {
    public static int arrangeCoins(int n) {
    	if (n > 1) {
			
		}
    	int stairs = 0;
    	int i = 0;
    	while (n >= 0) {
			n = n - (((i+1)*(i+1)) - i); 
			if (n > 0) {
				stairs++;
			}
		}
		return stairs;
        
    }
    
    public static void main(String[] args) {
		System.out.println(arrangeCoins(8));
	}
}

