#include <stdio.h>

int main() {
    float a[6], average;
    int positives = 0;

    for (int i = 0; i < 6; i++) {
        scanf("%f", &a[i]);
    }

    for (int i = 0; i < 6; i++) {
        if (a[i] > 0) {
            positives ++;
            average += a[i];
        }
    }

    average = average / positives;

    printf("%d valores positivos\n", positives);
    printf("%.1f\n", average);

    return 0;
}