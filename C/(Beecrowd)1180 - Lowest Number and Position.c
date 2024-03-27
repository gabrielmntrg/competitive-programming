#include <stdio.h>

int main() {
    int n, lowest, pos;

    scanf("%d", &n);
    int x[n];

    for (int i = 0; i < n; i++) {
        scanf("%d", &x[i]);
    }

    lowest = x[0];
    pos = 0;
    for (int i = 0; i < n; i++) {
        if (x[i] < lowest) {
            lowest = x[i];
            pos = i;
        }
    }

    printf("Menor valor: %d\n", lowest);
    printf("Posicao: %d\n", pos);

    return 0;
}