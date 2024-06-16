import java.util.*;
class RockPaperScissors 
{
    public static String Winner(String playerChoice, String computerChoice) 
    {
        if (playerChoice.equalsIgnoreCase(computerChoice)) 
        {
            return "It's a tie!";
        } 
        else if ((playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) || (playerChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock"))) 
        {
            return "You win!";
        } 
        else {
            return "Computer wins!";
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("===>> Welcome to Rock, Paper, Scissors! <<===");
        System.out.println("Enter your choice: (rock, paper, or scissors)");
        String playerChoice = sc.next();
        if (!playerChoice.equalsIgnoreCase("rock") && !playerChoice.equalsIgnoreCase("paper") && !playerChoice.equalsIgnoreCase("scissors")) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }
        int computerChoiceIndex = random.nextInt(3);
        String choices[] = {"rock", "paper", "scissors"};
        String computerChoice = choices[computerChoiceIndex];
        System.out.println("Computer chooses: " + computerChoice);
        String result = Winner(playerChoice, computerChoice);
        System.out.println(result);
    }
}