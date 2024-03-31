package by.itstep.javatraining.revision.task;

/*	Task 05. Lollipop Chupa-Chups [карамелька Чупа-Чупс]
 *
 *	Одна карамелька Chupa-Chups в магазине стоит A рублей и B копеек.
 *	Определите, сколько рублей и копеек нужно заплатить за N карамелек.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": стоимость карамельки и их количество - положительные величины.
 *	В случае неверных данных необходимо возвратить строку "error".
 *  2) Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод получает на вход три целых числа в диапазоне типа int: A, B, N.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить в виде строки два числа через пробел (стоимость покупки в рублях и копейках)
 *	или строку "error", если передаюся неверные данные.
 *
 *	[Sample method input  1]: 1 15 2
 *	[Sample method output 1]: 2 30
 *
 *	[ input 2]: 2 55 1
 *	[output 2]: 2 55
 *
 *	[ input 3]: 4 25 8
 *	[output 3]: 34 0
 *
 *	[ input 4]: 0 27 8
 *	[output 4]: 4 16
 *
 *	[ input 5]: 2 0 5
 *	[output 5]: 10 0
 *
 *	[ input 6]: -1 15 2
 *	[output 6]: error
 *
 *	[ input 7]: 1 -15 2
 *	[output 7]: error
 *
 *	[ input 8]: 1 15 -2
 *	[output 8]: error
 *
 *	[ input 9]: 1 15 -2
 *	[output 9]: error
 *
 *	[ input 10]: 0 0 2
 *	[output 10]: error
 *
 *	[ input 11]: 1 50 0
 *	[output 11]: error
 *
 */

public class Task05 {
    public static String start(int a, int b, int n) {
        return "error";
    }
}