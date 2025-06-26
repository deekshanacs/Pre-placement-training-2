inventory = {"Apples": 50, "Oranges": 30}
def update_stock(item, qty):
    inventory[item] = inventory.get(item, 0) + qty
update_stock("Bananas", 20)
print(inventory)

