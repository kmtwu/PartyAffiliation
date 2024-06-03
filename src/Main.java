//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party;
        System.out.println("What is your party affiliation?");
        party = in.nextLine();
        if (party.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equals("R")){
            System.out.println("You get a Republic Elephant.");
        }
        else if (party.equals("I")){
            System.out.println("You get an Independent Person.");
        }
        else{
            System.out.println("Your party lies in the 'Other' category.");
        }
    }
}