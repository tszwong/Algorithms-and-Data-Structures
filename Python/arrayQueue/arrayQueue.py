class ArrayQueue:
    def __init__(self, capacity):
        self.queue = [None for i in range(capacity)]
        self.size = 0
        self.front = 0
        self.back = 0
        self.capacity = capacity

    def add(self, item):
        if self.back == len(self.queue):
            self.change_capacity()

        self.queue[self.back] = item
        self.size += 1
        self.back += 1

    def remove(self):
        if self.size == 0:  # check for empty queue
            return "Cannot remove item from empty queue"

        remove_item = self.queue[self.front]
        self.queue[self.front] = None
        self.front += 1
        self.size -= 1

        if self.size == 0:  # reset queue if we removed the only item in queue
            self.front = 0
            self.back = 0

        return remove_item

    def peek(self):
        return self.queue[self.front]

    def change_capacity(self):
        for i in range(capacity):
            self.queue += None

    def getSize(self):
        return self.size

    def __repr__(self):
        queue = ""
        for i in self.queue:
            if i != None:
                queue += str(i)
                queue += ", "

        return queue
