def run_quiz():
    questions = {
        "What is the capital of France?": "Paris",
        "What is 5 + 7?": "12",
        "What color is the sun?": "Yellow"
    }
    score = 0
    for q, a in questions.items():
        user = input(q + " ")
        if user.strip().lower() == a.lower():
            score += 1
    print(f"Final Score: {score}/{len(questions)}")
