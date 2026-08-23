class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        n = len(prices)

        min_price = float('inf')
        max_profit = 0

        while i < n:
            if prices[i] < min_price:
                min_price = prices[i]
            else:
                max_profit = max(max_profit, prices[i] - min_price)

            i += 1

        return max_profit