public class CourseAdmin
{
	private Date deadline;
	private boolean allowAccess;
	private ClassList cList;
	private Grouping groups;
	private SelfEval questions;
	
	public Date getDeadline()
	{
		return deadline;
	}
	public boolean getAllowAccess()
	{
		return allowAccess;
	}
	public ClassList getCList()
	{
		return cList;
	}
	public Grouping getGroups()
	{
		return groups;
	}
	public SelfEval getQuestions()
	{
		return questions;
	}
	
	public void setDate(Date deadline)
	{
		this.deadline = dealine;
	}
	public void setAllowAccess(boolean allowAccess)
	{
		this.allowAccess = allowAccess;
	}
	public void setCList(ClassList cList)
	{
		this.cList = cList;
	}
	public void setGroups(Grouping groups)
	{
		this.groups = groups;
	}
	public void setQuestions(SelfEval questions)
	{
		this.questions = questions;
	}
	
}