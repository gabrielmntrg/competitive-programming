#include <stdio.h>

int main() {
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);
    int d[3] = {a, b, c};

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (d[i] < d[j]) {
                int aux = d[i];
                d[i] = d[j];
                d[j] = aux;
            }
        }
    }

    printf("%d\n%d\n%d\n", d[0], d[1], d[2]);
    printf("\n%d\n%d\n%d\n", a, b, c);

    return 0;
}