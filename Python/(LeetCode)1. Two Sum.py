class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numIndex = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in numIndex:
                return [numIndex[complement], i]

            numIndex[num] = i


solution = Solution()

nums1 = [2, 7, 11, 15]
target1 = 9
print(solution.twoSum(nums1, target1))

nums2 = [3, 2, 4]
target2 = 6
print(solution.twoSum(nums2, target2))

nums3 = [3, 3]
target3 = 6
print(solution.twoSum(nums3, target3))
