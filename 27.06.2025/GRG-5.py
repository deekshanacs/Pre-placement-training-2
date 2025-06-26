class Solution:
    def isBalanced(self, s):
        stack = []
        matching = {')': '(', '}': '{', ']': '['}
        
        for char in s:
            if char in '({[':
                stack.append(char)
            elif char in ')}]':
                if not stack or stack[-1] != matching[char]:
                    return False
                stack.pop()
        
        return len(stack) == 0
