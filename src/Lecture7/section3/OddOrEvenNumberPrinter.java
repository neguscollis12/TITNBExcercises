package Lecture7.section3;

public class OddOrEvenNumberPrinter {
    public static void main(String[] args) {
        printOddOrEvenNumbers(10, 'O');
        printOddOrEvenNumbers(10, 'E');
    }

    public static void printOddOrEvenNumbers(int num , char type){
        int temp = 0;
        switch (type){
            case 'E':
                temp = 2;
                break;
            case 'O':
                temp = 1;
                break;
        }
        while (temp <= num){
            System.out.println(temp);
            temp += 2;
        }
    }
}
