package stackqueue.stockspan;

import stackqueue.stack.Stack;

public class StockSpan {
    public static int[] calculate(int[] prices){
        int n = prices.length;
        int[] ans = new int[n];

        Stack s = new Stack();
        for(int i = 0;i<n;i++){
            while(!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = i+1;
            }
            else{
                ans[i] = i-s.peek();
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculate(prices);

        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nSpan Values: ");
        for (int sp : span) {
            System.out.print(sp + " ");
        }
    }
}
