#include <stdio.h>

int main() {
    int n, posit = 0, negat = 0, even = 0, odd = 0;

    for (int i = 0; i < 5; i++) {
        scanf("%d", &n);

        if (n > 0) {
            posit ++;
        }
        if (n < 0) {
            negat ++;
        }

        if (n % 2 == 0) {
            even ++;
        } else {
            odd ++;
        }
    }

    printf("%d valor(es) par(es)\n", even);
    printf("%d valor(es) impar(es)\n", odd);
    printf("%d valor(es) positivo(s)\n", posit);
    printf("%d valor(es) negativo(s)\n", negat);

    return 0;
}