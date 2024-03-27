#include <stdio.h>

int main() {
    int x, y, bigger, smaller, sum = 0;

    scanf("%d", &x);
    scanf("%d", &y);
    bigger = (x > y) ? x : y;
    smaller = (x < y) ? x : y;

    for (int i = smaller+1; i < bigger; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }

    printf("%d\n", sum);

    return 0;
}