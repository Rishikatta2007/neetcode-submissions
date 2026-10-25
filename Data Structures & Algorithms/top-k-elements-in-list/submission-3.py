class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        most={}
        result=[]

        for i in nums:
            if i not in most:
                most[i] = 1
            else:
                most[i] += 1

        result=sorted(most,key=lambda x:most[x],reverse=True)
        return (result[:k])
        