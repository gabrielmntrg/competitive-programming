#include <stdio.h>

int main() {
    int start, end, duration;

    scanf("%d %d", &start, &end);

    if (start < end) {
        duration = end - start;
    } else if (start > end) {
        duration = end - start + 24;
    } else {
        duration = 24;
    }

    printf("O JOGO DUROU %d HORA(S)\n", duration);

    return 0;
}