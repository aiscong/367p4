

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
		throw new RuntimeException("constructor not implemented.");
	}

	@Override
	public long getStart(){
		//TODO Remove this exception and implement the method
		throw new RuntimeException("getStart() not implemented.");
	}

	@Override
	public long getEnd(){
		//TODO Remove this exception and implement the method
		throw new RuntimeException("getEnd() not implemented.");
	}

	public String getName() {
		//TODO Remove this exception and implement the method
		return 
	}

	public String getResource() {
		//TODO Remove this exception and implement the method
		throw new RuntimeException("getResource() not implemented.");	
	}
	
	public String getOrganization(){
		//TODO Remove this exception and implement the method
		throw new RuntimeException("getOrganization() not implemented.");
	}

	public String getDescription() {
		//TODO Remove this exception and implement the method
		throw new RuntimeException("getDescription() not implemented.");	
	}

	@Override
	public int compareTo(Interval i) {
		//TODO Remove this exception and implement the method
		throw new RuntimeException("compareTo() not implemented.");
	}
	
	
	public boolean equals(Event e) {
		//TODO Remove this exception and implement the method
		throw new RuntimeException("equals() not implemented.");
	}

	@Override
	public boolean overlap(Interval i) {
		//TODO Remove this exception and implement the method
		throw new RuntimeException("overlap() not implemented.");
	}
	
	@Override
	public String toString(){
		//TODO Remove this exception and implement the method
		throw new RuntimeException("toString() not implemented.");
	}
}