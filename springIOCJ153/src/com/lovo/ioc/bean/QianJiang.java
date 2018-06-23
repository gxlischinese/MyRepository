package com.lovo.ioc.bean;

/**
 * 钱江
 * 
 * @author Administrator
 *
 */
public class QianJiang {

	private Cat cat; // 钱江养的猫

	private String name;// 钱江
    /**
     * 钱江喂食（玩猫）
     * @param food
     */
	public void play(String food) {
		System.out.println(name+"正在喂猫");
		cat.eat(food);
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
