package pojoclsassignment2;

public class Data {
	private String ID_Nation;
	private String Nation;
	private String ID_Year;
	private String Year;
	private String Population;
    private String Slug_Nation;
    public Data() {}
public Data(String iD_Nation, String nation, String iD_Year, String year, String population, String slug_Nation) {
	super();
	ID_Nation = iD_Nation;
	Nation = nation;
	ID_Year = iD_Year;
	Year = year;
	Population = population;
	Slug_Nation = slug_Nation;
}
public String getID_Nation() {
	return ID_Nation;
}
public void setID_Nation(String iD_Nation) {
	ID_Nation = iD_Nation;
}
public String getNation() {
	return Nation;
}
public void setNation(String nation) {
	Nation = nation;
}
public String getID_Year() {
	return ID_Year;
}
public void setID_Year(String iD_Year) {
	ID_Year = iD_Year;
}
public String getYear() {
	return Year;
}
public void setYear(String year) {
	Year = year;
}
public String getPopulation() {
	return Population;
}
public void setPopulation(String population) {
	Population = population;
}
public String getSlug_Nation() {
	return Slug_Nation;
}
public void setSlug_Nation(String slug_Nation) {
	Slug_Nation = slug_Nation;
}
   
   
}
