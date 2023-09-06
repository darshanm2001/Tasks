package com.xworkz.chandryan.app.repositry;

public class JuiceRepositryImpl implements JuiceRepositry {

	private String[] juices = new String[TOTAL_JUCIES];
	private int position = 0;

	@Override
	public void save(String Juicename) {
		// TODO Auto-generated method stub
		System.out.println("invoking store from" + this.getClass().getSimpleName());

		if (position < TOTAL_JUCIES) {
			this.juices[position] = Juicename;
			System.out.println("juice is" + Juicename + "store");
			this.position++;
		} else {
			System.out.println("data store is full,cannot be store");
		}

	}

	@Override
	public boolean isExist(String Juicename) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= this.position; i++) {
			String temp = this.juices[i];
			if (temp != null && temp.equals(Juicename)) {
				System.err.println("Juicename is already exist");
				return true;
			}
		}
		return false;
	}

}
