import math
def lcm_hcf(a, b):
    return math.lcm(a, b), math.gcd(a, b)
print(lcm_hcf(12, 18))
