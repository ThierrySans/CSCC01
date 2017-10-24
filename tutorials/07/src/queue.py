class EmptyQueueError(Exception):
    pass

class Queue():

    def __init__(self):
        '''constructor'''
        None

    def enqueue(self, obj):
        '''(Queue, Object) -> Nonetype
        add an object at the end of the the queue
        '''


    def dequeue(self):
        '''(Queue) -> Object
        remove an object from the beginning of the queue
        RAISES: EmptyQueueError
        '''


    def is_empty(self):
        '''(Queue) -> Boolean
        return true if the queue is empty, false otherwise
        '''
