package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    private static String getResult(String task, boolean result) {
        return task + " " + (result ? RIGHT : WRONG);
    }

    public static String testingTask01() {
        boolean result = Task01.start(10, 15) == 15
                && Task01.start(40, 25) == 40
                && Task01.start(7, 7) == 7
                && Task01.start(10, -15) == 10
                && Task01.start(-40, 25) == 25
                && Task01.start(-7, -7) == -7;

        return getResult("Task 01", result);
    }

    public static String testingTask02() {
        boolean result = Task02.start(7, 6) == 1
                && Task02.start(6, 7) == 2
                && Task02.start(7, 7) == 0
                && Task02.start(5, -6) == 1
                && Task02.start(-6, 5) == 2
                && Task02.start(-5, -5) == 0;

        return getResult("Task 02", result);
    }

    public static String testingTask03() {
        boolean result = Task03.start(3, 5, 5)
                && Task03.start(1, 1, 1)
                && Task03.start(1, 1, 2)
                && Task03.start(1, 2, 2)
                && Task03.start(2, 1, 2)
                && !Task03.start(2, 1, 1)
                && !Task03.start(1, 2, 1)
                && !Task03.start(4, 6, 5)
                && !Task03.start(1, 1, -1)
                && !Task03.start(-1, 1, 1)
                && !Task03.start(1, -1, 1)
                && !Task03.start(0, 1, 1)
                && !Task03.start(1, 0, 1)
                && !Task03.start(1, 1, 0)
                && !Task03.start(0, 0, 0)
                && !Task03.start(-1, -1, -1);

        return getResult("Task 03", result);
    }

    public static String testingTask04() {
        boolean result = !Task04.start(4, 6, 5, 5)
                && Task04.start(3, 5, 5, 4)
                && Task04.start(1, 1, 1, 1)
                && Task04.start(2, 2, 2, 2)
                && Task04.start(1, 2, 2, 2)
                && Task04.start(2, 1, 2, 2)
                && Task04.start(1, 2, 1, 2)
                && Task04.start(1, 2, 2, 1)
                && Task04.start(2, 1, 1, 2)
                && Task04.start(2, 1, 2, 1)
                && !Task04.start(3, 2, 2, 2)
                && !Task04.start(2, 3, 2, 2)
                && !Task04.start(3, 3, 2, 2)
                && !Task04.start(3, 3, 3, 2)
                && !Task04.start(3, 3, 2, 3)
                && !Task04.start(-3, 3, 2, 3)
                && !Task04.start(3, -3, 2, 3)
                && !Task04.start(-3, -3, 2, 3)
                && !Task04.start(3, 3, -2, 3)
                && !Task04.start(3, 3, 2, -3)
                && !Task04.start(3, 3, -2, -3)
                && !Task04.start(-3, -3, -2, -3)
                && !Task04.start(0, 3, 2, 3)
                && !Task04.start(3, 0, 2, 3)
                && !Task04.start(3, 3, 0, 3)
                && !Task04.start(3, 3, 2, 0);

        return getResult("Task 04", result);
    }

    public static String testingTask05() {
        boolean result = Task05.start(10, 15, 2).trim().equalsIgnoreCase("20 30")
                && Task05.start(4, 25, 8).trim().equalsIgnoreCase("34 0")
                && Task05.start(1, 1, 8).trim().equalsIgnoreCase("8 8")
                && Task05.start(1, 1, 1).trim().equalsIgnoreCase("1 1")
                && Task05.start(0, 25, 3).trim().equalsIgnoreCase("0 75")
                && Task05.start(10, 5, 4).trim().equalsIgnoreCase("40 20")
                && Task05.start(0, 1, 10).trim().equalsIgnoreCase("0 10")
                && Task05.start(1, 0, 10).trim().equalsIgnoreCase("10 0")
                && Task05.start(1, 99, 4).trim().equalsIgnoreCase("7 96")
                && Task05.start(0, 27, 8).trim().equalsIgnoreCase("2 16")
                && Task05.start(2, 0, 5).trim().equalsIgnoreCase("10 0")
                && Task05.start(-1, 15, 2).trim().equalsIgnoreCase("error")
                && Task05.start(1, -15, 2).trim().equalsIgnoreCase("error")
                && Task05.start(1, 15, -2).trim().equalsIgnoreCase("error")
                && Task05.start(-1, -15, 2).trim().equalsIgnoreCase("error")
                && Task05.start(-1, 15, -2).trim().equalsIgnoreCase("error")
                && Task05.start(1, -15, -2).trim().equalsIgnoreCase("error")
                && Task05.start(-1, -15, -2).trim().equalsIgnoreCase("error")
                && Task05.start(0, 0, 2).trim().equalsIgnoreCase("error")
                && Task05.start(1, 15, 0).trim().equalsIgnoreCase("error")
                && Task05.start(0, 0, 0).trim().equalsIgnoreCase("error");

        return getResult("Task 05", result);
    }

    public static String testingTask06() {
        boolean result = Task06.start(1, 1, 1)
                && Task06.start(3, 4, 5)
                && Task06.start(5, 3, 4)
                && Task06.start(4, 5, 3)
                && !Task06.start(1, 2, 3)
                && !Task06.start(1, 1, 3)
                && !Task06.start(1, 3, 1)
                && !Task06.start(3, 1, 1)
                && !Task06.start(-3, -4, -5)
                && !Task06.start(-3, 4, 5)
                && !Task06.start(3, -4, 5)
                && !Task06.start(3, 4, -5)
                && !Task06.start(-1, -1, -1);

        return getResult("Task 06", result);
    }

    public static String testingTask07() {
        boolean result = Task07.start(1234) == 10
                && Task07.start(-9999) == 36
                && Task07.start(0) == 0
                && Task07.start(12345) == 0
                && Task07.start(-12345) == 0
                && Task07.start(-123) == 6
                && Task07.start(12) == 3
                && Task07.start(-12) == 3
                && Task07.start(1) == 1
                && Task07.start(-1) == 1
                && Task07.start(1111) == 4
                && Task07.start(-1111) == 4
                && Task07.start(9876) == 30
                && Task07.start(-9876) == 30
                && Task07.start(9000) == 9
                && Task07.start(-9000) == 9
                && Task07.start(9999) == 36;

        return getResult("Task 07", result);
    }

    public static String testingTaskX() {
        boolean result = TaskX.start(8, 13) == 2
                && TaskX.start(45, 55) == 0
                && TaskX.start(55, 45) == 0
                && TaskX.start(2, 5) == 1
                && TaskX.start(1, 4) == 2
                && TaskX.start(1, 8) == 20
                && TaskX.start(8, 1) == 20
                && TaskX.start(5, 15) == 40
                && TaskX.start(5000, 5101) == 50
                && TaskX.start(-1, 2) == -1
                && TaskX.start(45, -55) == -1
                && TaskX.start(0, 2) == -1
                && TaskX.start(2, 0) == -1;

        return getResult("Task X ", result);
    }
}
