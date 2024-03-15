a, b, c = input().split()
array = [int(a), int(b), int(c)]

for i in range(len(array)):
    for j in range(len(array)):
        if array[i] < array[j]:
            aux = array[j]
            array[j] =  array[i]
            array[i] = aux

print(array[0])
print(array[1])
print(array[2])
print("")
print(a)
print(b)
print(c)

# Don't use '.sort()' kids