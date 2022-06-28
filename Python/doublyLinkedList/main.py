from linkedList import *
from node import *


# creation of nodes
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4)

# adding/removing nodes
list = LinkedList()  # creation of linked list
list.addToFront(node1)
list.addToFront(node2)
list.addToFront(node3)
list.addToFront(node4)

print(f"{list}\nsize of list: {list.size}\n")

list.removeFromFront()
print(f"{list}\nsize of list: {list.size}\n")

num_node = Node(1)
num_node2 = Node(2)
num_list = LinkedList()
num_list.addToFront(num_node)
print(f"{num_list}\nsize of list: {num_list.size}\n")

num_list.addToFront(num_node2)
print(f"{num_list}\nsize of list: {num_list.size}\n")

num_list.removeFromEnd()
print(f"{num_list}\nsize of list: {num_list.size}\n")
