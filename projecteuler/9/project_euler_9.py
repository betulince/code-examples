import time

start = time.time()


def pythagorean_triplet(a, b, c):
    if pow(a, 2) + pow(b, 2) == pow(c, 2):
        print(a * b * c)


# Hiçbir element elementlerin toplamının yarısından büyük olamaz.
# c'yi de ilk başta for döngüsüne aldım ama işlem o zaman çok uzadı.
# a+b+c = 1000 olduğu için c = 1000-a-b oluyor, fonksiyona direkt bu şekilde gönderebilirim.
# b'nin aralığını en başta 1,500 verdim o zaman iki kez hesapladı o yüzden b'yi a'dan başlattım.

sum = 1000
for a in range(1, 500):
    for b in range(a, 500):
        c = sum - a - b
        pythagorean_triplet(a, b, c)

end = time.time()
print(f"runtime of the program is {end - start}")
