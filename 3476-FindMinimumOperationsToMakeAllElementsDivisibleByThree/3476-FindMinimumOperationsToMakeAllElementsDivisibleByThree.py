# Last updated: 8/6/2026, 12:13:28 PM
class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return len(list(filter(lambda x: x%3!=0, nums)))
        