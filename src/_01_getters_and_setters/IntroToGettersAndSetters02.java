package _01_getters_and_setters;

public class IntroToGettersAndSetters02 {
String name;
String skill;

String getName() {
	return name;
}
String getSkill() {
	return skill;
}
void setName(String input) {
	name = input;
}
void setSkill(String input) {
	skill = input;
}
String toStringII() {
	return name + " has rad " + skill + " skills.";
}
}
