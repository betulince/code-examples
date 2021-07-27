with open('input.txt') as f:
    lines = f.readlines()

length_of_lines = [len(word_length) for word_length in lines]
max_length = max(length_of_lines)
index_for_longest = length_of_lines.index(max_length)
longest = len(lines[index_for_longest]) - 1 # \n'i de dahil ettiği için 1 çıkardım.

converted_lines = []
for element in lines:
    converted_lines.append(element.strip())

width = max(len(line) for line in converted_lines)
frame = ['*' + '*' * width + '*']

for line in converted_lines:
    center_alignment = line
    centered_word = f"{center_alignment : ^{longest}}"
    frame.append('*' + (centered_word + ' ' * width)[:width] + '*')
frame.append('*' + '*' * width + '*')

print('\n'.join(frame))
