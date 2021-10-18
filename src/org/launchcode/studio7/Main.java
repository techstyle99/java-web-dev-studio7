package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){


        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("article 01", 500, "constitution law", "CD");
        DVD dvd = new DVD("my favourite audiobook", 5000, "The Law of Power", "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.laserWritesData();
        dvd.laserReadsData();

    }
}
