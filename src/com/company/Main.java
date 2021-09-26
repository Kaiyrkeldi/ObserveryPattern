package com.company;

public class Main {

    public static void main(String[] args) {
        Github hhKz = new Github();

        hhKz.addCommit("add Main.py");
        hhKz.addCommit("delete Main.py");

        User bob = new User("Bobik");
        User dave = new User("Dave");
        User laura = new User("Laura");
        hhKz.registerObserver(bob);
        hhKz.unregisterObserver(dave);
        hhKz.registerObserver(laura);

        hhKz.addCommit("add test.py");
        hhKz.removeCommit("add Main.py");
    }
}
