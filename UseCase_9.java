/** The purpose of this class is to write out the program for Use
 * Case 9 of the project. This program is about staff
 * members being able to forbid (ban) users from using the application
 */
import java.util.Scanner;

public class Phase3_UseCase_9
{
   public static void main(String[] args)
   {
      User u = new User("09/09/1967", "Akshay Kumar", "male", 55, "rajivAkshayBollywood",
                                           "a8jfkid8207uKss91", "Indian-Canandian", 26272019573);
      getUserInfo(u.getUserName(), u.getUserID());
      boolean userBanned = banUser("rajivAkshayBollywood", "a8jfkid8207uKss91", 2);
      displayMessages(userBanned, 2);
   }

   /**
    * This function lets a staff member to ban a user
    * @param userName the username of the user
    * @param userID the ID of the user
    * @return true if the staff member bans the user, otherwise return false
    */
   public boolean banUser(String userName, String userID, int numViolations)
   {
       boolean userBanned = false;

       if(numViolations >= 1 && numViolations <= 3)
          userBanned = true;
       else
          userBanned = false;

       return userBanned;
   }

   /**
    * The getUserInfo function gets all the information of the user
    * by taking in the username and user ID to find the user in the database
    * @param userName username of the user
    * @param userID ID of the user
    * @return an arraylist of the user's information
    */
   public List<String> getUserInfo(String userName, String userID)
   {
      //String[] userInfo = new String[20];
      List<String> userInfo = new ArrayList<String>();

      userInfo.add(u.getDOB());
      userInfo.add(u.getFullName());
      userInfo.add(u.getGender());
      userInfo.add(String.valueOf(u.getAge()));
      userInfo.add(u.getUserName());
      userInfo.add(u.getUserID());
      userInfo.add(u.getEthnicity());
      userInfo.add(String.getValueOf(u.getSSN()));
      userInfo.add(String.getValueOf(u.getNumViolations()))

      return userInfo;
   }

   /** The displayMessages function displays messages for the staff member to read
    * @param userBanned the variable that determines if the user should be banned or not
    * @param numViolations the number of violations made by the user
    */
   public void displayMessages(boolean userBanned, int numViolations)
   {
      Scanner reader = new Scanner(System.in);

       if(userBanned == true)
       {
           if(numViolations == 1)
           {
              System.out.println("You cannot ban this user, but strongly warn them for account suspension");
              System.out.println("Please click \"Warn user of suspending their account\"");
           }
           else if(numViolations == 2)
           {
               System.out.println("The user's account will be suspended for a year, do you confirm your decision?");
               System.out.println("Please click \"Yes\" or  \"No\"");
           }
           else if(numViolations == 3)
           {
               System.out.println("The user's account will be permanently deleted, do you confirm your decision?");
               System.out.println("Please click \"Yes\" or  \"No\"");
           }
       }

       else
           System.out.println("Sorry, but the ban request could not be processed");
   }
}
