from itertools import product
k, m = map(int, input().split())
lists = []
for _ in range(k):
    lst = list(map(int, input().split()))[1:]  
    lists.append(lst)
all_combinations = product(*lists)
max_value = 0
for combo in all_combinations:
    total = sum(x**2 for x in combo) % m
    if total > max_value:
        max_value = total

print(max_value)
