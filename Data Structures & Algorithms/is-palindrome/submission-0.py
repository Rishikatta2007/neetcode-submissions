class Solution:
    def isPalindrome(self, s: str) -> bool:
        st=s.strip().lower()
        clean_st = re.sub(r"[^a-zA-Z0-9]", "", st)

        if(clean_st==clean_st[::-1]):
            return True
        else:
            return False
        