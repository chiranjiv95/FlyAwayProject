package model;

public abstract class Search {

    public static String date;
    public static String day;
    public static String source;
    public static String destination;
    public static int persons;

    public String query="Select * FROM flight WHERE source="+source+"AND destination="+destination+"AND days="+day;
    
    public static String getQuery() {
        return "SELECT * FROM flight WHERE source = '"+source+"' AND destination='"+destination+"'";
    	//(wrong syntax): return "Select * FROM flight WHERE source="+source+"AND destination="+destination+"AND days="+day;
    }
}
