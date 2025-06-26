class Solution:
    def longestSubarray(self, arr, k):
        prefix_sum = 0
        max_length = 0
        sum_index_map = {}

        for i in range(len(arr)):
            prefix_sum += arr[i]

            if prefix_sum == k:
                max_length = i + 1

            if (prefix_sum - k) in sum_index_map:
                max_length = max(max_length, i - sum_index_map[prefix_sum - k])

            if prefix_sum not in sum_index_map:
                sum_index_map[prefix_sum] = i

        return max_length
