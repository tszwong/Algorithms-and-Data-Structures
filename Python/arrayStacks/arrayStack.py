class ArrayStack:
    def __init__(self):
        """ constructors for stack
        """
        self.stack = []  # array for stack
        self.top = 0  # the next available position in the stack, top - 1 is the top item in stack
        self.size = self.top

    def push(self, item):
        """ adding an item to the top of the stack
        :param item: object that will be added to stack
        """
        self.stack.append(item)
        self.top += 1
        self.size += 1

    def pop(self):
        """ remove the last object of the stack
        :return: item being popped from stack
        """
        if self.size == 0:
            return "Cannot remove item from empty stack"

        self.top -= 1
        self.size -= 1
        item_removed = self.stack[self.top]
        del self.stack[self.top]  # remove item
        return item_removed

    def peek(self):
        """ get the item that sits at the top of the stack
        :return: item at the top of stack
        """
        return self.stack[self.top - 1]

    def getSize(self):
        """ :return: size of stack
        """
        return self.size

    def printStack(self):
        """ prints the stack
        """
        print(self.stack)
