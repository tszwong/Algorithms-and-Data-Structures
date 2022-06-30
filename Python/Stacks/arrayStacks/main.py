from arrayStack import *

stack = ArrayStack()  # create stack

# adding items to stack
stack.push(1)
stack.push(2)
stack.push(3)
stack.printStack()
print("Size of stack: ", stack.getSize(), "\n")

print(f"{stack.peek()}\n")

print("Item popped: ", stack.pop())
print("Size of stack: ", stack.getSize(), "\n")
stack.printStack()
print()

# using pop with empty stack
stack2 = ArrayStack()
stack2.pop()
print("Item popped: ", stack2.pop())
