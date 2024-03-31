package by.itstep.javatraining.revision.task;

/*	Task 06. Triangle [треугольник]
 *
 *	Даны три натуральных числа a, b, c.
 *	Определите, существует ли треугольник с такими сторонами.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": стороны треугольника - положительные величины.
 *	В случае неверных данных необходимо возвратить строку false.
 *  2) Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод принимает три целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить одно из булевских значений true или false.
 *
 *	[Sample method input  1]: 3 4 5
 *	[Sample method output 1]: true
 *
 *	[input  2]: 1 1 3
 *	[output 2]: false
 */

public class Task06 {
    public static boolean start(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        boolean rect = true;

        if (a >= b + c || b >= a + c || c >= b + a) {
            rect = false;
        }


        return rect;
    }
}