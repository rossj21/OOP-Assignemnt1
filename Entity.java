
public class Entity {

	private String name;
	private Date born; 
	
	public Entity() {
		name = "";						   //Name is null
		born = new Date("June", 20, 1998); //Give random date to store, used my bday
		
	}
	//Initialize Constructor
	public Entity(String entName, String strBorn) {
		name = entName;
		born = new Date(strBorn);
	}
	public Entity(String entName, int month, int day, int year) {
		name = entName;
		born = new Date(month, day, year);
	}
		
	//Initialize Constructor
	public Entity(String entName, String month, int day, int year) {
		name = entName;
		born = new Date(month, day, year);
	}
	
	public Entity(String entName, Date bDate) {
		name =  entName;
		born = new Date(bDate);
	}
	
	public void setName(String entName) {
		this.name = entName;
	}
	
	public void setEntity(String entName, String month, int day, int year) {
		this.name = entName;
		this.born = new Date(month, day, year);
	}
	
	public String getName() {
		return name;
	}
	
	public Date getBorn() {
		return new Date(born);
	}
	
	public String toString(String entName, Date bDate) {
		return (this.name + ", is born on " + this.born);
	}
	
	public Boolean nameEquals(Entity entity) {
		String entName = entity.getName();
		if(entName.equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean bornEquals(Entity entity) {
		Date bDate = entity.born;
		int month = bDate.getMonth();
		int day = bDate.getDay();
		int year = bDate.getYear();
		
		if(month == this.born.getMonth() && day == this.born.getDay() && year == this.born.getYear()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean equals(Entity entity) {
		Boolean nameBoolean = entity.nameEquals(this);
		Boolean bornBoolean = entity.bornEquals(this);
		
		if(nameBoolean && bornBoolean == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
