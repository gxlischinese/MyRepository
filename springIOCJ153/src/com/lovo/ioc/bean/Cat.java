package com.lovo.ioc.bean;

/**
 * 猫
 * 
 * @author Administrator
 *
 */
public class Cat {
	public Cat(){};
    //名字
	private String catName;
	private int catAge;//年龄

	public Cat(String catName,int catAge){
		this.catName=catName;
		this.catAge=catAge;
	};
	public void eat(String food) {
		System.out.println(catName+"吃"+food);
	}
    /**
     * 猫名
     * @return 名
     */
	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
   /**
    * 猫的年龄
    * @return 年龄
    */
	public int getCatAge() {
		return catAge;
	}

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}

}
