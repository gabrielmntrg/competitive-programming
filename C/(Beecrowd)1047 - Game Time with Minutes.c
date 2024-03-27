#include <stdio.h>

int main() {
    int startHour, endHour;
    int startMinute, endMinute;
    int durationHour, durationMinute;
    
    scanf("%d %d %d %d", &startHour, &startMinute, &endHour, &endMinute);

    durationHour = endHour - startHour;
    durationMinute = endMinute - startMinute;

    if (startHour == endHour && startMinute == endMinute) {
        printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    } else {
        if (durationMinute < 0) {
            durationHour--;
            durationMinute += 60;
        }

        if (durationHour < 0) {
            durationHour += 24;
        }

        printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHour, durationMinute);
    }

    return 0;
}