library = {"Harry Potter": "Available", "1984": "Issued"}
def issue_book(book):
    if library.get(book) == "Available":
        library[book] = "Issued"
    print(library)

issue_book("Harry Potter")
