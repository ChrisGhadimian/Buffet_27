x = input("please enter any number ")
y = input("Please enter an operation ")
z = input("Please enter another number ")
if y == "+":
    print(int(x) + int(z))
elif y == "-":
    print(int(x) - int(z))
elif y == "*":
    print(int(x) * int(z))
elif y == "/":
    print(int(x) / int(z))
    print("The result of the operation is " + str(int(x) / int(z)))