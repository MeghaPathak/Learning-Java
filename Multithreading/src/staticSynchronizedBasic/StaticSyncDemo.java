package staticSynchronizedBasic;

import synchronizedBasic.SyncMyThread;

public class StaticSyncDemo {
	public static void main(String arg[]) {
		StaticSyncDisplay d1 = new StaticSyncDisplay();
		StaticSyncDisplay d2 = new StaticSyncDisplay();
		StaticSyncMyThread t1 = new StaticSyncMyThread(d1, "Megha");
		StaticSyncMyThread t2 = new StaticSyncMyThread(d2, "Aman");
		t1.start();
		t2.start();

	}
}

/*
 * First : Please read what happens in observationDemo class in synchronized basic. 
 * There we saw that output is irregular when two different threads access two different resource and same sync methiod.
 * NOW : In order to make it regular, we introduce static synchronization that applies a CLASS LEVEL LOCK. 
 * A thread thus now has to acquire two locks :
 * 1. Object level lock for the resource access  And Class level lock for the sync method access.
 * Thus we would see that now the o/p will be regular.
 * 
 */