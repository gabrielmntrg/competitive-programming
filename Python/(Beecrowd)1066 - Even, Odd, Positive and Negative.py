even = 0
odd = 0
posit = 0
negat = 0

for i in range(5):
    number = int(input())
    
    if number % 2 == 0:
        even += 1
    else:
        odd += 1

    if number > 0:
        posit += 1
    elif number < 0:
        negat += 1

print(even, "valor(es) par(es)")
print(odd, "valor(es) impar(es)")
print(posit, "valor(es) positivo(s)")
print(negat, "valor(es) negativo(s)")