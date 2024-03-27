#include <stdio.h>

unsigned long long fibonacci(int n) {
    unsigned long long prev = 0, next = 1, current = 0;

    if (n == 0) {
        return prev;
    } else if (n == 1) {
        return next;
    } else {
        for (int i = 2; i <= n; i++) {
            current = prev + next;
            prev = next;
            next = current;
        }
    }
    return current;
}

int main() {
    int t, n;

    scanf("%d", &t);
    for (int i = 0; i < t; i++) {
        scanf("%d", &n);
        unsigned long long fib = n;
        printf("Fib(%d) = %llu\n", n, fibonacci(fib));
    }

    return 0;
}