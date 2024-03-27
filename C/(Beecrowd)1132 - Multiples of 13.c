#include <stdio.h>

int main() {
    int x, y, sum = 0;

    scanf("%d", &x);
    scanf("%d", &y);

    if (x > y) {
        int aux = x;
        x = y;
        y = aux;
    }

    for (int i = x; i <= y; i++) {
        if (i % 13 != 0) {
            sum += i;
        }
    }

    printf("%d\n", sum);

    return 0;
}