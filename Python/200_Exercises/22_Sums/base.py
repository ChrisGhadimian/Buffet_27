number = input("please enter a number ")
x = input("the sum of 1 to " + number + " is" + number)
print(x)
if number.isdigit():
    number = int(number)
    x = input("the sum of 1 to " + str(number) + " is" + str(number))
    print(x)
else:
    print("Invalid input")
    number = None