package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldPassFromInitialToHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet(5, 0, 0, 0, 0);
		// act
		int hunger = underTest.hunger;
		// assert
		Assert.assertEquals(5, hunger, 0);
	}

	@Test
	public void shouldPassFromInitialToThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 5, 0, 0, 0);
		// act
		int thirst = underTest.thirst;
		// assert
		Assert.assertEquals(5, thirst, 0);
	}

	@Test
	public void shouldPassFromInitialToWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 5, 0, 0);
		// act
		int waste = underTest.waste;
		// assert
		Assert.assertEquals(5, waste, 0);
	}

	@Test
	public void shouldPassFromInitialToBoredom() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 5, 0);
		// act
		int boredom = underTest.boredom;
		// assert
		Assert.assertEquals(5, boredom, 0);
	}

	@Test
	public void shouldPassFromInitialToTirdness() {
		// arrange
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 5);
		// act
		int tiredness = underTest.tiredness;
		// assert
		Assert.assertEquals(5, tiredness, 0);
	}
}