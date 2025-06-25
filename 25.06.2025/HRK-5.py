
n, x = map(int, input().split())
marks = [list(map(float, input().split())) for _ in range(x)]
for student_marks in zip(*marks):
    avg = sum(student_marks) / x
    print(round(avg, 1))
