import java.lang.Math;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        int max=100;
        int min=1;
        System.out.println("range is 1 to 100");
        int generated=(int)(Math.random()*(max-min+1)+min);
        System.out.println("WANT TO START THE GAME ?\nENTER 1 TO START THE GAME");
        System.out.println("YOU HAVE 5 CHANCES");
        Scanner scan =new Scanner(System.in);
        int stat=scan.nextInt();
        if(stat==0)
        {
            System.out.println("thank you");
        }
        else if(stat==1){
            int chance=5;
            do{
                System.out.println("enter number");
                int guessed=scan.nextInt();
                chance--;
                if(guessed<generated)
                {
                    System.out.println("little bigger");
                    System.out.println("you are left with chances of"+chance);
                    if(chance==0)
                    {
                        System.out.println("you lost");
                    }
                }
                else if(guessed>generated)
                {
                    System.out.println("little smaller");
                    System.out.println("you are left with chances of "+chance);
                    if(chance==0)
                    {
                        System.out.println("you lost");
                    }
                }
                else if(guessed==generated)
                {
                    System.out.println("you guessed the right number you won the game");break;
                }
                else{}
            }while(chance!=0);
        
        }
        else{
            System.out.println("invalid data");
        }
    }
       
    }
    

