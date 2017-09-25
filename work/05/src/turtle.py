'''Turtles.'''


class Turtle:
    '''Turtle.'''

    def __init__(self, name, stands_on=None):
        '''Init a new Turtle with the given name and the Turtle to stand on.
        '''

        self._name = name
        self._stands_on = stands_on

    def name(self):
        '''Return the name of this Turtle.'''

        return self._name

    def stands_on(self):
        '''Return the Turtle on which this Turtle stands.'''

        return self._stands_on

    def all_the_way_down(self):
        return TurtlesAllTheWayDownIterator(self)

    def __cmp__(self, other_turtle):
        return cmp(self._name, other_turtle._name)

    def __iter__(self):
        return TurtleIterator(self)

    def __str__(self):
        return self._name


class TurtleIterator:
    '''Iterator over the Turtles.'''

    def __init__(self, turtle=None):
        self._curr_turtle = turtle

    def __iter__(self):
        return self

    def next(self):
        next_turtle = self._curr_turtle.stands_on()
        if next_turtle:
            self._curr_turtle = next_turtle
            return next_turtle
        else:
            raise StopIteration


class TurtlesAllTheWayDownIterator:
    '''It's turtles, all the way down!'''

    def __init__(self, turtle=None):
        self._iter = TurtleIterator(turtle)

    def __iter__(self):
        return self

    def next(self):
        try:
            return self._iter.next()
        except StopIteration:
            return Turtle("Another Turtle")


if __name__ == '__main__':
    '''Just some sample calls. Do not examine for presence of bugs in this
    part.
    '''

    # comparisons
    mr1 = Turtle('Mr.Turtle')
    mr2 = Turtle('Mr.Turtle')
    ms = Turtle('Ms.Turtle')
    print mr1 < ms
    print mr1 == mr2

    # iteration
    turtle = Turtle('T0', Turtle('T1', Turtle('T2')))
    print turtle
    for t in turtle:
        print t, 'on',
    print 'what?'

    # super iteration
    turtle = Turtle('T0', Turtle('T1', Turtle('T2')))
    print turtle
    for t in turtle.all_the_way_down():
        print t, 'on',
    print 'what?'
