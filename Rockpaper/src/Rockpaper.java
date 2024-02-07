import java.util.*;

import javax.print.DocFlavor.STRING;
public class Rockpaper {
    public static void main(String[] args){
        Scanner ch=new Scanner(System.in);
        System.out.printf("1.ROCK%n2.SCISSOR%n3.PAPER%n");
        System.out.println("ENTER YOUR CHOICES");
        String[] options = {"rock", "paper", "scissors"};
        String randomChoice = generateRandomChoice(options);
        //System.out.println("Random Choice: " + randomChoice);
        //int crnd=rnd.nextInt(4);
        boolean ans=false;
        int i=3;
        while(i>0)
        {
            String uch=ch.next();
            if((uch.equalsIgnoreCase("rock")&&randomChoice.equalsIgnoreCase("scissors"))||(uch.equalsIgnoreCase("scissors")&& randomChoice.equalsIgnoreCase("paper"))||(uch.equalsIgnoreCase("paper")&& randomChoice.equalsIgnoreCase("rock"))){
                ans=true;
                System.out.println("Your choice: "+uch+" System's Choice :"+randomChoice);
                break;
            }
            if((randomChoice.equalsIgnoreCase("rock") && uch.equalsIgnoreCase("scissors"))||(randomChoice.equalsIgnoreCase("paper")&& uch.equalsIgnoreCase("rock"))||(randomChoice.equalsIgnoreCase("scissors")&& uch.equalsIgnoreCase("paper"))){
                ans=false;
                System.out.println("Your choice: "+uch+" System's Choice :"+randomChoice);
                System.out.println("You Lost");
                System.out.printf("%d chances remaining",i-1);
            }
            if(uch.equalsIgnoreCase(randomChoice)){
                ans=false;
                System.out.println("Your choice: "+uch+" System's Choice :"+randomChoice);
                System.out.println("It's a Draw");
            }
            i--;
        }
        if(ans==false){
                       System.out.println("Better luck next time");
        }
        else{
            System.out.println("You have Won");
        }


        ch.close();
    }
    private static String generateRandomChoice(String[] options) {
        Random random = new Random();
        int randomIndex = random.nextInt(options.length);
        return options[randomIndex];
    }
}