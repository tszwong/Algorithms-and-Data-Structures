from linkedList import *


# create stack and nodes
ll_stack = LinkedList()
node_1 = Node(1)
node_2 = Node(2)
node_3 = Node(3)

# pushing nodes to stack
ll_stack.push(node_1)
ll_stack.push(node_2)
ll_stack.push(node_3)
print(ll_stack)
print(ll_stack.getSize())

# pop node
ll_stack.pop()
print(ll_stack)
print(ll_stack.getSize())

# peek
print()
print("Peek item: ",ll_stack.peek())
