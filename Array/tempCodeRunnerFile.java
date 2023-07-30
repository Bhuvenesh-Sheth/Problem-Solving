import java.util.Scanner;
import java.io.*;

public class tempCodeRunnerFile {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Message: ");
        String message = ss.nextLine();
        System.out.println("enter generator: ");
        String generator = ss.nextLine();

        int data[] = new int[message.length() + generator.length() - 1];
        int divisor[] = new int[generator.length()];

        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + " ");
        }

        for (int i = 0; i < generator.length(); i++) {
            divisor[i] = Integer.parseInt(generator.charAt(i) + " ");
        }

        // calcalute CRC
        for (int i = 0; i < message.length(); i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] ^= divisor[j];
                }
            }
        }

        System.out.println("Checksum code is: ");
        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + " ");
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            System.out.println();
        }

        // reciever side
        System.out.println("Enter Checksum: ");
        message = ss.nextLine();
        System.out.println("enter generator: ");
        generator = ss.nextLine();

        data = new int[message.length() + generator.length() - 1];
        divisor = new int[generator.length()];

        for (int i = 0; i < message.length(); i++) {
            data[i] = Integer.parseInt(message.charAt(i) + " ");
        }

        for (int i = 0; i < generator.length(); i++) {
            divisor[i] = Integer.parseInt(generator.charAt(i) + " ");
        }

        // calculation of remainder
        for (int i = 0; i < message.length(); i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] ^= divisor[j];
                }
            }
        }

        // display vaild of display
        boolean valid = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) {
                valid = false;
                break;
            }
        }
        if (valid == true)
            System.out.println("Data stream is valid");
        else
            System.out.println("Data stream is invalid. CRC error occurred.");

    }
}