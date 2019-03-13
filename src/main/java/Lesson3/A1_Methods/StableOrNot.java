package Lesson3.A1_Methods;



public class StableOrNot {

    public void stableBuild (double passedTC, double failedTC, double allUnresIssues, double unresIssuesHigh, double unresIssuesBlockCrit) {

        if (failedTC > (0.2 *(passedTC + failedTC))) {
            System.out.println("\nRelease failed, quantity of failedTC is more then 20%");
        }
        if (failedTC == (0.2 *(passedTC + failedTC))) {
            System.out.println("\nRelease failed, quantity of failedTC is 20%");
        }
        if (unresIssuesHigh > 10) {
            System.out.println("\nRelease failed, quantity of unresolved issues with HIGH priority is more then 10");
        }
        if (unresIssuesBlockCrit > 5) {
            System.out.println("\nRelease failed, quantity of unresolved issues with Blocker/Critical severity is more then 5");
        }
        if (unresIssuesBlockCrit == 5) {
            System.out.println("\nRelease failed, quantity of unresolved issues with Blocker/Critical severity is 5");
        }
        if (unresIssuesBlockCrit > 0.05*allUnresIssues) {
            System.out.println("\nRelease failed, quantity of unresolved issues with Blocker and Critical severity is more then 5%");
        }
        if (unresIssuesBlockCrit == 0.05*allUnresIssues) {
            System.out.println("\nRelease failed, quantity of unresolved issues with Blocker and Critical severity 5%");
        }
        if (failedTC < (0.2 *(passedTC + failedTC)) && unresIssuesHigh <= 10 && unresIssuesBlockCrit < 5 && unresIssuesBlockCrit < 0.05*allUnresIssues) {
            System.out.println("\nRelease is stable");
        }

    }

}
