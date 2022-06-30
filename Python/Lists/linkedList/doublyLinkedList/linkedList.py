from node import *


class LinkedList:
    def __init__(self):
        self.head = None  # initialize head pointer
        self.tail = None  # initialize previous pointer
        self.size = 0  # initialize size of list

    def addToFront(self, item):
        """ adding a new node to the front of the linked list
        """

        new_node = Node(item)  # create new node

        if self.head is None and self.tail is None:  # check if list is empty
            self.tail = new_node  # set tail pointer to new node
        else:
            self.head.previous = new_node  # set the former head's previous to the new node
            new_node.next = self.head  # set the new node's next to the former head

        self.head = new_node  # set the new head pointer to the new node
        self.size += 1  # increment size of list

    def addToEnd(self, item):
        """ adding a new node to the end of the linked list
        """

        new_node = Node(item)  # create new node
        if self.tail is None:  # check if the list is empty
            self.head = new_node  # set head pointer to new node
        else:
            self.tail.next = new_node  # set the former tail's next to new node

        new_node.previous = self.tail  # set new node's previous to former tail
        self.size += 1  # increment size of list

    def removeFromFront(self):
        """ removes the node at the front of the linked list
        """

        if self.head is None:
            return None

        remove_node = self.head  # store the node to be removed
        if remove_node.next is None:  # set tail pointer to None if there is only one node in list
            self.tail = None
        else:
            self.head.next.previous = None  # set head's next's previous pointer to None

        self.head = self.head.next  # set the head pointer to former head's next
        del remove_node  # remove the front node
        self.size -= 1  # decrement size of list after removal

    def removeFromEnd(self):
        """ removes the node at the front of the linked list
        """

        if self.head is None:  # check if list is empty
            return None

        remove_node = self.tail  # select node to remove
        if self.tail.previous is None:  # check if list only contains one object
            self.head = None
        else:
            self.tail.previous.next = None

        self.tail = remove_node.previous  # set the tail to the previous object of node removed
        del remove_node  # remove the node
        self.size -= 1  # decrement size of list

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
