class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result=[]
        anagram={}

        for s in strs:
            key=''.join(sorted(s))

            if key not in anagram:
                anagram[key]=[]
            
            anagram[key].append(s)

        for value in anagram.values():
            result.append(value)
        
        return result