class Node:
    def __init__(self, data):
        """ fields needed for node
        """

        self.data = data
        self.next = None

    def __repr__(self):
        """
        :return: string representation of data inside a node
        """

        return str(self.data)
