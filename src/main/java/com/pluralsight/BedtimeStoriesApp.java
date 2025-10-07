package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStoriesApp {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String menu = """
                            Available Stories
                ========================================    
                1 - Goldilocks and the Three bears
                2 - Handsel and Gretel
                3 - Mary had a Little Lamb
                
                Select a story: 
                """;

        System.out.print(menu);
        String story = input.nextLine().toLowerCase();

        BufferedReader bufferedReader;

        try {
            switch (story) {
                case "1":
                    bufferedReader = new BufferedReader(
                            new FileReader("goldilocks.txt"));
                    break;
                case "2":
                    bufferedReader = new BufferedReader(
                            new FileReader("handsel_and_gretel.txt"));
                    break;
                case "3":
                    bufferedReader = new BufferedReader(
                            new FileReader("mary_had_a_little_lamb.txt"));
                    break;
                default:
                    throw new IOException("Story not found!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
