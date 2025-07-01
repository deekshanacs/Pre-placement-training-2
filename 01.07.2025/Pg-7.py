contacts = {}

def add_contact(name, phone):
    contacts[name] = phone

def view_contacts():
    for name, phone in contacts.items():
        print(f"{name}: {phone}")

add_contact("Alice", "1234567890")
add_contact("Bob", "0987654321")
view_contacts()
