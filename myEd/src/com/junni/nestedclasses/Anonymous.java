package com.junni.nestedclasses;

public class Anonymous {

	RemoConEx fieldRemoConEx = new RemoConEx() {

		@Override
		public void setOn() {
			// TODO Auto-generated method stub
			System.out.println("Anonymouse field TV Set On");

		}

		@Override
		public void setOff() {
			// TODO Auto-generated method stub

			System.out.println("Anonymous field TV Set Off");

		}
	};

	void method01() {
		RemoConEx localRemoConEx = new RemoConEx() {

			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set Off");

			}

			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous local Radio Set On");

			}
		};
		localRemoConEx.setOn();
	}
	
	void method02(RemoConEx remoConEx) {
		remoConEx.setOn();
	}

}
