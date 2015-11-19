

/**
 * Event represents events to be held in .
 */
public class Event implements Interval{
	//TODO add private data members
	private long start; 
	private long end;
	private String name;
	private String resource;
	private String organization;
	private String description;
	Event(long start, long end, String name, String resource, String organization, String description){
		//TODO Remove this exception and implement the method
		this.start = start;
		this.end = end;
		this.name = name;
		this.resource = resource;
		this.organization = organization;
		this.description = description;
	}

	@Override
	public long getStart(){
		//TODO Remove this exception and implement the method
		return start;
	}

	@Override
	public long getEnd(){
		//TODO Remove this exception and implement the method
		return end;
	}

	public String getName() {
		//TODO Remove this exception and implement the method
		return name;
	}

	public String getResource() {
		//TODO Remove this exception and implement the method
		return resource;
	}
	
	public String getOrganization(){
		//TODO Remove this exception and implement the method
		return organization;
	}

	public String getDescription() {
		//TODO Remove this exception and implement the method
		return description;
	}

	@Override
	public int compareTo(Interval i) {
		//TODO Remove this exception and implement the method
		return this.start < i.getStart() ? - : 1;
	}
	
	
	public boolean equals(Event e) {
		//TODO Remove this exception and implement the method
		return this.start == i.getStart();
	}

	@Override
	public boolean overlap(Interval i) {
		//TODO Remove this exception and implement the method
		return (this.start > i.getStart() && this.start < i.getEnd()) || 
		(i.getStart() > this.start && i.getStart() < this.end);
	}
	
	@Override
	public String toString(){
		//TODO Remove this exception and implement the method
		StringBuilder result = new StringBuilder();
		String nextLine = "\n";
		result.append(this.name);
		result.append(nextLine);
		result.append("By: ");
		result.append(this.organization);
		result.append(nextLine);
		result.append("In: ");
		result.append(this.resource);
		result.append(nextLine);
		result.append("Start: ");
		result.append(this.start);
		result.append(nextLine);
		result.append("End: ");
		result.append(this.end);
		result.append(nextLine);
		result.append("Description: ");
		result.append(this.description);
		result.append(nextLine); //may not need
		return result.toString();
	}
}