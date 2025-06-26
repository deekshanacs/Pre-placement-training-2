def valid_sudoku(board):
    for row in board:
        if len(set(row)) != 9 or not all(1 <= num <= 9 for num in row):
            return False
    for col in range(9):
        col_values = [board[row][col] for row in range(9)]
        if len(set(col_values)) != 9:
            return False
    for box_row in range(0, 9, 3):
        for box_col in range(0, 9, 3):
            subgrid = [
                board[r][c]
                for r in range(box_row, box_row + 3)
                for c in range(box_col, box_col + 3)
            ]
            if len(set(subgrid)) != 9:
                return False

    return True
print("Enter Sudoku board rows (9 numbers separated by space):")
board = []

for i in range(9):
    while True:
        try:
            row = list(map(int, input(f"Row {i+1}: ").split()))
            if len(row) == 9 and all(1 <= n <= 9 for n in row):
                board.append(row)
                break
            else:
                print("❌ Each row must contain exactly 9 numbers from 1 to 9.")
        except ValueError:
            print("❌ Invalid input. Please enter 9 space-separated integers.")

if valid_sudoku(board):
    print("\n The Sudoku board is valid!")
else:
    print("\n The Sudoku board is NOT valid.")
