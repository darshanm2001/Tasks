package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumbers {
	public static void main(String[] args) {
        Collection<Long> mobileNumbers = new ArrayList<>();
                mobileNumbers.add(9876543210L);
                mobileNumbers.add(8765432109L);
                mobileNumbers.add(7654321098L);
                mobileNumbers.add(6543210987L);
                mobileNumbers.add(5432109876L);
                mobileNumbers.add(9321092765L);
                mobileNumbers.add(8210945654L);
                mobileNumbers.add(8109833543L);
                mobileNumbers.add(7098788432L);
                mobileNumbers.add(9988745655L);
                mobileNumbers.add(8877678544L);
                mobileNumbers.add(7766577433L);
                mobileNumbers.add(6655455322L);
                mobileNumbers.add(9544348211L);
                mobileNumbers.add(8433248100L);
                mobileNumbers.add(7322177099L);
                mobileNumbers.add(7211088988L);
                mobileNumbers.add(8100977877L);
                mobileNumbers.add(8988777655L);
                mobileNumbers.add(8877664544L);
                mobileNumbers.add(7766552433L);
                mobileNumbers.add(6655483322L);
                mobileNumbers.add(9544332211L);
                mobileNumbers.add(9433251100L);
                mobileNumbers.add(9322110099L);
                mobileNumbers.add(9921179988L);
                mobileNumbers.add(9100998877L);
                mobileNumbers.add(9988776755L);
                mobileNumbers.add(8877668544L);
                mobileNumbers.add(8877868544L);
        System.out.println("Total mobile numbers: " + mobileNumbers.size());

        Iterator<Long> itr = mobileNumbers.iterator();
        while (itr.hasNext()) {
            Long mobileNumber = itr.next();
            System.out.println("Phone No:"+mobileNumber);
        }
    }
}

	

