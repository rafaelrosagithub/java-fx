module TesteAutoConecta {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.gov.sc.saude.testautoconecta to javafx.graphics, javafx.fxml;
}
