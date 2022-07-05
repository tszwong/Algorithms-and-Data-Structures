from arrayQueue import *


int_queue = ArrayQueue(5)
int_queue.add(1)
int_queue.add(2)
int_queue.add(3)
int_queue.add(4)
int_queue.add(5)
print(int_queue)
print(f"size: {int_queue.getSize()}\n")


int_queue.remove()
int_queue.remove()
print(int_queue)
print(f"size: {int_queue.getSize()}\n")

print(f"peek: {int_queue.peek()}")
