class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n3=[]
        m=len(nums1)
        n=len(nums2)
        i=0
        j=0
        while i<m and j<n:
            if (nums1[i]<nums2[j]):
                n3.append(nums1[i])
                i+=1
            else:
                n3.append(nums2[j])
                j+=1
        while i<m :
            n3.append(nums1[i])
            i+=1
        while j<n:
            n3.append(nums2[j])
            j+=1
        total=m+n
        if total%2==1:
            return n3[total//2]
        else:
            return (n3[total//2]+n3[total//2-1])/2
