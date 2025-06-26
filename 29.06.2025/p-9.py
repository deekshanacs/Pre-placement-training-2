def is_magic(matrix):
    s = sum(matrix[0])
    return all(sum(row) == s for row in matrix) and all(sum(col) == s for col in zip(*matrix))
print(is_magic([[2,7,6],[9,5,1],[4,3,8]]))
