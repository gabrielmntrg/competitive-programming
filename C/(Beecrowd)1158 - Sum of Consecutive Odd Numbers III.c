#include <stdio.h>

int main() {
    int n;

    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int x, y, sum = 0, count = 0;
        scanf("%d %d", &x, &y);
        
        for (int j = x; count < y; j++) {
            if (j % 2 != 0) {
                sum += j;
                count++;
            }
        }

        printf("%d\n", sum);
    }

    return 0;
}