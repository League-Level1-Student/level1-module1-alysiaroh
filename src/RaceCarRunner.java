

public class RaceCarRunner {
	public static void main() {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
RaceCar r = new RaceCar("kia", 5);
		// 2. Print the RaceCar's position in the race
System.out.println(r.positionInRace);
		// 3. Crash the RaceCar
r.crash();	
		// 4. If the car is damaged. Bring it in for a pit stop.
r.pit();
		// 5. Help the car move into first place
for(int i=0;i<5;i++) {
	r.overtake();
	System.out.println(r.positionInRace);
}
	}
}