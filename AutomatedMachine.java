public class AutomatedMachine
{
    public static String[] componentNameArray = {"CPU", "Motherboard", "GPU", "RAM"};
    public boolean isNameLengthZero(String name) {
        if (name.length() >= 1)
            return false;
        else
            return true;
    }
    public boolean isComponentNameLengthZero(String componentName) {
        if (componentName.length() >= 1)
            return false;
        else
            return true;
    }
    public boolean checkName(String name) {
        if (name.length() >= 1 && name.length() <= 20)
            return false;
        else
            return true;
    }
    public boolean checkComponentName(String componentName) {
        if (componentName.length() >= 1 && componentName.length() <= 15) {
            for (String component : componentNameArray) {
                if (component.equals(componentName)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public boolean checkRating(int rating) {
        if (rating > 0 && rating < 6) {
            return false;
        } else {
            return true;
        }
    }

    public String uploadSpec(String name, String componentName, int rating) {
        if (isNameLengthZero(name)) {
            return "Name length needs to be longer than 0";
        }

        if (isComponentNameLengthZero(componentName)) {
            return "Component length needs to be longer than 0";
        }

        if (checkName(name)) {
            return "Name Length does not satisfy amount requirement";
        }

        if (checkComponentName(componentName)) {
            return "Component Name Length does not satisfy amount requirement";
        }

        if (checkRating(rating)) {
            return "Ratings needs to be between 1 and 5";
        }

        //as all criteria has been satisfied, now we can safely say that
        // the registration of the incoming combo is successful.
        return "Upload Successful";
    }
}


