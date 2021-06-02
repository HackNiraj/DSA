class MaximumProfitByShares {
	public static void main(String[] args) {
		int price[] = { 2, 30, 15, 10, 8, 25, 80 };
		int profit = 0;
		for (int i = 1; i < price.length; i++) {
			int sub = price[i] - price[i - 1];
			if (sub > 0)
				profit += sub;
		}
		System.out.print("Maximum Profit=" + profit);
	}
}
