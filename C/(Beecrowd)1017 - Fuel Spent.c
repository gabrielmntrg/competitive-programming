#include <stdio.h>

int main() {
    int hours, kmH;

    scanf("%d", &hours);
    scanf("%d", &kmH);

    printf("%.3f\n", hours * kmH / 12.0);

    return 0;
}