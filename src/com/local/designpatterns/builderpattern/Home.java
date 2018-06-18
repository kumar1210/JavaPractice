/**
 * 
 */
package com.local.designpatterns.builderpattern;

/**
 * @author gaurav's
 * <p> Basic complex object, which properties need to
 *  be set in the concrete builder classes.
 *
 */
public class Home {

	private String wallType;
	private String gateType;
	private String homeColor;
	private String kitchenType;
	
	/**
	 * @param wallType the wallType to set
	 */
	public void setWallType(String wallType) {
		this.wallType = wallType;
	}
	/**
	 * @param gateType the gateType to set
	 */
	public void setGateType(String gateType) {
		this.gateType = gateType;
	}
	/**
	 * @param homeColor the homeColor to set
	 */
	public void setHomeColor(String homeColor) {
		this.homeColor = homeColor;
	}
	/**
	 * @param kitchenType the kitchenType to set
	 */
	public void setKitchenType(String kitchenType) {
		this.kitchenType = kitchenType;
	}
	
	/**
	 * @return the wallType
	 */
	public String getWallType() {
		return wallType;
	}
	/**
	 * @return the gateType
	 */
	public String getGateType() {
		return gateType;
	}
	/**
	 * @return the homeColor
	 */
	public String getHomeColor() {
		return homeColor;
	}
	/**
	 * @return the kitchenType
	 */
	public String getKitchenType() {
		return kitchenType;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WallType : "+wallType+", GateType : "+gateType+", ColourType : "+homeColor +", KitchenType : "+kitchenType;
	}
	
	
}
