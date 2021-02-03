package com.training.concepts;

public class StringConcepts {

    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        String fullName = name.concat(" Doe ");
        System.out.println(fullName);
        String name1 = "John";

       /* isNameValid(name);
        splitName(name);

        // Check for unnecessary characters in a name - john

        for (int i = 0; i < name.length(); i++) {
            final char c = name.charAt(i);
            // check whether the char c is an alphabet. if not an alphabet  print invalid and exit the loop
            if (!isAnAlphabet(c)) {
                System.out.println("Contains invalid characters");
                break;
            }
        }

        readMultipleNames();*/


    }

    private static boolean isAnAlphabet(char c) {
        return false;
    }

    private static void isNameValid(String name) {
        if (org.apache.commons.lang3.StringUtils.isNotBlank(name))
            System.out.println("Name is Invalid");
        else
            System.out.println("Name is valid");


    }

    static void readMultipleNames() {
        String[] csv = {
                "1,John,12000,30",
                "2,Jane,25000,21",
                "3,Max,45000,35",
                "4,Mark,21000,28"};

        // 1. Read each entry in the string array
        // 2. Since the entry is a String containing comma separated values, I will split each string by comma.
        // 3. Step #2 gives individual entries for the employee into a string array. Using the index of individual
        // parts of the array create employee object
        //4. call display information on employee object


        String[] names = new String[csv.length];
        int index = 0;
        for (String info : csv) {
            final String[] infoParts = info.split("|");
            names[index++] = infoParts[1];
        }

    }

    // John Doe
    private static void splitName(String name) {
        if (isStringEmpty(name)) {
            System.out.println("You can split the name.");
            return;
        }


        String[] nameParts = name.split(" ");
        for (String namePart : nameParts) {
            System.out.println(namePart);
        }


    }

    private static boolean isStringEmpty(String name) {
        return StringUtils.isStringEmpty(name);
    }
}
