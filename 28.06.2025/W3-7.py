courses = {}
def enroll(student, course):
    courses.setdefault(course, []).append(student)
enroll("Deekshana", "AI")
print(courses)
