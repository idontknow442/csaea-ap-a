# Data
animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

# Define a function that takes in the list above, and an animal 'name' as an argument.
# Loop through the list to check if it's there.
# Print "<animal> is in the list" or "<animal> is not in the list".
# Then call the function with the following tests: 

# Procedure 1
def check_animal(name):
    for animal in animals:
        if animal == name:
            print(f"{name} is in the list")
            return
    print(f"{name} is not in the list")

check_animal("cat")
check_animal("penguin")

print("Hello World");