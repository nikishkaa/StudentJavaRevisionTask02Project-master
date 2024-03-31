package by.itstep.javatraining.revision.task;

/*	Task 07. The sum of the digits of a four-digit number [сумма цифр четырёхзначного числа]
 *
 *	Дано целое четырёхзначное число (или меньше). Найдите сумму его цифр.
 *
 *  Примечание
 *  1) Число может быть как положительным, так и отрицательным.
 *  2) Не забудьте про "защиту от дурака": если число превышает четырёхзначное, то нужно возвратить ноль
 *  3) Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод принимает на вход любое целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить одно целое число - ответ на задачу или ноль - в случае неверных данных.
 *
 *	[Sample method input  1]: 1234
 *	[Sample method output 1]: 10
 *
 *	[ input 2]: -9999
 *	[output 2]: 36
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 * 	[ input 4]: 12345
 *	[output 4]: 0
 *
 * 	[ input 5]: -12345
 *	[output 5]: 0
 *
 * 	[ input 6]: -123
 *	[output 6]: 6
 *
 * 	[ input 7]: 12
 *	[output 7]: 3
 */

public class Task07 {
    public static int start(int number) {
        if (number < -9999 || number > 9999) {
            return 0;
        }

        number = number > 0 ? number : -number;
        int count = 0;


        while (number > 0) {
            count += number % 10;
            number = number / 10;
        }


        return count;
    }
}