package org.example;

public class Main {
    static void main() throws ClassNotFoundException {
        /*
            1. import package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7. close
         */

        Class.forName("org.postgresql.Driver");
    }
}
