public class UC1
{
    public static final int MAX_WORD_LIMIT = 32;
    public static final int MAX_CHAR_LIMIT = 128;
    public static final String TEMP_URL = "TEMP.com";
    public static final String ERROR_EMPTY = "Empty Search";
    public static final String ERROR_CHAR = "Character limit reached";
    public static final String ERROR_WORD = "Word limit reached";

    public static String[] getSearchQueryArray(String argSearch)
    {
        return argSearch.split(" ");
    }

    public static boolean checkValidWordLimit(String[] argQuery)
    {
        if(argQuery.length>MAX_WORD_LIMIT)
            return false;
        return true;
    }

    public static boolean checkValidCharLimit(String[] argQuery)
    {
        for(int i=0;i<argQuery.length;i++)
            if(argQuery[i].length()>MAX_CHAR_LIMIT)
                return false;
        return true;
    }

    public static boolean checkEmptySearch(String[] argQuery)
    {
        if(argQuery.length==0)
            return true;
        return false;
    }

    /**
     * Checks for valid search, then provides URL to search
     * @param argSearch Initial user search
     * @return Either an Error message or a URL
     */
    public static String Search(String argSearch)
    {
        String[] argQuery=getSearchQueryArray(argSearch);
        if(checkEmptySearch(argQuery))
            return ERROR_EMPTY;
        if(!checkValidCharLimit(argQuery))
            return ERROR_CHAR;
        if(!checkValidWordLimit(argQuery))
            return ERROR_WORD;
        return TEMP_URL;
    }
}