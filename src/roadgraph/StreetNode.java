package roadgraph;

import geography.GeographicPoint;

/*
 * Class to store street information. The Start intersection is stored as
 * HashMap key in the AdjList in MapGraph.java. The value is a list of
 * StreetNodes which contain the end intersection and street information
 * like name, type and length.
 */
public class StreetNode {
	private GeographicPoint endStreet;
	private String street;
	private String roadType;
	private double length;
	
	public StreetNode(GeographicPoint to, String road, 
			String type, double length) {
		this.endStreet = to;
		this.street = road;
		this.roadType = type;
		this.length = length;
	}

	// No setters because they are not needed
	public GeographicPoint getEndStreet() {
		return endStreet;
	}

	public String getStreet() {
		return street;
	}
	public String getRoadType() {
		return roadType;
	}

	public double getLength() {
		return length;
	}	
}
