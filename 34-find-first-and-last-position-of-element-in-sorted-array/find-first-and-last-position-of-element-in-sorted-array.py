class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def findf():
            n=len(nums)
            l=0
            r=n-1
            an=-1
            while l<=r:
                mid=(l+r)//2
                if(nums[mid]==target):
                    an=mid
                    r=mid-1
                elif(nums[mid]<target):
                    l=mid+1
                else:
                    r=mid-1
            return an
        def findl():
            n=len(nums)
            l=0
            r=n-1
            an=-1
            while l<=r:
                mid=(l+r)//2
                if(nums[mid]==target):
                    an=mid
                    l=mid+1
                elif(nums[mid]<target):
                    l=mid+1
                else:
                    r=mid-1
            return an
        return [findf(),findl()]