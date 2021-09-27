package com.company;

public class Main {

    public static void main(String[] args) {
        Github github = new Github();

        github.addCommit("add Main.py");
        github.addCommit("delete Main.py");

        User bob = new User("Bobik");
        User dave = new User("Dave");
        User laura = new User("Laura");
        github.registerObserver(bob);
        github.unregisterObserver(dave);
        github.registerObserver(laura);

        github.addCommit("add test.py");
        github.removeCommit("add Main.py");
    }
}
