package com.example.livelock;

public class LiveLockExample {

	// Just Analyze

	public static void main(String[] args) {

		Police police = new Police();

		Criminal criminal = new Criminal();

		new Thread(new Runnable() {

			@Override
			public void run() {
				police.giveRansom(criminal);
			}

		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				criminal.releaseHostage(police);
			}

		}).start();
	}

}

class Police {

	private boolean moneySent = false;

	public void giveRansom(Criminal criminal) { // dar rescate

		while (!criminal.isHostageReleased()) {

			System.out.println("Police: waiting criminal to release hostage");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Police: sent money");

		this.moneySent = true;
	}

	public boolean isMoneySent() {
		return this.moneySent;
	}

}

class Criminal {

	private boolean hostageReleased = false;

	public void releaseHostage(Police police) { // liberar rehen

		while (!police.isMoneySent()) {

			System.out.println("Criminal: waiting police to give ransom");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Criminal: released hostage");

		this.hostageReleased = true;
	}

	public boolean isHostageReleased() {
		return this.hostageReleased;
	}
}
