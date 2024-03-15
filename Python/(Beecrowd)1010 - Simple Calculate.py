code1, units1, price1 = input().split()
code2, units2, price2 = input().split()

total = int(units1) * float(price1) + int(units2) * float(price2)

print(f"VALOR A PAGAR: R$ {total:.2f}")