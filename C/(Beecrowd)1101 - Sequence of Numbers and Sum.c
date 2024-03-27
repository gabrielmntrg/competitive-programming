#include <stdio.h>

int main() {
    int m, n, sum;

    while (1) {
        scanf("%d %d", &m, &n);

        if (m <= 0 || n <= 0) {
            break;
        }

        int bigger = (m > n) ? m : n;
        int smaller = (m < n) ? m : n;
        sum = 0;

        for (int i = smaller; i <= bigger; i++) {
            sum += i;
            printf("%d ", i);
        }

        printf("Sum=%d\n", sum);
    }

    return 0;
}