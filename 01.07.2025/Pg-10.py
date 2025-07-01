def is_palindrome(s):
    s = s.lower().replace(" ", "")
    return s == s[::-1]

print("Is 'Racecar' a palindrome?", is_palindrome("Racecar"))
