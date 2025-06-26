class Solution:
    def findTwoElement(self, arr):
        n = len(arr)
        total_sum = n * (n + 1) // 2
        total_sq_sum = n * (n + 1) * (2 * n + 1) // 6
 
        actual_sum = sum(arr)
        actual_sq_sum = sum(x * x for x in arr)
    
        diff = actual_sum - total_sum             
        sq_diff = actual_sq_sum - total_sq_sum    
        
        sum_xy = sq_diff // diff                 
        
        y = (diff + sum_xy) // 2
        x = y - diff
        
        return [y, x]
