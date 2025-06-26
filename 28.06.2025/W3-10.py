import cmath
a, b, c = 1, 2, 1
d = cmath.sqrt(b**2 - 4*a*c)
print((-b + d) / (2*a), (-b - d) / (2*a))
