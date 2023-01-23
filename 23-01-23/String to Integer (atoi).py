'''
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

    Read in and ignore any leading whitespace.
    Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
    Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
    Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
    If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
    Return the integer as the final result.


'''
def myAtoi(self, s: str) -> int:
    b=""
    c=""
    for i in range(len(s)):
        if s[i]==" ":
            continue
        elif s[i] in "+-":
            c+=s[i]
            for j in range(i+1,len(s)):
                if s[j] in "0123456789":
                    b+=s[j]
                else:
                    break
            break
        elif s[i] in "0123456789":
            for j in range(i,len(s)):
                if s[j] in "0123456789":
                    b+=s[j]
                else:
                    break
            break
            
        else:
            break
    if len(b)==0:
        return 0
    d=b
    if len(c)==1:
        d=c[0]+b
    e=int(d)
    if e>2**31-1:
        e=2**31-1
    elif e<-2**31:
        e=-2**31
    return e