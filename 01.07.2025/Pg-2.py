def generate_crossword(words):
    size = max(len(word) for word in words) + 5
    board = [[' ']*size for _ in range(size)]

    def place_word_horizontal(word, row, col):
        if col + len(word) > size:
            return False
        for i in range(len(word)):
            if board[row][col+i] != ' ' and board[row][col+i] != word[i]:
                return False
        for i in range(len(word)):
            board[row][col+i] = word[i]
        return True

    def place_word_vertical(word, row, col):
        if row + len(word) > size:
            return False
        for i in range(len(word)):
            if board[row+i][col] != ' ' and board[row+i][col] != word[i]:
                return False
        for i in range(len(word)):
            board[row+i][col] = word[i]
        return True

    placed = 0
    for word in sorted(words, key=lambda x: -len(x)):
        for row in range(size):
            for col in range(size):
                if place_word_horizontal(word, row, col) or place_word_vertical(word, row, col):
                    placed += 1
                    break
            else:
                continue
            break

    print("\nCROSSWORD:")
    for row in board:
        print(' '.join(row))
word_list = ["python", "crossword", "puzzle", "code", "algorithm"]
generate_crossword(word_list)
