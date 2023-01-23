'''
Given a string s, find the length of the longest substring without repeating characters.

'''
def lengthOfLongestSubstring(self, s: str) -> int:
    a=[]
    count=0
    maxi=0
    for i in s:
        if i not in a:
            a.append(i)
            count+=1
            if count>maxi:
                maxi=count
        else:
            a.append(i)
            ind=a.index(i)
            acop=a.copy()
            a=acop[ind+1:]
            count=len(a)
    return maxi
