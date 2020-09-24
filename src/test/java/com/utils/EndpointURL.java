package com.utils;

public enum EndpointURL {
	
	UsedCars("/v1/Categories/UsedCars.JSON"),
	Motorbikes("/v1/Categories.xml?mcat_path=/Trade-Me-Motors/Motorbikes/Motorbikes");
	
	
	String resourcePath;
	
	EndpointURL(String resourcePath){
		this.resourcePath=resourcePath;
	}
	
	public String getResourcePath() {
		return this.resourcePath;
	}
	
	public String getResourcePath(String data) {
		return this.resourcePath+data;
	}
public static void main(String[] args) {
	System.out.println(EndpointURL.UsedCars.getResourcePath());
	System.out.println(EndpointURL.Motorbikes.getResourcePath());
}

}
