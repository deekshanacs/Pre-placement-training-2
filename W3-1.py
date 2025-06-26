students = {}
def add_student(name, roll):
    students[roll] = name

def display():
    for roll, name in students.items():
        print(f"Roll: {roll}, Name: {name}")

add_student("Alice", 101)
add_student("Bob", 102)
display()
