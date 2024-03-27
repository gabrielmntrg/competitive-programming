#include <stdio.h>

int main() {
    int seconds;

    scanf("%d", &seconds);
    printf("%d:", seconds / 3600);
    seconds %= 3600;
    printf("%d:", seconds / 60);
    seconds %= 60;
    printf("%d\n", seconds);

    return 0;
}