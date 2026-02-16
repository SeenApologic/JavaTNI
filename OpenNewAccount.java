package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }
    public boolean isExistingAccount() {

        File file = new File(getFilename());

        if (!file.exists()) {
            return false;
        }

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()) {

                String line = sc.nextLine();
                String[] data = line.split(",");

                if (data[0].equals(getAccId())) {
                    return true;   // เลขบัญชีซ้ำ
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return false;
    }

    public String recordAccount() {

            if (isExistingAccount()) {
                return "This account has been created!!";
            }

            try (FileWriter fw = new FileWriter(getFilename(), true)) {

                fw.write(toString());
                fw.write("\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return "Created account success!!";
        }
    }
