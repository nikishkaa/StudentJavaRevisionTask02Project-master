package by.itstep.javatraining.revision.task;

/*	Task 04. Rectangular World (2) [прямоугольный мир]
 *
 *	В прямоугольном мире есть свинья, раскормленная до размеров параллелепипеда.
 *	Определите, может ли основание свиньи полностью поместиться в прямоугольную лужу грязи,
 *	заданную сторонами А и B.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": все входные данные должны быть больше нуля.
 *	В случае неверных данных необходимо возвратить значение false.
 *  2) Для решения задачи рекомендуется использовать только встроенные в язык Java операции.
 *
 *	Формат входных данных [input]
 *	Метод получает на вход четыре целых числа в диапазоне типа int: W (width), L (length),
 *  A и B - ширину и длину прямоугольной свиньи, а также стороны прямоугольной лужи.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить соответствующее значение булевского типа.
 *
 *  [Sample method input  1]: 4 6 5 5
 *  [Sample method output 1]: false
 *
 *	[ input 2]: 3 5 5 4
 *	[output 2]: true
 *
 *	[ input 3]: 0 5 5 4
 *	[output 3]: false
 *
 *	[ input 4]: 3 5 -5 4
 *	[output 4]: false
 */

public class Task04 {
    public static boolean start(int width, int length, int a, int b) {
        if (width <= 0 || length <= 0 || a <= 0 || b <= 0) {
            return false;
        }

        return (length <= Math.max(a, b) && width <= Math.min(a, b)) ||
                (length <= Math.min(a, b) && width <= Math.max(a, b));
    }
}