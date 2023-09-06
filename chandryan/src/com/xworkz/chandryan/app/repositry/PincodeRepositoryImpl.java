package com.xworkz.chandryan.app.repositry;

public class PincodeRepositoryImpl implements PincodeRepository {

	
	private int[] pincodes = new int[TOTAL_PINCODES];
	int position;

	@Override
	public void save(int pincode) {
		System.out.println("Invoking save in PincodeRepositoryImpl...");

		if (this.position < TOTAL_PINCODES) {
			this.pincodes[position] = pincode;
			System.out.println("Stored " + pincode + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store pincode...");
		}
	}

	@Override
	public boolean isExist(int pincode) {
		for (int start = 0; start < this.position; start++) {
			int temp = this.pincodes[start];
			if (temp == pincode) {
				System.err.println("Pincode " + pincode + " is already exist");
				return true;
			}
		}
		return false;
	}
}
