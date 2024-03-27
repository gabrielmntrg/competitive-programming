#include <stdio.h>

int main() {
    int n, i, sheeps = 0, attacks = 0, isOdd;

    scanf("%d", &n);
    int star[n];
    int attacked[n];

    for (i = 0; i < n; i++) {
        scanf("%d", &star[i]);
    }
    for (i = 0; i < n; i++) {
        attacked[i] = 0;
    }

    attacks++;
    star[0]--;
    i = 1;
    while (1) {
        if (i < 0 || i >= n) {
            break;
        } else {
            isOdd = (star[i] % 2 != 0) ? 1 : 0;

            if (star[i] > 0) {
                if (attacked[i] == 0) {
                    attacked[i] = 1;
                    star[i]--;
                    attacks++;
                } else {
                    star[i]--;
                }
            }

            if (isOdd) {
                i++;
            } else {
                i--;
            }
        }
    }

    for (i = 0; i < n; i++) {
        sheeps += star[i];
    }

    printf("%d %d\n", attacks, sheeps);

    return 0;
}