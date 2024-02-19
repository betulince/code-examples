# The last term in Juggler Sequence is always 1.

import math


def n_is_odd(n):
    return math.floor(n ** (3 / 2))


def n_is_even(n):
    return math.floor(n ** (1 / 2))


def print_juggler_sequence(number):
    juggler_sequence = [number]
    while number != 1:
        if number % 2 == 0:
            next_number = n_is_even(number)
            juggler_sequence.append(next_number)
            number = next_number

        else:
            next_number = n_is_odd(number)
            juggler_sequence.append(next_number)
            number = next_number
    print(juggler_sequence)


print_juggler_sequence(9)
