package com.study.collection;

import java.util.ArrayList;
import java.util.List;

class Point{
	private int x;
	private int y;
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}


public class ListElementReplace {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<Point>();
		Point point1 = new Point(1,1);
		pointList.add(point1);
		Point point2 = new Point(2,2);
		pointList.add(point2);
		Point point3 = new Point(3,3);
		pointList.add(point3);
		
		for(int i=0;i<pointList.size();i++){
			System.out.println("Point["+i+"]=("+pointList.get(i).getX()+","+pointList.get(i).getY()+")");
		}
		
		Point point4 = new Point(4,4);
		replaceElement(pointList,point2,point4);
		
		for(int i=0;i<pointList.size();i++){
			System.out.println("Point["+i+"]=("+pointList.get(i).getX()+","+pointList.get(i).getY()+")");
		}
	
		
	}

	private static void replaceElement(List<Point> pointList, Point currentPoint, Point targetPoint) {
		if(pointList.contains(currentPoint)){
			pointList.set(pointList.indexOf(currentPoint),targetPoint);
		}
	}

}
