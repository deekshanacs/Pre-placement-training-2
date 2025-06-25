t = int(input())

for _ in range(t):
    a_len = int(input())
    a_set = set(map(int, input().split()))
    b_len = int(input())
    b_set = set(map(int, input().split()))
    print(a_set.issubset(b_set))
