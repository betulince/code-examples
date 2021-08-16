"""
Row     Sequence
1       1
2       1 1
3       2 1
4       1 2 1 1
5       1 1 1 2 2 1
n       ?

Find the nth row of a given sequence.
1st row has "one" 1 --> 1 1 --> 2nd row
3rd row has "two" 1 --> 2 1 -->4th row
4th row has "one" 1 and "one" 2 and "two" 1 --> 1 1 1 2 2 1 --> 5th row

"""


def count_and_say(row):
    start = row[0]  # starting from the first element of the number;
    continuation_of_number = row[1:]  # progress by comparing all other elements
    counter_of_repetition = 1
    result = ""
    for element in continuation_of_number:
        if element == start:  # if row[0] == row[1]
            counter_of_repetition += 1
            continue  # as you move through the number, if it's equal to the element, keep the number of repetitions

        result += str(counter_of_repetition) + start
        start = element  # then change the element and apply the same operation to every element that is different
                         # from each other
        counter_of_repetition = 1  # reset counter
    return result + str(counter_of_repetition) + start


row = "11"
for i in range(0, 10):
    print(row)
    row = count_and_say(row)


"""
sample output:
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
11131221133112132113212221 
"""
