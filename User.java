//This class contains information of the user

public class User
{
    private String DOB;   //Date of birth
    private String fullName;
    private String gender;
    private int age;
    private String userName;
    private String userID;
    private String ethnicity;
    private int SSN;        //Social security number
    private int numViolations;

    public User(String DOB, String fullName, String gender, int age, String userName,
                                                      String userID, String ethnicity, int SSN, int numViolations)
    {
        this.DOB = DOB;
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.userName = userName;
        this.userID = userID;
        this.ethnicity = ethnicity;
        this.SSN = SSN;
        this.numViolations = numViolations;
    }

    public String getDOB()
    {
        return DOB;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public String getUserName()
    {
        return userName;
    }
    public String getUserID()
    {
        return userID;
    }

    public String getEthnicity()
    {
        return ethnicity;
    }

    public int getSSN()
    {
        return SSN;
    }

    public int getNumViolations()
    {
        return numViolations;
    }
}
