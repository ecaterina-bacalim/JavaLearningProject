package md.tekwillacademy.gitworkflow;

public class GitStepByStepGuide {
    public static void main(String[] args) {
        String step1 = "Execute git stash command in order to save the changes";
        String step2 = "Go to the main branch - execute git checkout master";
        String step3 = "Get the latest changes - sync with origin/master - git fetch";
        String step4 = "Download the differences - git pull";
        String step5 = "Create a new dedicated branch for the task - git checkout -b Branch_name";
        String step6 = "Add code changes - implementing the required task";
        String step7 = "Save the changes on local memory -git commit";
        String step8 = "Upload the changes into cloud -git push";
        String step9 = "Go to github repository ";
        String step10 = "Create anew Pull Request into the origin/master branch";
        String step11 = "Invite the colaborators to review the code";
        String step12 = "Merge the code";
        String steps_12_1 = "If changes based on review are required, I have to modify my local branch and perform a git commit amend";
        String steps_12_2 = "After git commit amend we have to do force push -f";
        String step13 = "Delete the created secondary branch as it is already merged";
        String step14 = "Go to Intellij idea and checkout to the master branch";
        String step15 = "Download the latest version of the origin/master git checkout master";

       System.out.println("1. "+ step1);
       System.out.println("2. "+ step2);
       System.out.println("3. "+ step3);
       System.out.println("4. "+ step4);
       System.out.println("5. "+ step5);
       System.out.println("6. "+ step6);
       System.out.println("7. "+ step7);
       System.out.println("8. "+ step8);
       System.out.println("9. "+ step9);
       System.out.println("10. "+ step10);
       System.out.println("11. "+ step11);
       System.out.println("12. "+ step12);
       System.out.println("   12.1. "+ steps_12_1);
       System.out.println("   12.2. "+ steps_12_2);
       System.out.println("13. "+ step13);
       System.out.println("14. "+ step14);
       System.out.println("15. "+ step15);

    }
}
