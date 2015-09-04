package com._3_4_.countdownlatch;

/**
 * 知道所有人到场之后，才开始会议
 * @author BeardedJ
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Videoconference conference = new Videoconference(10);
		Thread conferenceThread = new Thread(conference);
		conferenceThread.start();
		
		for(int i = 0; i < 10; i++){
			Participant p = new Participant(conference, "Participant "+i);
			Thread t = new Thread(p);
			t.start();
		}
	}
}
