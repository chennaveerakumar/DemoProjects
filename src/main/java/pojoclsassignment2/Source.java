package pojoclsassignment2;



public class Source {
	private Annotations annotations;
	private String name;
	public Source() {super();}
	public Source(Annotations annotations, String name) {
		super();
		this.annotations = annotations;
		this.name = name;
	}
	public Annotations getAnnotations() {
		return annotations;
	}
	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
