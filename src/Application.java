import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        int counter_H = 0 ;
        int counter_M = 0 ;
        int counter_F = 0 ;
        int total_count = 0 ;

        String user_choice = "y" ;

        while (total_count <= 10 && user_choice.equals("y"))
        {
                Scanner input01 = new Scanner(System.in) ;
                System.out.print("Enter Course type : ");
                String user_answer = input01.nextLine().toLowerCase() ;

                if (user_answer.equals("h"))
               {
                  counter_H ++ ;
               }

               else if (user_answer.equals("m"))
               {
                   counter_M ++ ;
               }

               else if (user_answer.equals("f"))
               {
                   counter_F ++ ;
               }

               else
               {
                   System.out.println("Wrong input");
               }

               total_count = counter_F + counter_H + counter_M ;

               Scanner input02 = new Scanner(System.in) ;
               System.out.print("Want to do another registration ? (Y/N) ");
               user_choice = input02.nextLine().toLowerCase() ;

               if (! user_choice.equals("y") && ! user_choice.equals("n"))
               {
                   while (! user_choice.equals("y") && ! user_choice.equals("n"))
                   {
                       System.out.print("Want to do another registration (enter only (Y/N)) ?  ");
                       user_choice = input02.nextLine().toLowerCase() ;
                   }
               }
        }

        System.out.println("No. of students registered for Hospitality Management : " + counter_H) ;
        System.out.println("Registration fee : " + 1500*counter_H);
        System.out.println();

        System.out.println("No. of students registered for Marketing : " + counter_M) ;
        System.out.println("Registration fee : " + 2000*counter_M);
        System.out.println();

        System.out.println("No. of students registered for Diploma in Finance : " + counter_F) ;
        System.out.println("Registration fee : " + 2500*counter_F);
        System.out.println();

    }
}
