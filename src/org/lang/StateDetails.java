package org.lang;

public class StateDetails {
private void southIndia() {
System.out.println("South india major people speaks Tamil");
}
	private void northIndia() {
System.out.println("North india major people speaks Hindi");
	}
	public static void main(String[] args) {
		LanguageInfo a = new LanguageInfo();
		StateDetails b = new StateDetails();
		a.englishLanguage();
		a.hindiLanguage();
		b.northIndia();
		b.southIndia();
	}
	
}
