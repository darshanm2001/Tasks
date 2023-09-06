package com.xworkz.chandryan.app.service;

import com.xworkz.chandryan.app.repositry.JuiceRepositry;

public class JuiceServiceImpl implements JuiceService {

	private JuiceRepositry juiceRepositry;

	public JuiceServiceImpl(JuiceRepositry juiceRepositry) {
		this.juiceRepositry = juiceRepositry;
	}

	public boolean validateAndSave(String Juicename) {
		System.out.println("invoking validateandsave in " + this.getClass().getSimpleName());
		if (Juicename != null && !Juicename.isEmpty() && Juicename.length() >= 3 && Juicename.length() <= 20) {
			System.out.println("juice addingg will save using repo...");
			if (!this.juiceRepositry.isExist(Juicename)) {
				this.juiceRepositry.save(Juicename);
				return true;
			} else {
				System.err.println("juice name is already exist,insert other");
			}
		} else {
			System.err.println("juice is invalid ,cannot save" + Juicename + " already exist");
		}
		this.juiceRepositry.save(Juicename);

		return false;
	}

}
