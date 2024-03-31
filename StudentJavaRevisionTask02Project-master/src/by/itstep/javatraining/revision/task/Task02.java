package by.itstep.javatraining.revision.task;

/*	Task 02. Two Numbers [два числа]
 *
 *	Даны два целых числа. Программа должна вывести единицу,
 *	если первое число больше второго, двойку, если второе больше первого,
 *	или ноль, если они равны.
 *
 *	Примечание
 *  Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод принимает два любых целых числа в диапазоне типа int.
 *
 *	Формат выходных данных[output]
 *	Метод должен вывести результирующее число.
 *
 *	[Sample method input  1]: 7 6
 *	[Sample method output 1]: 1
 *
 *	[input  2]: 6 7
 *	[output 2]: 2
 *
 *	[input  3]: 7 7
 *	[output 3]: 0
 */

public class Task02 {
    public static int start(int a, int b) {
        int res = a > b ? 1 : 2;
        res = a == b ? 0 : res;

        return res;
    }
}