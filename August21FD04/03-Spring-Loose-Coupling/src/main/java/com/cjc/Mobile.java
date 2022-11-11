package com.cjc;

public class Mobile {

	public Mobile() {
		System.out.println("Mobile :: Constructor");
	}
	private SIM sim;

	public Mobile(SIM sim) {
		super();
		this.sim = sim;
	}
	public void simOperation() {
		sim.calling();
		sim.browsing();
		sim.recharge();
	}
}
