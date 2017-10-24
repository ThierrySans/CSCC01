class BoundedQueue:
    """A queue with bounded capacity."""

    def __init__(self, capacity, contents=None):
        """class BoundedQueue(int[, iterable])

        Create a BoundedQueue with the given capacity (non-negative
        integer) and elements from the given iterable, in FIFO order
        (first element in the iterable is next to be dequeued). Only
        the first capacity elements from iterable are added to the
        created BoundedQueue.

        """
        
        self._capacity = int(capacity)
        self._contents = []
        if contents:
            it = iter(contents)
            while len(self._contents) < self._capacity:
                try:
                    self._contents.append(next(it))
                except StopIteration:
                    return

    def size(self):
        """Return the number of elements in this BoundedQueue.
        """

        return len(self._contents)

    def is_empty(self):
        """Return whether this BoundedQueue is empty.
        """

        return self._contents == []

    def enqueue(self, item):
        """Add the given item to the end of this BoundedQueue, if capacity
        permits. Otherwise, do nothing.
        """

        if len(self._contents) < self._capacity:
            self._contents.append(item)

    def dequeue(self):
        """Remove and return the first item in this BoundedQueue.
        Raises IndexError if called on an empty BoundedQueue.
        """

        return self._contents.pop(0)
