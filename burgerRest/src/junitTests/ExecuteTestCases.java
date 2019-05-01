package junitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({OrderTest.class, BeefBurgerTest.class, ChickenBurgerTest.class,
	CheeseBurgerTest.class, CocaColaDrinkTest.class, FrenchFriesTest.class,
	ItemTest.class})
public final class ExecuteTestCases {


}
