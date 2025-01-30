package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου, ηλικία > 18
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isVotingEligible = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age");
        age = in.nextInt();

        isVotingEligible = age >= VOTING_AGE;
        System.out.printf("%d years old is eligible to vote: %b", age, isVotingEligible);
    }
}
