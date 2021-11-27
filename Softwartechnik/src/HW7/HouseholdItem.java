package HW7;

public interface HouseholdItem {

	void accept(Visitor v);

	String getName();

}
