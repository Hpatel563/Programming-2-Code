package n01393134_Assignment3;

public class Article
{
	
	//properties:
	// article name
	private String articleName;
	//author name
	private String authorName;
	//date published
	private int dayPublished;
	private int monthPublished;
	private int yearPublished;
	// number of pages
	private int numPages;
	//description
	private String description;

	
	public void setarticleName(String newarticleName)
	{
		articleName = newarticleName;
	}//end function
	
	public void setauthorName(String newauthorName)
	{
		authorName = newauthorName;
	}//end function
	public void setdayPublished(int newdayPublished)
	{
		dayPublished = newdayPublished;
	}//end function
	public void setmonthPublished(int newMonthPublished)
	{
		monthPublished = newMonthPublished;
	}//end function
	public void setyearPublished(int newYearPublished)
	{
		yearPublished = newYearPublished;
	}//end function
	public void setnumPages (int newNumPages)
	{
		numPages = newNumPages;
	}//end function
	public void setdescription (String newDescription)
	{
		description = newDescription;
	}//end function
	/////////////////////////// getters
	
	
	public String getArticleName()
	{
		return articleName;
	}//end
	
	public String getAuthorName()
	{
		return authorName;
	}//end
	public int getdayPublished()
	{
		return dayPublished;
	}//end
	public int getyearPublished()
	{
		return yearPublished;
	}//end
	public int getmonthPublished()
	{
		return monthPublished;
	}//end
	public int getnumPages()
	{
		return numPages;
	}//end
	public String getDescription()
	{
		return description;
	}//end

	
	

}
