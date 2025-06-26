import random
n = random.randint(1, 10)
guess = int(input("Guess (1-10): "))
print("Correct!" if guess == n else f"Wrong! It was {n}")
