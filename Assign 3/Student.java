public class Student
{
	private int ID;
	private String name;
	private ArrayList<Course> history;
	private Schedule availability;
	private ArrayList<Preference> prefs;
	
	public Student(int ID, String name, ArrayList<Course> history, Schedule availability, ArrayList<Preference> prefs)
	{
		this.ID = ID;
		this.name = name;
		this.history = history;
		this.availability = availavility;
		this.prefs = prefs;
	}
	
	public int getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<Course> getHistory()
	{
		return history;
	}
	public Schedule getAvailability()
	{
		return availability;
	}
	public ArrayList<Preference> getPrefs()
	{
		return prefs;
	}
	public void setID(int newID)
	{
		ID = newID;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setHistory(ArrayList<Course> newHistory)
	{
		history = newHistory;
	}
	public void setSchedule(Schedule newAvail)
	{
		availability = newAvail;
	}
	public void setPrefs(ArrayList<Preference> newPrefs)
	{
		prefs = newPrefs;
	}
}