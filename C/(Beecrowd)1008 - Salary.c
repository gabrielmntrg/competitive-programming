#include <stdio.h>

int main() {
    int employeNumber, workingHours;
    float receivePerHour, salary;

    scanf("%d", &employeNumber);
    scanf("%d", &workingHours);
    scanf("%f", &receivePerHour);

    salary = workingHours * receivePerHour;

    printf("NUMBER = %d\nSALARY = U$ %.2f\n", employeNumber, salary);

    return 0;
}