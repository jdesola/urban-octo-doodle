package com.techelevator.parks.dao.park;

import java.util.List;

public class ParkApiResponse {

	private String total;
	private String limit;
	private String start;
	
	private List<Park> data;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public List<Park> getData() {
		return data;
	}

	public void setData(List<Park> data) {
		this.data = data;
	}
	
	
	
}
