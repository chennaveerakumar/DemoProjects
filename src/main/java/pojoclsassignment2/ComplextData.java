package pojoclsassignment2;

import java.util.List;

public class ComplextData {
  private List<Data> data;
  private List<Source> source;
   
public ComplextData() {}
public ComplextData(List<Data> data, List<Source> source) {
	super();
	this.data = data;
	this.source = source;
}
public List<Data> getData() {
	return data;
}
public void setData(List<Data> data) {
	this.data = data;
}
public List<Source> getSource() {
	return source;
}
public void setSource(List<Source> source) {
	this.source = source;
}
   
}
