from node import *


class LinkedList:
    def __init__(self):
        self.head = None  # initialize head pointer
        self.size = 0  # initialize size of list

    def addToFront(self, item):
        """ adding a new node to the front of the linked list
        """

        # creating a new node
        new_node = Node(item)

        if self.head is None:  # check if list is empty
            self.head = new_node
        else:
            new_node.next = self.head  # set the old head as new node's next
            self.head = new_node  # set the new node as the head

        self.size += 1  # increment size of the list after insertion

    def removeFromFront(self):
        """ removes the node at the front of the linked list
        """
        if self.head is None:
            return None

        remove_node = self.head   # store the node to be removed
        self.head = self.head.next  # set the head to head's next element
        del remove_node  # remove the selected node

        self.size -= 1  # decrement size of list after removal

    def __repr__(self):
        """ prints the linked list in a readable form
        :return: string representation of linked list
        """

        output = ""
        curr_node = self.head
        output += "Head --> "

        while curr_node:
            output += f"{str(curr_node.data)} --> "
            curr_node = curr_node.next

        output += "null"
        return output
