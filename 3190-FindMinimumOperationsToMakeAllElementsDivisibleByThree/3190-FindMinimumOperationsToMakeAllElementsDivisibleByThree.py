# Last updated: 9/4/2026, 4:50:24 PM
class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return len(list(filter(lambda x: x%3!=0, nums)))
        